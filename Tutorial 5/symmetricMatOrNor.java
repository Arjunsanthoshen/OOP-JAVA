import java.util.Scanner;
public class symmetricMatOrNor{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int i,n,j,flag=1;
        System.out.print("enter the size of identity matrix(n for n x n matrix): ");
        n=s.nextInt();
        System.out.print("enter the elements : ");
        int[][] a=new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
            a[i][j]=s.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
            if(a[i][j]!=a[j][i]){
            flag=0;
            }
            }
        }
        if(flag==1){
            System.out.println("The matrix is symmetric ");
        }
        else{
        System.out.println("The matrix is not symmetric ");
        }
    }
}