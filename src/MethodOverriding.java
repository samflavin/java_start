public class MethodOverriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();

        Child child = new Child();
        child.m1();

        //run time polymorphism
        Parent parent1 = new Child();
        parent1.m1();
    }
}
