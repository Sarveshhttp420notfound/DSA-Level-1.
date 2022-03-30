import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        long temp=n;
        int digit=0;
        int p=1;
        while(temp!=0){
            temp=temp/10;
            p=p*10;
            digit++;
        }
        p=p/10;
        temp=n;
        while(p>0){
            int d=(int)(temp/p);
            System.out.println(d);
            temp=temp%p;
            p=p/10;
        }
        
    }
}

