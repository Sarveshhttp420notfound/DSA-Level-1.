import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner (System.in);
        int o=scn.nextInt();
        int digit=0;
        while(o!=0){
            o=o/10;
            digit++;
        }
        System.out.println(digit);
    } 
}


