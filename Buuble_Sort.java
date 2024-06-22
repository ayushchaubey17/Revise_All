public class Buuble_Sort {

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 223, 2, 32, 3, 23, 3, 7};
       int arr2 [] = sort(arr);
        print(arr2);
    }

    public static void print(int[] arr) {
        for (int i:arr) {
            System.out.print(i+" ");
        }

    }

    public static int[] sort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n-1 ; i++) { // pass
            int swap =0;
            for (int j = 0; j < (n-1)-i ; j++) { //swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }

        return  arr;
    }
}
