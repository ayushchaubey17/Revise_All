public class Linear_Search {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 3, 1, 2, 3, 53, 23};
        search(arr,532);
    }

    public static void search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("element is found at index " + i);
                ;
                return;
            }
        }

        System.out.println("element not found");

    }

}
