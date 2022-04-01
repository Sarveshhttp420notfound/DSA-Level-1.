import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int z=scn.nextInt();
        while(z!=0){
            int lastdit=z%10;
            System.out.println(lastdit);
            z=z/10;
        }
    }
}