import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("\nenter a year(YYYY) : ");
        int n=s.nextInt();
        System.out.print("The year " +n +" is ");
        if(((n%4==0)&&(n%100!=0))||(n%400==0)){
            System.out.print("a Leap year\n");
        }
        else{
            System.out.print(" not a Leap year\n");
        }
    }
}