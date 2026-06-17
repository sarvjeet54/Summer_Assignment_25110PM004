public class MissingNumber {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5}; // Missing number is 4

        int n = arr.length + 1;

        int sum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }

        int missing = sum - arrSum;

        System.out.println("Missing Number = " + missing);
    }
}
