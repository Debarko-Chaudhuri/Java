package LeetCode.Array.MajorityElement;
import java.util.*;
public class MajorityElement {
   // O(n^2)
    public static int bruteforce(int nums[]){
         int max=0;
         int count;
         int ans=0;
         for (int i : nums) {
            count=0;
            for (int j : nums) {
                if (i==j){
                    count++;
                }
                if(count>max){
                    max=count;
                    ans=i;
                }
            }
         }
         return ans;
    }

    //Hashmap time and space O(n)
    public static int optimizedUsingMap(int nums[]){
        HashMap<Integer,Integer> numberToFrequencyMap = new HashMap<Integer,Integer>();
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            if(numberToFrequencyMap.containsKey(nums[i])){
                numberToFrequencyMap.put(nums[i],numberToFrequencyMap.get(nums[i])+1);
            }
            else{
                numberToFrequencyMap.put(nums[i],1);
            }
        }
        int maxFrequency=Collections.max(numberToFrequencyMap.values());
        for (int i : numberToFrequencyMap.keySet()) {
            if(numberToFrequencyMap.get(i)==maxFrequency){
                ans=i;
                break;
            }
        }
        return ans;
    }

    // O(nLogn) using sort:
    public static int optimizedUsingSort(int nums[]){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    //O(n) time O(1)space We count the vote as +1 for same element and -1 for different element
    // once the count is 0 and a new element pops up t becomes the voted one and the algo works till we reach the last element
        public static int optimizedUsingBoyerMooreAlgo(int nums[]){
            int count=0;
            int ans=0;
            for(int i=0;i<nums.length;i++){
                if(count==0){
                    ans=nums[i];
                    count++;
                }
                else if(ans!=nums[i]){
                    count--;
                }
                else{
                    count++;
                }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int bruteResult=bruteforce(arr);
        System.out.println("Bruteforce answer: "+bruteResult);

        int hashMapResult=optimizedUsingMap(arr);
        System.out.println("HashMapResult answer: "+hashMapResult);

        int sortResult=optimizedUsingSort(arr);
        System.out.println("SortResult answer: "+sortResult);

        int boyerMooreResult=optimizedUsingBoyerMooreAlgo(arr);
        System.out.println("BMAlgo answer: "+boyerMooreResult);
    }
}
