package Television;

public class Televisor {

    String name;
    String producer;
    String model;
    double price;
    boolean status;

    Televisor(String name, String producer, String model, double price, boolean status) {
        this.name = name;
        this.producer = producer;
        this.model = model;
        this.price = price;
        this.status = status;
    }


    void turnOn() {
        status = true;
    }

    void turnOff() {
        status = false;
    }

    void showStatus() {
        System.out.println(status);
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
