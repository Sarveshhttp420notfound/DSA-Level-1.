import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            long z=n;
            long pow=1;
            int digit=0;
            while(z!=0){
                z=z/10;
                pow=pow*10;
                digit++;
                
            }
            pow=pow/10;
            z=n;
            while(pow>0){
                int d=(int)(z/pow);
                System.out.println(d);
                z=z%pow;
                pow=pow/10;
            }
        }
    }
