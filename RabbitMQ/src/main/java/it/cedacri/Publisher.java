package it.cedacri;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class Publisher {
    public static void main(String[] args) {
        String[] messages = {"Hello RabbitMQ","Hello World","Try this message","Lorem Ipsum",""};
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
            for (String message : messages) {
                channel.basicPublish("", "Queue-1", null, message.getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
