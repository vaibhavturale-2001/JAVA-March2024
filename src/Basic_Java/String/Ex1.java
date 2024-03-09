package Basic_Java.String;

public class Ex1 {
    public static void main(String[] args) {
        String name="VaibhavTurale";
        String name2=new String("VaibhavTurale");
        String name3="VaibhavTurale";

        System.out.println(name2);
        System.out.println("Lenght of string ="+name2.length());
        System.out.println(name2.charAt(0));
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));


        String text = "Java Programming";
        int index = text.indexOf("Programming");
        System.out.println("Index of 'Programming': " + index);

        System.out.println("===============================================================");

        String sentence = "vaibhavturale";
        String subString = sentence.substring(1, 8); // Extracts "great"
        String lowerCase = sentence.toLowerCase();
        String upperCase = sentence.toUpperCase();
        String replaced = sentence.replace("vaibhav", "chetan");
        String trimmed = "  Hello, World!  ".trim(); // Removes leading and trailing spaces

        System.out.println("Substring: " + subString);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Replaced: " + replaced);
        System.out.println("Trimmed: " + trimmed);


    }
}
