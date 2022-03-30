import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        long swallow=n;
        long p=1;
        int digit=0;
        while(swallow!=0){
            swallow=swallow/10;
            p=p*10;
            digit++;
        }
        p=p/10;
        swallow=n;
        while(p>0){
            int d=(int)(swallow/p);
            System.out.println(d);
            swallow=swallow%p;
            p=p/10;
            
        }
        
    }
}