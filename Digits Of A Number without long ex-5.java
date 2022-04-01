import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner (System.in);
        int f=scn.nextInt();
        int temp=f;
        int p=1;
        while(temp>=10){
            temp=temp/10;
            p=p*10;
            
        }
        temp=f;
        while(p>0){
            int s=(temp/p);
            System.out.println(s);
            temp=(temp%p);
            p=p/10;
        }
    }
}