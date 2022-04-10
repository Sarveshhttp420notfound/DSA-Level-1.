import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int o=scn.nextInt();
        for(int j=2;j*j<=o;j++){
            System.out.println(j*j);
        }
        
    }
}