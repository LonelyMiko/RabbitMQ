package it.cedacri;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class Publisher {
    public static void main(String[] args) throws IOException, TimeoutException {
        final ConnectionFactory factory = new ConnectionFactory();
        final String message = "Hello RabbitMQ";
        try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
            channel.basicPublish("", "Queue-1", null, message.getBytes(StandardCharsets.UTF_8));
        }
    }
}
