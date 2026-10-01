package two_array;
import java.util.Scanner;

public class TransposeMatrix {

    public static int[][] transpose(int[][] a) {
        int b[][]=new int[a[0].length][a.length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                b[j][i]=a[i][j];
            }
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r=sc.nextInt();

        System.out.print("Enter columns: ");
        int c=sc.nextInt();

        int a[][]=new int[r][c];

        System.out.println("Enter matrix elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }

        int b[][]=transpose(a);

        System.out.println("Transpose matrix:");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}