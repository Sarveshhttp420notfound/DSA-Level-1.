import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int q=scn.nextInt();
        int d=0;
        while(q!=0){
            q=q/10;
            d++;
        }
        System.out.println(d);
        
    }
}


