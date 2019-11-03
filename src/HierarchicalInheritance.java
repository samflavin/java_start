public class HierarchicalInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.methodC();
        c.methodA();

        B d = new B();
        d.methodB();
        d.methodA();

    }
}
