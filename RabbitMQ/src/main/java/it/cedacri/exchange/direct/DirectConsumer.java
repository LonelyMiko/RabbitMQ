package it.cedacri.exchange.direct;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

public class DirectConsumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        String todayDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        Map<String, String> messages = new HashMap<>();
        messages.put("mobile","This is message for mobile route");
        messages.put("tv","This is message for tv route");
        messages.put("ac","This is message for ac route");

        DeliverCallback deliverCallback = (consumerTag, delivery) ->{
            String message = new String(delivery.getBody());
            if (!message.trim().isEmpty()) {
                System.out.println("[" + todayDate + "] " + "[✔] New message from the DirectPublisher: " + message);
            } else {
                System.out.println("[" + todayDate + "] " + "[✖] Cannot get message from the DirectPublisher");
            }
        };
        for (String route : messages.keySet()) {
            channel.basicConsume(route, true, deliverCallback, consumerTag -> {
            });
        }
    }
}
