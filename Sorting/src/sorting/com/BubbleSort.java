package sorting.com;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-99, -41, 0 , 7, 3, 8};

        BubbleSol(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSol(int[] arr) {

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

           for(int j = 0; j < n-1-i; j++){
               // swap if the item is smaller  then the previous one
               if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
                   swapped = true;
               }
           }

           // if not swapped  for a particular value of i , it mmeans the array is sorted
            if( swapped == true) break;
        }
    }
}