import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int u=scn.nextInt();
        for(int r=1;r*r<=u;r++){
            System.out.println(r*r);
        }
    }
}