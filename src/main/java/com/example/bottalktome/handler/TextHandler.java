package com.example.bottalktome.handler;

import com.example.bottalktome.keyboard.InlineKeyboard;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;

public class TextHandler implements Handler{
    private final TelegramBot telegramBot;

    public TextHandler(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @Override
    public void handle(Update update) {
        Message message = update.message();
        Long chatId = update.message().from().id();
        String text = message.text();
        InlineKeyboard inlineKeyboard = new InlineKeyboard(telegramBot);

        if ("/start".equals(text)) {
            inlineKeyboard.chooseStartMenu(chatId);
        }
    }
}
