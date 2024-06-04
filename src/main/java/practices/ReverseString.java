package practices;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Lingampally Sai Kumar";
        String name = "";

//        for (int i = 0; i <= s.length()-1; i++) {
//            name = name + s.charAt(i);
//            System.out.println(name);
//
//        }
//        System.out.println("The Full Name is " +name);


        for (int i=s.length()-1;i>=0; i--){
            name= name+s.charAt(i);


        }
        System.out.println(name);

    }

}
