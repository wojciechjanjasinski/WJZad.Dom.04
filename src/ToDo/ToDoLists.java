package ToDo;

public class ToDoLists {
    public static void main(String[] args) {
        Task taskOne = new Task("rewizja kodu", "sprawdzenie czystości kodu w nowo utworzonej klasie programu XYZ", 0, new Person("Jan", "Kowalski", 33));
        System.out.println(taskOne.toString());
        System.out.println("Czy to zadanie ma wysoki priorytet? " + taskOne.highPriority());
        System.out.println("Czy to zadanie ma umiarkowany priorytet? " + taskOne.mediumPriority());
        System.out.println("Czy to zadanie ma niski priorytet? " + taskOne.lowPriority());

        Task taskTwo = new Task("napisanie nowej klasy w Javie", "Nasz najnowszy program HJKL wymaga utworzenia nowej klasy do uzyskania pełnej funkcjonalności", 1, new Person("Filip", "Nowomiejski", 30));
        System.out.println(taskTwo.toString());
        System.out.println("Czy to zadanie ma wysoki priorytet? " + taskTwo.highPriority());
        System.out.println("Czy to zadanie ma umiarkowany priorytet? " + taskTwo.mediumPriority());
        System.out.println("Czy to zadanie ma niski priorytet? " + taskTwo.lowPriority());

        Task taskThree = new Task("Pozmywać naczynia w biurze", "Po ostatniej imprezie biurowej zostało mnóstwo naczyń do umycia", -1);
        System.out.println(taskThree.toString());
        System.out.println("Czy to zadanie ma wysoki priorytet? " + taskThree.highPriority());
        System.out.println("Czy to zadanie ma umiarkowany priorytet? " + taskThree.mediumPriority());
        System.out.println("Czy to zadanie ma niski priorytet? " + taskThree.lowPriority());

        Task taskFour = new Task("wynieść śmieci", "po tygodniu pracy w biurze zostało mnóstwo śmieci");
        System.out.println(taskFour.toString());
        System.out.println("Czy to zadanie ma wysoki priorytet? " + taskFour.highPriority());
        System.out.println("Czy to zadanie ma umiarkowany priorytet? " + taskFour.mediumPriority());
        System.out.println("Czy to zadanie ma niski priorytet? " + taskFour.lowPriority());
    }
}
