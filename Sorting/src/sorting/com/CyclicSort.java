package sorting.com;

import java.util.Arrays;


public class CyclicSort {
    public static void main(String[] args) {

        int []  arr = { 5, 1 , 4 , 3 , 2 };
        Cycle(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void Cycle(int [] arr){

        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                swap(arr , i  , correct);
            } else{
                i++;
            }
        }
    }

    public static void swap(int [] arr , int first , int  second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
