import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int u=scn.nextInt();
        for(int w=2;w*w<=u;w++){ 
            while(u%w==0){
            u=u/w;
            System.out.print(w+" ");
            }
        
        }
        if(u!=1){
            System.out.println(u);
        }
    }
}