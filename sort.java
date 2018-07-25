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
    }
 }
