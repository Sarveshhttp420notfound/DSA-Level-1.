import java.util.*;
public class Main{
    public static void main(String[]args){
    Scanner scn=new Scanner(System.in);
    int o=scn.nextInt();
    int p=scn.nextInt();
    int n=scn.nextInt();
    
    if(o*o==(p*p+n*n)){
        System.out.println("T");
    }
    else if(p*p==(o*o+n*n)){
        System.out.println("Ta");
    }
    else if(n*n==(o*o+p*p)){
        System.out.println("To");
    }
    else {
        System.out.println("TrU");
    }
    
    } 
}