package it.cedacri.exchange.topic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class TopicPublisher {
    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        String message = "Test Topic Exchange";
        try(Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
            //Exchange name, route, properties, message in byte[]
            channel.basicPublish("Topic-Exchange", "tv.mobile.ac", null, message.getBytes(StandardCharsets.UTF_8));
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
