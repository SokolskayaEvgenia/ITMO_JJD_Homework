package ru.sokolskaya.homewoks.hw14;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        for (MessagePriority priority : MessagePriority.values()) {
            int messages = 0;
            for (Message message : messageList) {
                if (message.getPriority() == priority) {
                    messages += 1;
                }
            }
            System.out.println(priority.name() + ": " + messages + " messages");
        }
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль

        List<Integer> codes = new ArrayList<>();
        for (Message message : messageList) {
            if (!codes.contains(message.getCode())) {
                codes.add(message.getCode());
            }
        }
        for (Integer code : codes) {
            int messages = 0;
            for (Message message : messageList) {
                if (message.getCode() == code) {
                    messages += 1;
                }
            }
            System.out.println("code " + code + ": " + messages + " messages");
        }
    }


    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль

        int count = 0;
        Iterator<Message> iterator = messageList.listIterator();
        for (Message message : messageList) {
            while (iterator.hasNext()){
                if(!iterator.next().equals(message)){
                    count+=1;
                }
            }
        }
        System.out.println("Unique: " + count + " messages");
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return null;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
    }

}