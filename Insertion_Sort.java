public class Insertion_Sort {
    public static void main(String[] args) {
        Buuble_Sort obj = new Buuble_Sort();
        int arr[] = {1, 3, 3, 1, 323, 12, 24, 23, 12};
        obj.print(arr);
        int arr2[] = sort1(arr);

        System.out.println();
        obj.print(arr2);
    }

    public static int[] sort1(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {

            int temp = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] >temp) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;
        }
        return  arr;
    }
}
