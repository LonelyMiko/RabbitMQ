package it.cedacri.exchange.topic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;

public class TopicConsumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        String todayDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        DeliverCallback deliverCallback = (consumerTag, delivery) ->{
            String message = new String(delivery.getBody());
            if (!message.trim().isEmpty()) {
                System.out.println("[" + todayDate + "] " + "[✔] New message from the TopicPublisher : " + message);
            } else {
                System.out.println("[" + todayDate + "] " + "[✖] Cannot get message from the TopicPublisher");
            }
        };
        for (String route : Arrays.asList("TV","Mobile", "AC")) {
            channel.basicConsume(route, true, deliverCallback, consumerTag -> {
            });
        }
    }
}
