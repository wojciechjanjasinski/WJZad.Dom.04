package Television;

public class Tele {
    public static void main(String[] args) {
        Televisor televisor = new Televisor("Extreme Definition", "Scharb", "ED1000", 8999.99, false);
        televisor.showStatus();
        televisor.turnOn();
        televisor.showStatus();
        televisor.turnOff();
        televisor.showStatus();

    }
}
