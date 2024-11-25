package uz.bunyodbek;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    private MyBotService myBotService = new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();// kim yozganini bilish
            String text = update.getMessage().getText();// qanaqa text yozgani

            if (text.equals("/start")) {
                try {
                    execute(myBotService.kirish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("ShoxMed kartasi")) {
                try {
                    execute(myBotService.shoxMedMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        } else if (update.hasCallbackQuery()) {

            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();

            Long chatId = callbackQuery.getMessage().getChatId();
            if (data.equals("ozbekId")) {
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        }


    }

    @Override
    public String getBotUsername() {
        return "sinf11a2024Bot";
    }

    @Override
    public String getBotToken() {
        return "8031003687:AAGCrGHuaGRV45u9cMb3W2ZTVuV0J9P84hk";
    }
}
