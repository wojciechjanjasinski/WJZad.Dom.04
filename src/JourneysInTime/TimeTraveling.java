package JourneysInTime;

public class TimeTraveling {
    public static void main(String[] args) {
        Person personOne = new Person("Joachim", "Komański", 37);
        System.out.println(personOne.toString());
        TimeMachine timeMachine = new TimeMachine();
        timeMachine.backInTime(personOne);
        System.out.println(personOne.toString());
        timeMachine.timeTravel(personOne, 7);
        System.out.println(personOne.toString());
        timeMachine.backInTime(personOne);
        System.out.println(personOne.toString());
    }
}