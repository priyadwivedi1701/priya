public class temp{
    public static void main(String[] args) {
        int a=54389672;
        int d=0;
        int max=0;
        while(a!=0){
            d=a%10;
            if(max<d){
                max=d;
            }
            a=a/10;
        }   
    System.out.println(max);
}
}
