public class VarArgMethodRule {

    public void m1(int...i){
        System.out.println("Var arg method");
    }

    public void m1(int i){
        System.out.println("no Var arg method");
    }

    //var arg methods get lowest priority during compile time.

    public static void main(String[] args) {
        VarArgMethodRule varArgMethodRule = new VarArgMethodRule();
        varArgMethodRule.m1(10);
        varArgMethodRule.m1(10, 10);
        varArgMethodRule.m1();


    }
}
