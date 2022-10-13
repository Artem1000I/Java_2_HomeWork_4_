import java.util.*;

class HomeWork3 {

    public static void main(String[] args) {
        task1();
        task2();
    }
    /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово.
    */
    private static void task1() {
        Map<String, Integer> uniqueWords = new HashMap<>();
        String[] words = { "Toyota", "Ferari", "Volvo", "Shkoda", "Lamborginy", "Honda", "Subaru", "Ferari","Toyota", "Kia", "Suzuki", "Mitsubisy", "Volvo", "Shkoda", "Ferari", "Lamborginy", "Honda", "Subaru", "Dodge"
        };

        for (int i = 0; i < words.length; i++) {
            if (uniqueWords.containsKey(words[i]))
                uniqueWords.put(words[i], uniqueWords.get(words[i]) + 1);
            else
                uniqueWords.put(words[i], 1);
        }
        System.out.println(uniqueWords+"\n");
    }

    /*
    2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и
    телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи,
    а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может
    быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
    */



    private static void task2() {
        Directory directory = new Directory();
        System.out.println("Task number 2\n");

        directory.add("Kulov", "888888888888");
        directory.add("Kulov", "877777777777");
        directory.add("Kulov", "855555555555");
        directory.add("Aganyn","866666666666");
        directory.add("Aganyn","811111111111");
        directory.add("Aganyn","844444444444");
        directory.add("Gimov", "833333333333");
        directory.add("Gimov", "822222222222");
        directory.add("Iganyn","800000000000");

        System.out.println(directory.get("Kulov"));
        System.out.println(directory.get("Aganyn"));
        System.out.println(directory.get("Gimov"));
        System.out.println(directory.get("Iganyn"));
    }
}

class Directory {
    private Map<String, List<String>> phoneBook = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String surname, String phone_number) {

        if (phoneBook.containsKey(surname)) {
            phoneNumberList = phoneBook.get(surname);
            phoneNumberList.add(phone_number);
            phoneBook.put(surname, phoneNumberList);

        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phone_number);
            phoneBook.put(surname, phoneNumberList);

        }
    }

    public List<String> get(String surname) {
        return phoneBook.get(surname);
    }

}