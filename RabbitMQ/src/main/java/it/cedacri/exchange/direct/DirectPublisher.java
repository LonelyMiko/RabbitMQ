package it.cedacri.exchange.direct;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

public class DirectPublisher {
    public static void main(String[] args) {
        Map<String, String> messages = new HashMap<>();
        messages.put("mobile","This is message for mobile route");
        messages.put("tv","This is message for tv route");
        messages.put("ac","This is message for ac route");
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
            for (Map.Entry<String, String> entry : messages.entrySet()) {
                String route = entry.getKey();
                String message = entry.getValue();
                //Exchange name, route, properties, message in byte[]
                channel.basicPublish("Direct-Exchange", route, null, message.getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
