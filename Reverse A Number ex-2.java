import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner (System.in);
        int s=scn.nextInt();
        while(s!=0){
            int ld=s%10;
            System.out.println(ld);
            s=s/10;
        }
    }
}