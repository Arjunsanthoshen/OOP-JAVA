import java.util.Scanner;
public class identityMatrixOfGivenSize{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int i,n,j;
        System.out.print("enter the size of identity matrix(n for n x n matrix): ");
        n=s.nextInt();
        int[][] a=new int[n][n];
        System.out.println("identity matrix:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    a[i][j]=1;s
                }else{
                    a[i][j]=0;
                }
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}