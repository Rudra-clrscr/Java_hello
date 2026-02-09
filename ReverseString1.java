import java.util.*;
class ReverseString1{
    public static String ReverseString(String s){
        int left = 0;
        int right = s.length()-1;
        char[] c = new char[s.length()];
        for(int i = 0;i<c.length;i++){
            c[i] = s.charAt(i);
        }
        while(left<right){
            
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        return new String(c);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();

        String result = ReverseString(s);
        System.out.println("The Reversed String is :"+result);
        sc.close();
    }
}