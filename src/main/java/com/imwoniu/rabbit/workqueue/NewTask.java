package com.imwoniu.rabbit.workqueue;

import com.rabbitmq.client.ConnectionFactory;

/**
 * Created by Work on 2016/3/10.
 */
public class NewTask {

    private static final String TASK_QUEUE_NAME = "task_queue";

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("test");
        factory.setPassword("test");
    }

}
