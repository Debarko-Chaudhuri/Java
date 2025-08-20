package LeetCode.Array.TwoSum;
import java.util.*;
public class TwoSum {
    //O(n^2)
    public static int[] bruteforce(int nums[],int target){
        int ans[] =new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
    //O(n)
    public static int[] optimized(int nums[],int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                ans[1] = i; 
                ans[0] = map.get(target-nums[i]);
                return ans;
            }
            map.put(nums[i] , i);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int[] bruteResult = bruteforce(arr, target);
        System.out.println("Brute Force Answer: " + Arrays.toString(bruteResult));
        int[]optimizedResult=optimized(arr, target);
        System.out.println("Optimized result:"+Arrays.toString(optimizedResult));
    }
}
