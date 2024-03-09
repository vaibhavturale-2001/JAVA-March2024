package Basic_Java.DataType_Conversion;

public class Int_String {
    public static void main(String[] args) {
        int id=100;

        String s=Integer.toString(id);
        String s1=String.valueOf(id);
        String s3=""+id;

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s3);

    }
}
