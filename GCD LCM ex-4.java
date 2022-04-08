import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int a1=a;
        int b1=b;
        while(a%b!=0){
            int rem=a%b;
             a=b;
             b=rem;
        
        }
        
        int gcd=b;
        int lcm=a1*b1/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}