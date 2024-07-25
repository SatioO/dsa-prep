package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(search(arr, 6, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int l, int r) {
        if(l > r) {
            return -1;
        }

        int mid = (l + r) / 2;

        if(arr[mid] == target) {
            return mid;
        } else if(arr[mid] < target) {
            return search(arr, target, mid + 1, r);
        } else {
           return search(arr, target, l, mid - 1);
        }
    }
}
