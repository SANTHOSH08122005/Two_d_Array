package two_array;
import java.util.Scanner;

public class CheckXMatrix {

    public static boolean checkXMatrix(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==j || i+j==grid.length-1){
                    if(grid[i][j]==0){
                        return false;
                    }
                }
                else{
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n=sc.nextInt();

        int grid[][]=new int[n][n];

        System.out.println("Enter matrix elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }

        boolean result=checkXMatrix(grid);

        System.out.println("Is X-Matrix: "+result);

        sc.close();
    }
}
