import java.util.*;
class MoveZeroes{
    public static int[] Zeroes(int[] nums){
        int left = 0;
        for(int right=left+1;right<nums.length;right++){
            if(nums[left]==0){
                if(nums[right]!=0){
                    int temp = nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;
                    left++;
                }
            }else{
                left++;
            }
        }
        return nums;
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the values of array");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int[] result = new int[nums.length];
        result = Zeroes(nums);
        System.out.println("The array with all zeroes on right is:");
        System.out.print("[");
        for(int j = 0;j<result.length;j++){
            System.out.print(result[j]);
            if(j!=result.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        sc.close();


    }
}