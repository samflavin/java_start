public class SameLevelRule {
    public void n1(String string){
        System.out.println("string version");
    }

    public void n1(StringBuffer stringBuffer) {
        System.out.println("stingBuffer version");
    }

    public static void main(String[] args) {
        SameLevelRule sameLevelRule = new SameLevelRule();
        sameLevelRule.n1("name");
        sameLevelRule.n1(new StringBuffer("name SB"));
//        sameLevelRule.n1(null);
    }
}

