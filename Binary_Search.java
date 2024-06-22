public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 75, 676};
        search(arr,75);

    }

    public static void search(int arr[],int key) {
        int high = arr.length;
        int low =0;

        while (low <= high) {
//            int mid = (low+high)/2;

            int mid = low + (high - low)/2;
            if (arr[mid] == key) {
                System.out.println("element found at index "+ mid);
                return;
            }
            else if (key < arr[mid]) high = mid -1;
            else  low = mid+1;
        }

        System.out.println("element should be placed at position "+low);
    }

}
