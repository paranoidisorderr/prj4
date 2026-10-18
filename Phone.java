package ivan.homework6;

public class Phone {
    private int number;
    private String model;
    private double weight;

    //5
    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //6
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    //7
    public Phone(int number, String model, double weight) {
    this(number, model);
    this.weight = weight;
    }

    //8
    public Phone() {

    }

    public String recieveCall(String name) {
        return "Звонит " + name;
    }

    public String recieveCall(String name, long phone) {
        return "Звонит " + name + "c телефона " + phone;
    }

    public int getNumber() {
        return number;
    }

    public sendMessage(int...numbers) {
        System.out.println();
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{number=" + number + ", model= " + model + ", weight=" + weight + "}";

    }
}
