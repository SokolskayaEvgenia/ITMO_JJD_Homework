package ru.sokolskaya.homewoks.hw17.pupils;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PupilTask {
    public static void main(String[] args) {


        List<Pupil> pupils = new ArrayList<>(Arrays.asList(
                new Pupil(1, "Женя", Pupil.Gender.MALE, LocalDate.now().minusYears(10)),
                new Pupil(2, "Олег", Pupil.Gender.MALE, LocalDate.now().minusYears(7)),
                new Pupil(3, "Алена", Pupil.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Pupil(4, "Иван", Pupil.Gender.MALE, LocalDate.now().minusYears(12)),
                new Pupil(5, "Алексей", Pupil.Gender.MALE, LocalDate.now().minusYears(9)),
                new Pupil(6, "Петр", Pupil.Gender.MALE, LocalDate.now().minusYears(9)),
                new Pupil(7, "Иван", Pupil.Gender.MALE, LocalDate.now().minusYears(17)),
                new Pupil(8, "Петр", Pupil.Gender.MALE, LocalDate.now().minusYears(5)),
                new Pupil(9, "Алена", Pupil.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Pupil(10, "Алена", Pupil.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Pupil(11, "Григорий", Pupil.Gender.MALE, LocalDate.now().minusYears(7)),
                new Pupil(12, "Ирина", Pupil.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        // TODO: Используя Stream API:
        //  1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Pupil.Gender, ArrayList<Pupil>>
        //  2. Найти средний возраст учеников
        //  3. Найти самого младшего ученика
        //  4. Найти самого старшего ученика
        //  5. Собрать учеников в группы по году рождения
        //  6. Убрать учеников с одинаковыми именами, имена и дату рождения оставшихся вывести в консоль
        //  7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)
        //  8. Вывести в консоль всех учеников в возрасте от N до M лет
        //  9. Собрать в список всех учеников с именем=someName
        //  10. Собрать Map<Pupil.Gender, Integer>, где Pupil.Gender - пол, Integer - суммарный возраст учеников данного пола

        System.out.println(pupils);
        System.out.println("Task 1");
        Map<Pupil.Gender, ArrayList<Pupil>> genderGroups = pupils.stream()
                .collect(Collectors.groupingBy(
                        Pupil::getGender,
                        Collectors.toCollection(ArrayList::new)
                ));
        System.out.println(genderGroups);

        System.out.println("Task 2");
        double avgAge = pupils.stream()
                .collect(Collectors.averagingDouble(pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear()));
        System.out.println("Average age: " + Math.round(avgAge));

        System.out.println("Task 3");
        Pupil youngest = pupils.stream().max(Comparator.comparingInt(pupil -> pupil.getBirth().getYear())).orElse(null);
        System.out.println("The youngest pupil is " + youngest.getName());

        System.out.println("Task 4");
        Pupil eldest = pupils.stream().min(Comparator.comparingInt(pupil -> pupil.getBirth().getYear())).orElse(null);
        System.out.println("The eldest pupil is " + eldest.getName());

        System.out.println("Task 5");
        Map<Integer, List<Pupil>> birthYearGroups = pupils.stream()
                .collect(Collectors.groupingBy(
                        pupil -> pupil.getBirth().getYear()
                ));
        System.out.println(birthYearGroups);

        System.out.println("Task 6");

        /*Collection<Pupil> uniquePupils = pupils.stream()
                .collect(Collectors.toMap(
                        Pupil::getName,
                        Function.identity(),
                        (pupil1, pupil2) -> pupil1)).values();
        uniquePupils.forEach(pupil -> System.out.println(pupil.getName() + ": " + pupil.getBirth()));*/

        System.out.println("Task 7");

        pupils.sort(
                Comparator.comparing(Pupil::getGender)
                        .thenComparing(Pupil::getBirth)
                        .thenComparing(Pupil::getName).reversed());
        System.out.println(pupils);

        System.out.println("Task 8");
        int from = 8, to = 15;
        pupils.forEach(
                pupil -> {
                    if ((LocalDate.now().getYear() - pupil.getBirth().getYear()) > from && (LocalDate.now().getYear() - pupil.getBirth().getYear()) < to)
                        System.out.println(pupil);
                }
        );

        System.out.println("Task 9");
        String name = "Иван";
        List<Pupil> selectByName = pupils.stream().filter(
                pupil -> pupil.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        System.out.println(selectByName);

        System.out.println("Task 10");

        Map<Pupil.Gender, Integer> summaryAge = pupils.stream()
                .collect(Collectors.groupingBy(
                        Pupil::getGender,
                        Collectors.summingInt(pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear())));
        System.out.println(summaryAge);
    }

}