package BubbleSort;

public class BubbleSort {

    void bubbleSortNSquared(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length - i - 1; j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {64,23,12,22,10,90};
        bubbleSort.bubbleSortNSquared(arr);

        for(int var : arr){
            System.out.println(var);
        }

    }
}
