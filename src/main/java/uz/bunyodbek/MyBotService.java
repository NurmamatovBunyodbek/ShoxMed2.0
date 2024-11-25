package uz.bunyodbek;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {

    // tilni tanlash

    public SendMessage kirish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Xush kelibsiz");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("O'zbek tili");
        button.setCallbackData("ozbekId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Rus tili");
        button.setCallbackData("rusId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("English tili");
        button.setCallbackData("englishId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage menu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("ShoxMed kartasi");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

    public SendMessage shoxMedMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Tafsilotlar");
        button.setCallbackData("tafsilotId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Elektron karta");
        button.setCallbackData("elektronId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish");
        button.setCallbackData("qaytishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }


}
