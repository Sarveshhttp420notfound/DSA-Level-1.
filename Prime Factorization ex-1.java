import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int o= scn.nextInt();
        for(int k=2;k*k<=o;k++){
            while(o%k==0){
                o=o/k;
                System.out.print(k+" ");
            }
        }
        if(o!=1){
            System.out.println(o);
        }
    }
}