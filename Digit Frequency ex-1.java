import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int b=scn.nextInt();
        int c=scn.nextInt();
        int a=getdigit(b,c);
        System.out.println(a);
    }
    public static int getdigit(int b,int c){
        int result=0;
        while(b!=0){
            int lastdigit=b%10;
            if(lastdigit==c){
                result++;
            }
            b=b/10;
        }
        return result;
    }
}