import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Scanner;

public class simpleBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        // TODO
        //System.out.println(update.getMessage().getText());
        System.out.print(update.getMessage().getFrom().getFirstName() + ":" + update.getMessage().getText());

        String command = update.getMessage().getText();


        if (command.contains("Həzi")) {

            String message = "";
            Scanner sc = new Scanner(System.in);
            String asd =sc.nextLine();

            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(asd);
            try {
                execute(response);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        if (command.equals("özünsən")||command.equals("peysərsən")||command.equals("peysədə varsan")) {

            String message = "ozunsen";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);
            try {
                execute(response);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        // TODO
        return "DahaCoxBot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "5344756418:AAFFKZbCHBuXgRrlF4orD9EqznDpNPaZSag";
    }
}
