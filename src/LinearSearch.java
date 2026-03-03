import java.util.Scanner;

class Search{
    public static int src(int[]  arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
public class LinearSearch {
    public static void main(String[] args){
        int[] arr={2,7,9,27,99};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element [2,7,9,27,99] to search from Array");
        int target= sc.nextInt();
        int result=Search.src(arr,target);
        if(result==-1){
            System.out.println("element not found");
        }else{
            System.out.println("index of element : "+result);
        }
    }
}
