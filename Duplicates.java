import java.util.*;
class Duplicates{
    public static boolean duplicates(int[] nums){
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            h.add(nums[i]);
        }
        if(h.size()<nums.length){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element of array : ");
        for(int j = 0;j<nums.length;j++){
            nums[j] = sc.nextInt();
        }
        boolean result = duplicates(nums);
        if(result){
            System.out.println("The array contains duplicate elements");

        }else{
            System.out.println("The array doesn't contain any duplicates");
        }
        sc.close();
    }
 
}