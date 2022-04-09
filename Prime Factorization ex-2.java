import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        for(int b=2;b*b<=a;b++){
            while(a%b==0){
                a=a/b;
                System.out.println(b);
            }
        }
        if(a!=1){
            System.out.println(a);
        }
    }
}