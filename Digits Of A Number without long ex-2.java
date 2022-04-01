import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sw=n;
        int p=1;
        while(sw>=10){
            sw=sw/10;
            p=p*10;
        }
        sw=n;
        while(p>0){
            int d=(sw/p);
            System.out.println(d);
            sw=sw%p;
            p=p/10;
        }
    }
}