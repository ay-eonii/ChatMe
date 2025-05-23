package me.chat.message.api.request

import me.chat.message.domain.entity.ChatMessage

data class ChatRequest(
    val content: String,
    val sender: String
) {
    fun toChatMessage(): ChatMessage {
        return ChatMessage(
            content = this.content,
            sender = this.sender
        )
    }
}
