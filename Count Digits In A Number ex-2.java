import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner (System.in);
        int p=scn.nextInt();
        int digit=0;
        while(p!=0){
            p=p/10;
            digit++;
        }
        System.out.println(digit);
    }
}


