public class Person {
    protected String firstName;
    protected String secondName;
    protected int ticket;

    public Person(String firstName, String secondName, int ticket) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.ticket = ticket;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        if (ticket > 0) {
            this.ticket = ticket;
        }
    }

    public void usedTicket() {
        if (ticket > 1) {
            ticket--;
            System.out.println(firstName + " " + secondName + " прокатился на аттракционе. Количество билетов стало: " + ticket);
        } else if (ticket == 1) {
            System.out.println(firstName + " " + secondName + " прокатился в последний раз.");
        }
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + ". " + "Количество билетов: " + ticket;
    }


}
