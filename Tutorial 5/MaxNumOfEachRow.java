import java.util.Scanner;
public class MaxNumOfEachRow{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int i,n,j,rows,cols,sum=0;
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
        System.out.println("Maximum Element in the row");
        for(i=0;i<cols;i++){
            int max=a[i][0];
            for(j=0;j<rows;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
            System.out.println("row"+(i+1)+"="+max);
        }
    }
}