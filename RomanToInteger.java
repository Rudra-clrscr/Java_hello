import java.util.*;
class RomanToInteger{
    public static int romantointeger(String s){
        Dictionary<String,String> rom = new Hashtable<>();
        rom.put("I","1");rom.put("V","5");rom.put("X","10");
        rom.put("L","50");rom.put("C","100");rom.put("D","500");
        rom.put("M","1000");

        int sum = 0;
        for(int i=0;i<s.length();i++){
            int curr=Integer.parseInt(rom.get(String.valueOf(s.charAt(i))));
            if(i+1<s.length()){
                int next=Integer.parseInt(rom.get(String.valueOf(s.charAt(i+1))));
                if(next>curr){
                  sum+=next-curr;
                  i++;
                  continue;
                }else if(next==curr){
                  sum+=2*curr;
                  i++;
                  continue;
                }else{
                  sum+=curr;
                  continue;
                  
                }
            }else{
                sum+=curr;
            }
            
            

        }
        
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roman Number:");
        String s = sc.nextLine();
        int result = romantointeger(s);
        System.out.println("the result is :"+result);
    }
}