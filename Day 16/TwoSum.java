import java.util.Arrays;

static boolean twoSum(int[] arr, int target) {

    Arrays.sort(arr);

    int i = 0;
    int j = arr.length - 1;

    while (i < j) {

        if (arr[i] + arr[j] == target)
            return true;

        else if (arr[i] + arr[j] > target)
            j--;

        else
            i++;
    }

    return false;
}

public static void main(String[] args) {

    int[] arr = {2, 7, 11, 15};
    int target = 9;

    System.out.println(twoSum(arr, target));
}

