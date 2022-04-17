package ru.sokolskaya.homewoks.hw14;

import javax.imageio.ImageTranscoder;
import java.lang.reflect.Array;
import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль

        int low = 0, medium = 0, high = 0, urgent = 0;
        for (Message message : messageList) {
            switch (message.getPriority()){
                case LOW:
                    low+=1;
                    break;
                case MEDIUM:
                    medium+=1;
                    break;
                case HIGH:
                    high+=1;
                    break;
                case URGENT:
                    urgent+=1;
                    break;
            }
        }
        System.out.println(MessagePriority.LOW.name() +": " + low + " messages");
        System.out.println(MessagePriority.MEDIUM.name() +": " + medium + " messages");
        System.out.println(MessagePriority.HIGH.name() +": " + high + " messages");
        System.out.println(MessagePriority.URGENT.name() +": " + urgent + " messages");
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль

        int[] counts = new int[10];
        for (Message message : messageList) {
            counts[message.getCode()] += 1;
        }
        for (int i = 0; i< counts.length; i++) {
            System.out.println("code " + i + ": " + counts[i] + " messages");
        }

//        List<Integer> codes = new ArrayList<>();
//        for (Message message : messageList) {
//            if (!codes.contains(message.getCode())) {
//                codes.add(message.getCode());
//            }
//        }
//        for (Integer code : codes) {
//            int messages = 0;
//            for (Message message : messageList) {
//                if (message.getCode() == code) {
//                    messages += 1;
//                }
//            }
//            System.out.println("code " + code + ": " + messages + " messages");
//        }
    }


    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль

        System.out.println("Unique messages: " + new HashSet<>(messageList).size());
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]

        return new ArrayList<>(new LinkedHashSet<>(messageList));
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления

        System.out.println("Before: " + messageList);
        Iterator<Message> messageIterator = messageList.listIterator();
        while (messageIterator.hasNext()){
            if(messageIterator.next().getPriority() == priority){
                messageIterator.remove();
            }
        }
        System.out.println("After: " + messageList);
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления

        System.out.println("Before: " + messageList);
        Iterator<Message> messageIterator = messageList.listIterator();
        while (messageIterator.hasNext()){
            if(messageIterator.next().getPriority() != priority){
                messageIterator.remove();
            }
        }
        System.out.println("After: " + messageList);
    }
}