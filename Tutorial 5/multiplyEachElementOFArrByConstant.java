import java.util.Scanner;
public class multiplyEachElementOFArrByConstant{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int i,n,j,rows,cols;
        System.out.print("enter the number of rows and columns: ");
        rows=s.nextInt();
        cols=s.nextInt();
        System.out.print("enter the elements : ");
        int[][] a=new int[rows][cols];
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
            a[i][j]=s.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(i=0;i<cols;i++){
            for(j=0;j<rows;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.print("enter the number to multiply with the matrix: ");
        n=s.nextInt();
        System.out.println("Result matrix after scalar multiplication:");
        for(i=0;i<cols;i++){
            for(j=0;j<rows;j++){
                a[i][j]*=n;
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}