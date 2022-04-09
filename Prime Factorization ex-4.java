import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int f=scn.nextInt();
        for (int i=2;i*i<=f;i++){
            while(f%i==0){
                f=f/i;
                System.out.print(i + " ");
            }
        }
        if(f!=0){
            System.out.println(f);
        }
    }
}