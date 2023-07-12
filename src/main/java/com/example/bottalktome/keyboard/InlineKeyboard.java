package com.example.bottalktome.keyboard;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.request.SendMessage;

public class InlineKeyboard {
    private final TelegramBot telegramBot;

    public InlineKeyboard(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    public void chooseStartMenu(Long chatId) {
        String text = "Привет";
        InlineKeyboardButton button1 = new InlineKeyboardButton("Кнопка 1");
        button1.callbackData(Button.button1);
        InlineKeyboardButton button2 = new InlineKeyboardButton("Кнопка 2");
        button2.callbackData(Button.button2);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.addRow(button1, button2);
        SendMessage sendMessage = new SendMessage(chatId, text).replyMarkup(inlineKeyboardMarkup);
        telegramBot.execute(sendMessage);
    }
}
