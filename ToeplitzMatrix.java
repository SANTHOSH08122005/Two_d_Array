package two_array;
import java.util.Scanner;

public class ToeplitzMatrix {

    public static boolean isToeplitzMatrix(int[][] a) {
        for(int i=1;i<a.length;i++){
            for(int j=1;j<a[0].length;j++){
                if(a[i][j]!=a[i-1][j-1]){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r=sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c=sc.nextInt();

        int a[][]=new int[r][c];

        System.out.println("Enter matrix elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }

        boolean result=isToeplitzMatrix(a);

        System.out.println("Is Toeplitz Matrix: "+result);

        sc.close();
    }
}
