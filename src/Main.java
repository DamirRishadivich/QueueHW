import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Person> personDeque = new ArrayDeque<>();
        personDeque.addAll(generateClients());
        System.out.println(personDeque);

        while (!personDeque.isEmpty()) {
            if (personDeque.element().ticket > 0) {
                personDeque.offerLast(personDeque.element());
                personDeque.pollFirst().usedTicket();
            } else {
                personDeque.remove();
            }
        }
        System.out.println(personDeque);

    }
    public static List<Person> generateClients() {
        List<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("Andrey", "Gavrilov", 3));
        personArrayList.add(new Person("Damir", "Galimov", 7));
        personArrayList.add(new Person("Filipp", "Voronov", 5));
        personArrayList.add(new Person("Egor", "Kovalenko", 3));
        personArrayList.add(new Person("Pavel", "Sukhanov", 6));
        return personArrayList;
    }

}
