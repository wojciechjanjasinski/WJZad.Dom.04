package JourneysInTime;

public class TimeTraveling{
    public static void main(String[] args) {
        Person personOne = new Person("Joachim", "Komański", 37);

        TimeMachine timeMachine = new TimeMachine();
        timeMachine.backInTime();
        timeMachine.timeTravel( personOne, 7);
        System.out.println(personOne.toString());
    }
}