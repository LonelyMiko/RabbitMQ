package it.cedacri.realtime;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class RealTimeExample {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("from_date","05/01/2019");
        jsonObject.put("to_date","31/12/2019");
        jsonObject.put("email","example@example.com");
        jsonObject.put("query","select * from data");
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
            channel.basicPublish("","Queue-1",null,jsonObject.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
