
public class App {

    public static void main(String[] args) {
        //calculate();
        int[] arr = new int[]{32,10,33,11,34,12,41,9,5,40,1,3,20,78,19,7};
        sortNumbers(arr);
    }

    public static void sortNumbers(int arr[]){
        int temp = 0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

        System.out.println("after sorting binary search");
        for(int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        }
        System.out.println();
        System.out.println("enter the no you want to search");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int start = 0;
        int end = arr.length-1;
        System.out.println("find value at position "+binarySearch(arr,start,end,no));

    }

    public static int binarySearch(int arr[],int start, int end, int no ){
        int mid = start+(end-start)/2;
        if(arr[mid]==no){
            return mid;
        }
        if(arr[mid]>no){
            return binarySearch(arr,start,mid-1,no);
        }
        if(arr[mid]<no) {
            return binarySearch(arr, mid + 1, end, no);
        }
        return -1;
    }
