public class MethodOverloading {
    // early biding or compile time polymorphism
    public void method1() {
        System.out.println("no arguments");
    }

    public void method1(int i) {
        System.out.println("integer arguments:" + i);
    }

    public void method1(float i) {
        System.out.println("float arguments:" + i);
    }

    public void method1(int i, int j) {
        System.out.println("integer arguments:" + i + ',' + j);
    }

    public void method1(int i, float j) {
        System.out.println("integer arguments:" + i + ',' + j);
    }

    public void method1(float i, int j) {
        System.out.println("integer arguments:" + i + ',' + j);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.method1();
        methodOverloading.method1(10);
    }
}
