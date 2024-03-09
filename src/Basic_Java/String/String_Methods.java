package Basic_Java.String;

public class String_Methods {
    public static void main(String[] args) {
        String name="vaibhavturale";
        String name1="vaibhavturale";
        String nameS="  suhag,bhau  ";

        System.out.println(name.length());
        System.out.println(name.equals(name1));
        System.out.println(name.equals(nameS));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(6));
        System.out.println(name.replace("vaibhavturale","adiiiiii"));

        String subString=name.substring(3,5);
        System.out.println(subString);
        System.out.println(nameS.trim());

    }
}
