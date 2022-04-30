import java.io.*;
import java.util.*;

public class Main{
    
public static int span(int [] arr){
    //max, min 
    int ma = Integer.MIN_VALUE;        //negative infinity
    int mi = Integer.MAX_VALUE;        //positive infinity
    for(int j = 0; j<arr.length; j++){
        int currVal = arr[j];
        if(currVal > ma){
            ma = currVal;
        }
        else if(currVal < mi){
            mi = currVal;
        }
    }
    return ma-mi;
}


public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int j = 0; j<n; j++){
        arr[j] = scn.nextInt();
    }
    int ans = span(arr);
    System.out.println(ans);
 }

}