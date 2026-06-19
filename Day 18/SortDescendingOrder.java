public class SortDescendingOrder {
        public static void print(int[] arr){
            for(int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        static void main(String[] args) {
            int[] arr = {2,3,7,2,5};
            int n = arr.length;
            print(arr);
            for (int i = 0; i < n-1; i++){
                int max = Integer.MIN_VALUE;
                int mindx = -1;
                for (int j = i; j < n ; j++) {
                    if(arr[j]>max){
                        max = arr[j];
                        mindx = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[mindx];
                arr[mindx] = temp;

            }
            print(arr);
        }
    }

