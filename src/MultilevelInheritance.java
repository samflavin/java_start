public class MultilevelInheritance {
    public static void main(String[] args) {
        D d = new D();
        d.methodD();
        d.methodB();
        d.methodA();

        // composition strong container and contained objects
        // aggregation weak container and contained.  university destroyed, lecturers can transfer.

        // is-a relationship
        // has-a relationship

    }
}

//types of polymorphism:
 // compile time polymo / static binding/ early binding e.g./overloading
// runtime polym / dynamic binding / late binding e.g./ overriding

// overload - same named methods with different argument types