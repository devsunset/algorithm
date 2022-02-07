package index01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합 구하기");

        System.out.println("n의 값 : ");

        int n = stdIn.nextInt();

        int sum = 0;

        int i = 1;

        while(i <= n){
            sum +=i;
            i++;
        }

        System.out.println("sum = "+sum);


        int sum1 = 0;

        for(int k=1;k<=n;k++){
            sum1 +=k;
        }

        System.out.println("sum = "+sum1);


        int sum2 = 0;

        for(int k=n;k>0;k--){
            sum2 +=k;
        }

        System.out.println("sum = "+sum2);

        if(n == 10){
            int sum3= (1+n)*5;
            System.out.println("sum = "+sum3);
        }

        for(int x=1;x<=9;x++){
            for (int z=1;z<=9;z++){
                System.out.printf("%3d",x*z);
            }
            System.out.println();
        }

    }
}
