import java.util.Scanner;
public class ReverseOfNumber{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int i,a,n,rev=0,l;
        System.out.print("enter the number : ");
        n=a=s.nextInt();
        for(;a>0;a/=10){
            l=a %10;
            rev=rev*10+l;
        }
        System.out.println("The reverse of the number " +n +" is "+rev);
    }
}