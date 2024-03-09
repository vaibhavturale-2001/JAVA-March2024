package Basic_Java.String;

public class RevString_By_Pointers {
    public static void main(String[] args) {

        String str = "Hello, World!";

        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Initialize pointers for the start and end of the array
        int start = 0;
        int end = charArray.length - 1;

        // Loop through the array and swap characters
        while (start < end) {
            // Swap characters
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move pointers towards the center
            start++;
            end--;
        }

        // Convert char array back to string
        String reversed = new String(charArray);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
