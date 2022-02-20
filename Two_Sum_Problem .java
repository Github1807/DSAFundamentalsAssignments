package assignments;

public class Two_Sum_Problem {
    public static void target_find(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]==target){
                System.out.println("target is sum of these two elements present at "+low+" and "+high+" position");
            }
            if(arr[low]+arr[high]<target){
                low++;
            }
            else{
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,8,12,16};
        int target=9;
        target_find(arr,target);
        int arr1[]={6,5,7,8,9,10,11};
        int target2=18;
        target_find(arr1,target2);
    }
}
