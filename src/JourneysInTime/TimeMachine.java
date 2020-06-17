package JourneysInTime;

public class TimeMachine {
    Person person;

    void backInTime(Person person) {
        --person.age;
    }

    void timeTravel(Person person, int amount) {
        person.age = person.age + amount;
    }

}
