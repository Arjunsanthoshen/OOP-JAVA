import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);   
        System.out.print("enter the number : ");     
        int i=1,n,fact=1;
        n=s.nextInt();
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.println("The factorial of " +n +" is " + fact);
    }
}