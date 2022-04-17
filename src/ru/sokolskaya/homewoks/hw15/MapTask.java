package ru.sokolskaya.homewoks.hw15;

import java.util.*;

public class MapTask {

    public static List<String> getLogins(Map<String, String> map, String string) {
        List<String> logins = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equalsIgnoreCase(string)) logins.add(pair.getKey());
        }
        return logins;
    }

    public static Map<String, Integer> getRepeatingWords(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                map.replace(s, map.get(s) + 1);
            } else map.put(s, 1);
        }
        return map;
    }

    public static Map<String, Customer> filterByAge(Map<String, Customer> map, int from, int to) {
        Map<String, Customer> filteredMap = new HashMap<>();
        for (Map.Entry<String, Customer> pair : map.entrySet()) {
            if (pair.getValue().getAge() >= from && pair.getValue().getAge() < to) {
                filteredMap.put(pair.getKey(), pair.getValue());
            }
        }
        return filteredMap;
    }

    public static void main(String[] args) {
        // TODO:: написать статический метод, который принимает на вход мапу (firstTaskMap) и город (city)
        //  и формирует список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");
        String city = "Тверь";

        System.out.println(getLogins(firstTaskMap, city));


        // TODO:: дан список слов (words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов
        //  в мапе вида Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println(getRepeatingWords(words));


        // TODO:: дана мапа (customerMap).
        //  Написать статический метод, который принимает на вход агрументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        System.out.println(filterByAge(customerMap, 20, 68));


        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту
        //  встречаемости данного слова в тексте
        //  2. написать метод, который собирает все слова в группы
        //  по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  3. написать метод, который выводит в консоль топ 10 самых частых слов

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        // Map<String, Long>,
        // где - ключи (String) - слово,
        // значения (Long) - частота встречаемости
        // ArrayList<Map.Entry<String, Long>>
        // отсортировать список по Long с помощью компаратора

        System.out.println(wordFrequency(text, "tHe"));
        System.out.println(groupingWords(text));
        topTenWords(text);

    }

    public static int wordFrequency(String text, String word) {
        List<String> words = Arrays.asList(text.toLowerCase().split(" "));
        Map<String, Integer> wordsMap = getRepeatingWords(words);
        return wordsMap.get(word.toLowerCase());
    }

    public static Map<Integer, List<String>> groupingWords(String text) {
        HashSet<String> words = new HashSet<>(Arrays.asList(text.toLowerCase().split(" ")));
        Map<Integer, List<String>> groupingWordsMap = new HashMap<>();
        for (String word : words) {
            if (groupingWordsMap.containsKey(word.length())) {
                List<String> mapList = groupingWordsMap.get(word.length());
                mapList.add(word);
                groupingWordsMap.replace(word.length(), mapList);
            } else {
                List<String> mapList = new ArrayList<>();
                mapList.add(word);
                groupingWordsMap.put(word.length(), mapList);
            }
        }
        return groupingWordsMap;
    }

    public static void topTenWords(String text){
        List<String> words = Arrays.asList(text.toLowerCase().split(" "));
        Map<String, Integer> wordsMap = getRepeatingWords(words);
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : wordsMap.entrySet()) {
            list.add(pair);
        }
        Comparator<Map.Entry<String,Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        };
        list.sort(comparator);
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i).getKey());
        }
       // System.out.println(list);
    }
}