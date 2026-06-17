public class MaxFrequencyElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2, 4};

        int maxFreq = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Maximum Frequency Element = " + maxElement);
        System.out.println("Frequency = " + maxFreq);
    }
}