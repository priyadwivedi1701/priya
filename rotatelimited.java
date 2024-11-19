import java.util.*;
public class rotate_num {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to rotate:");
    int num=sc.nextInt();
    System.out.println("Eneter the digit to rotate the num by:");
    int r=sc.nextInt();
    int d=count(num);
    System.out.println(rotate(num,d,r));
    }
    public static int count(int n) {
        int d=0;
        while(n>0){
        n/=10;
        d++;
    }
    return d;
    }
    public static int rotate(int num,int d,int r){
        if(r>0){
            
        return (int)Math.pow(10,d-1)*(num%10)+rotate(num/10,d-1,r-1);}
        return num;
    }
}
        

