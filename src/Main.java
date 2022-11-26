import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Person> personDeque = new ArrayDeque<>();
        personDeque.addAll(generateClients());
        System.out.println(personDeque);


        while (!personDeque.isEmpty()) {
            Person person = personDeque.poll();
            if (person.ticket > 1) { // если билетов больше чем дин катаемся, убираем билет, добавляем в конец очереди
                person.usedTicket();
                personDeque.offerLast(person);
            } else if (person.ticket == 1) { // если билет остался 1 (последний), катаемся, удаляем билет и собственно персона из Дэка
                person.usedTicket();
                personDeque.remove(person);
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
