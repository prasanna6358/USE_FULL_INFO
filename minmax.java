package com.prasanna.billa;

public class MinMaxNumber {

    public static void main(String[] args) {
        int[] arr = sortArray(new int[]{1,2,8,2,5,5,9,-55,55,6,3,4,7,8});
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      }
        System.out.println(" isConsecutive numbers "+consecutiveORnot( arr));
        getMinMaxNumbers(arr);
    }

    public static void getMinMaxNumbers(int[] arr) {
        int min = arr[0];
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("min is " + min + " max is " + max);
    }

    public static boolean consecutiveORnot(int[] arr) {

        boolean value = false;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - arr[i -1]) ==1 || (arr[i] - arr[i -1]) ==0) {
                value = true;
            }
                else return false;
        }
        return value;
    }

    public static int[] sortArray(int arr[]){
        int temp;
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
