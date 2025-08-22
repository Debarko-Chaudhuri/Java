package LeetCode.Array.SingleNumber;
import java.util.*;
public class SingleNumber {

    public static int brute(int nums[]){
        int ans=0;
        for(int i=0;i<nums.length;i++){
           boolean single=true;
           for(int j=0;j<nums.length;j++){
               if(nums[i]==nums[j]&&i!=j){
                single=false;
               }
           }
               if(single==true){
                ans=nums[i];
               }
        }
        return ans;
    }
//Used XOR operation
    public static int optimized(int nums[]){
        int ans=0;
        for(int i=0;i<nums.length;i++){
             ans=ans^nums[i];
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements keep in mind to give all duplicates except 1 element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int bruteResult=brute(arr);
        System.out.println("Brute force answer: "+bruteResult);
        int optimizedResult=optimized(arr);
        System.out.println("optimized answer: "+optimizedResult);
    }
}
