import java.util.*;
class buy{
    public static int stock(int[] nums){
        int left = 0;
        int profit = 0;
        int maxprofit = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[left]<nums[right]){
                profit = nums[right] - nums[left];
                if(maxprofit<profit){
                    maxprofit = profit;
                }
            }else{
                left = right;
            }
        }
        if(maxprofit>0){
            return maxprofit;
        }else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Provide the size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i =0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int result = stock(nums);
        System.out.print("The max possible profit is :"+result);
        sc.close();

    }
}