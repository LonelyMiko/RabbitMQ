package YTBot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class BotTG extends TelegramLongPollingBot {
        Random random = new Random();
        Orar orar = new Orar();
        @Override
        public void onUpdateReceived(Update update) {
            Message message = update.getMessage();
            if (message != null && message.hasText())
            {
                switch (message.getText())
                {
                    case "/help":
                        sendMsg(message,"This bot is useless, but it has some features, to see all the features use /commands");
                        break;
                    case "/commands@miko_test_bot":
                    case "/commands":
                        sendMsg(message,"/commands - This command displays all commands of this bot" +
                                "\n /orar - This command displays schedules for I1901" +
                                "\n /iq - Test your intelligence");
                        break;
                    case "/orar":
                    case "/orar@miko_test_bot":
                            sendMsg(message,"/orarLuni" +
                                    "\n/orarMarti" +
                                    "\n/orarMiercuri" +
                                    "\n/orarJoi" +
                                    "\n/orarVineri");
                        break;

                        //TODO REFACTOR CODE, IS UGLY
                        case "/orarLuni":
                        case "/orarLuni@miko_test_bot":
                        sendMsg(message,orar.getOrar("Luni"));
                        break;

                    case "/orarMarti":
                    case "/orarMarti@miko_test_bot":
                        sendMsg(message,orar.getOrar("Marti"));
                        break;

                    case "/orarMiercuri":
                    case "/orarMiercuri@miko_test_bot":
                        sendMsg(message,orar.getOrar("Miercuri"));
                        break;

                    case "/orarJoi":
                    case "/orarJoi@miko_test_bot":
                        sendMsg(message,orar.getOrar("Joi"));
                        break;

                    case "/orarVineri":
                    case "/orarVineri@miko_test_bot":
                        sendMsg(message,orar.getOrar("Vineri"));
                        break;

                    case "/iq":
                    case "/iq@miko_test_bot":
                        int x = (int) (random.nextInt(163)+random.nextInt(37)/(Math.PI + random.nextInt(2))-random.nextInt(22));
                        String iq = String.valueOf(x);
                        String firstName = update.getMessage().getChat().getUserName();
                        sendMsg(message, "Your IQ is: " + iq);
                        break;

                    default:
                        sendMsg(message,"/commands");
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

        public void sendMsg(Message message,String text)
        {
            SendMessage sendMessage = new SendMessage();
            sendMessage.enableMarkdown(true);
            sendMessage.setChatId(message.getChatId());
            sendMessage.setReplyToMessageId(message.getMessageId());
            sendMessage.setText(text);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

        public void setButtons(SendMessage sendMessage)
        {
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup(); // cream keybord
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(true);

            List<KeyboardRow> keyboardRowList = new ArrayList<>(); // cream buttoanele
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add(new KeyboardButton("Luni"));
            keyboardFirstRow.add(new KeyboardButton("Marti"));
            keyboardFirstRow.add(new KeyboardButton("Miercuri"));



            keyboardRowList.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);

        }
    }
