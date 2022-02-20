package assignments;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,4,9,7,3,9,47,38,59,77,21,46,56};
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
