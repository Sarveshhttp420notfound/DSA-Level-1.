import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int o=scn.nextInt();
        int temp=o;
        int pow=1;
        while(temp>=10){
            temp=temp/10;
            pow=pow*10;
        }
        temp=o;
        while(pow>0){
            int s=(temp/pow);
            System.out.println(s);
            temp=temp%pow;
            pow=pow/10;
            
            
        }
    }
}