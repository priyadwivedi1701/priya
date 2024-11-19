import java.util.*;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int d=count(n);
        int sq=n*n;
        int ans=sq%(int)Math.pow(10,d);
        if(n==ans){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static int count(int n){
        int d=0;
        while(n>0)
        {
        n/=10;
        d++;
         }
        return d;

    }
}
