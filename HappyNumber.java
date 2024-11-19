import java.util.*;
public class HappyNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        boolean out=false;
        if(n==1)
        {
            System.out.println("true");
        }
        else
        {
            int i=0;
            while(n!=1)
            {//this loop will run only 10 times
                i++;
                if(i>10){
                    System.out.println(out);
                    System.exit(0);
                }
                
                n=power(n);
                System.out.println(n);
                if(n==1)
                {
                    out=true;
                }
            }
             
            System.out.println(out);
        }

    }
    public static int power(int n)
    {
        int num=0;
        while(n>0)
        {
            num+=(n%10)*(n%10);
            n/=10;
        }
        return num;
    }
    
    
}
