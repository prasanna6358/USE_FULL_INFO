package com.amara.palikala.jain;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int j=0;
        for(int i=0;i<100;i=i+2){
            arr[j] = i;
            j++;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int index = mySearch(arr, 0, arr.length-1, 4);
        int found = mySearch(arr,0,arr.length-1,74);
        System.out.println("found "+found);
        //int index = concurandDevidesearch(arr,  4);
        System.out.println(index);
    }

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        else return -1;
    }

    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {

        if (start <=end) {
            int mid = start + (end - start) / 2;
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid-1, key);

            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid+1, end , key);

            } else {
                return mid;
            }
        }
        return -(start + 1);
    }

    public static int mySearch(int[] arr, int start, int end, int no){
        start = 0;end=arr.length-1;
        int mid =start+(end-start)/2;
        if(arr[mid]==no){
            return mid;
        }
        if(no>arr[mid]){
            return binarySearch(arr,mid+1,end,no);
        }
        else return binarySearch(arr, start,mid-1,no);
    }

    public static int concurandDevidesearch(int arr[], int no){
        int start=0,end=arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (no == arr[mid]) {
                return mid;
            }
            if (no < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }



    public static int mySearchone(int arr[],int start, int end, int number){
        int mid= start+(end-start)/2;
        if(arr[mid]==number){
            return mid;
        }
        if(arr[mid]>number){
            return binarySearch(arr,start,mid-1,number);
        }
        if(arr[mid]<number){
            return binarySearch(arr,mid+1,end, number);
        }
        return -1;
    }
}
