package two_array;
import java.util.Scanner;

public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum=0;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j || i+j==mat.length-1){
                    sum=sum+mat[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n=sc.nextInt();

        int mat[][]=new int[n][n];

        System.out.println("Enter matrix elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        int result=diagonalSum(mat);

        System.out.println("Diagonal sum: "+result);

        sc.close();
    }
}

