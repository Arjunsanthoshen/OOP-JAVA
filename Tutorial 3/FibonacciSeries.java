import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int i,n,first=0,second=1,next;
        System.out.print("enter the number : ");
        n=s.nextInt();
        System.out.println("The fibonacci series upto limit " +n +" is ");
        System.out.print(first+", "+second);
        for(i=0;i<n;i++){
            next =first +second;
            System.out.print(", "+next);
            first= second;
            second= next;
        }
    }
}