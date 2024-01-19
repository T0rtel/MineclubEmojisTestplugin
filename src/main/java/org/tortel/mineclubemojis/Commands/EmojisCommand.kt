package org.tortel.mineclubemojis.Commands

import net.md_5.bungee.api.chat.HoverEvent
import net.md_5.bungee.api.chat.TextComponent
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.tortel.mineclubemojis.EmojiUnicode.EmojiUnicode

class EmojisCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) return false
        var Text = TextComponent("Emojis: ")
        val emojiTable = EmojiUnicode.module.emojiTable
        for (thing in emojiTable){
            val newtext = TextComponent(thing.value + " ")
            newtext.hoverEvent = HoverEvent(HoverEvent.Action.SHOW_TEXT, arrayOf(TextComponent(*TextComponent.fromLegacyText(thing.key))))

            Text.addExtra(newtext)
        }
        sender.sendMessage(Text)




        return false
    }
}