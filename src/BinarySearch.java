import java.util.Scanner;

class search{
    public static int src(int[] arr,int l,int r,int target){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                l=mid+1;

            }
            else {
                r=mid-1;
            }
        }
        return -1;
    }

}
public class BinarySearch {
    public static void main(String[] args){
        int[] arr={2,7,9,27,99};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to search");
        int target= sc.nextInt();
        int result=search.src(arr,0,arr.length-1,target);
        if(result==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index :"+result);
        }
    }
}
