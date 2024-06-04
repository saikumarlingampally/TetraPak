public class EqualsCase {
    public static void main(String[] args) {
        String s="kumar";
        String l="KumAR";
        System.out.println(s.equals("Kumar"));  //false
        System.out.println(s.equalsIgnoreCase("KUmar")); //true
        System.out.println(s==l);   //false
        System.out.println(s.equalsIgnoreCase(l));  //true

    }



}
