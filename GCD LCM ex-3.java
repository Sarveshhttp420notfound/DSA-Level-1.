import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int q=scn.nextInt();
        int w=scn.nextInt();
        int o1=q;
        int ow1=w;
        while(q%w!=0){
            int rem=q%w;
            q=w;
            w=rem;
        }
        int gcd=w;
        int lcm=o1*ow1/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}