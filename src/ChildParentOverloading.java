class Y{

}

class Z extends Y {

}


public class ChildParentOverloading {

    public void m1(Y y){
        System.out.println("Parent");
    }

    public void m1(Z z){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        ChildParentOverloading childParentOverloading = new ChildParentOverloading();

        Y y = new Y();
        Z z = new Z();
        Y x = new Z();


        childParentOverloading.m1(y);
        childParentOverloading.m1(z);
        childParentOverloading.m1(x);


    }
}
