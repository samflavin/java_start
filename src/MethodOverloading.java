public class MethodOverloading {
    // early biding or compile time polymorphism
    public void method1() {
        System.out.println("no arguments");
    }

    public void method1(int i) {
        System.out.println("integer arguments:" + i);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.method1();
        methodOverloading.method1(10);
    }
}
