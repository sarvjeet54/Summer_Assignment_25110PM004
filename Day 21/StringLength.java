public class StringLength {
    public static void main(String[] args) {
        String str = "Hello World";

        char[] arr = str.toCharArray();

        int count = 0;

        for (char ch : arr) {
            count++;
        }

        System.out.println("Length = " + count);
    }
}
