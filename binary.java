import java.util.Scanner;

class binary{
    public static void main(String args[]){
        int[] binary = new int[32];
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;
        while(a>1){
            binary[i]=a%2;
            a=a/2;
            i++;
        }
        binary[i]=a;
        for(int j=i;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}