
public class Car {

    public String model;
    public String color;
    public int seats;

    public void display() {
        System.out.println("model is : " + model);
        System.out.println("color is : " + color);
        System.out.println("seats is : " + seats);
    }

    Car(String model, String color, int seats){
        this.model = model;
        this.color = color;
        this.seats = seats;
    }
//    public void initialize(String model_s, String red, int i) {
//        model = model_s;
//        color = red;
//        seats = i;
//    }
}


