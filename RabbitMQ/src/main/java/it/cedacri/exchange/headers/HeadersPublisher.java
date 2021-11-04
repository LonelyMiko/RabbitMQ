package it.cedacri.exchange.headers;


import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

public class HeadersPublisher {
    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        String message = "Test Headers Exchange";
        Map<String, Object> headers = new HashMap<>();
        headers.put("item1","mobile");
        headers.put("item2", "television");

        BasicProperties basicProperties = new BasicProperties().builder().headers(headers).build();
        try(Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
            //Exchange name, route, properties, message in byte[]
            channel.basicPublish("Headers-Exchange", "", basicProperties, message.getBytes(StandardCharsets.UTF_8));
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
