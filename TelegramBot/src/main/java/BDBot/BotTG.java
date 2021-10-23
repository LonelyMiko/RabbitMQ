package BDBot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import java.util.concurrent.ThreadLocalRandom;

public class BotTG extends TelegramLongPollingBot {
    ManageUsers manageUsers = new ManageUsers();

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if (message != null && message.hasText())
        {
            if ("/iq".equals(message.getText())) {
                String userID = update.getMessage().getFrom().getId().toString();
                Integer userIQ = ThreadLocalRandom.current().nextInt(-10,10);
                manageUsers.runDB();
                manageUsers.addUser(userID,userIQ);
                sendMsg(message, userID);
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "Test Bot";
    }

    @Override
    public String getBotToken() {
        return "1685512559:AAH23wWOw_0MhxaWEcHeU6mjK0vP0ve1hNY";
    }

    public void sendMsg(Message message, String text)
    {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            sendMsg(message,"ERROR");
            e.printStackTrace();
        }
    }
}
