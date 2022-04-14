import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int s=scn.nextInt();
        int b=awso(r,s);
        System.out.println(b);
    }
    public static int awso(int s,int r){
        int g=0;
        while(s!=0){
            int lastdigit=s%10;
            if(lastdigit==r){
                g++;
            }
            s=s/10;
        }
        return g;
    }
}