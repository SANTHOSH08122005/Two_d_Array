package two_array;
import java.util.Scanner;

public class MaximumWealth {

    public static int maximumWealth(int[][] a) {
        int max=0;

        for(int i=0;i<a.length;i++){
            int sum=0;

            for(int j=0;j<a[0].length;j++){
                sum=sum+a[i][j];
            }

            if(sum>max){
                max=sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int r=sc.nextInt();

        System.out.print("Enter number of banks: ");
        int c=sc.nextInt();

        int a[][]=new int[r][c];

        System.out.println("Enter account balances:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }

        int result=maximumWealth(a);

        System.out.println("Maximum wealth: "+result);

        sc.close();
    }
}