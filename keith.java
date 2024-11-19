import java.util.*;
public class keith
 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int num=n;
        int d=count(n);
        if(n<100)
        {
            System.out.println("invalid number");
        }
        else
         {
            int arr[]=new int[d];
            for(int i=0;n>0;i++)
            {
                arr[i]=n%10;
                n/=10;
            }
            int sum=0;
            while(sum<=num)
            {
                sum=sumfun(arr);
               
                if(sum>num)
                {
                    System.out.println("no");
                    break;
                }
                else if (sum==num) 
                {
                    System.out.println("yes");//extra for printing series of results
                    break;
                    
                }
                else
                {
                    for(int j=arr.length-1;j>0;j--)
                    {
                        arr[j]=arr[j-1];
                    }
                        arr[0]=sum;
                    }
                }
            }

        }
        

    
    public static int sumfun(int arr[]){
        int sum=0;
        for(int i:arr){
            sum+=i;
            
        }System.out.println(sum);
        return sum;
    }
    public static int count(int n){
        int d=0;
        while(n>0){
        
            n/=10;
            d++;
        }
        return d;
        
    }
}
