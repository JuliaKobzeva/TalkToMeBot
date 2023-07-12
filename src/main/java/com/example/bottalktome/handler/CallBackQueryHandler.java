package com.example.bottalktome.handler;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;

public class CallBackQueryHandler implements Handler{
    private final TelegramBot telegramBot;

    public CallBackQueryHandler(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @Override
    public void handle(Update update) {

    }
}
