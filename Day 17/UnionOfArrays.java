public class UnionOfArrays {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        // Print all elements of first array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // Print only those elements of second array
        // which are not present in first array
        for (int i = 0; i < b.length; i++) {
            boolean found = false;

            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(b[i] + " ");
            }
        }
    }
}