package index01;

import java.util.Scanner;

public class MaxMidMinNumber {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값 구하기");
        System.out.println("첫번째 값 : ");
        int a = stdIn.nextInt();
        System.out.println("두번째 값 : ");
        int b = stdIn.nextInt();
        System.out.println("세번째 값 : ");
        int c = stdIn.nextInt();

        System.out.println("최대값은 "+max3(a,b,c));
        System.out.println("최소값은 "+min3(a,b,c));
        System.out.println("중앙값은 "+med3(a,b,c));
    }

    public static int max3(int a, int b , int c){
        int max = a;

        if(b > max){
            max = b;
        }

        if (c > max){
            max = c;
        }

        return max;
    }

    public static int min3(int a, int b , int c){
        int min = a;

        if(b < min){
            min = b;
        }

        if (c < min){
            min = c;
        }

        return min;
    }

    public static int med3(int a, int b , int c){
       if(a >= b){
           if (b >= c){
               return b;
           }else if (a <= c){
               return a;
           }else {
               return c;
           }
       }else if (a > c){
           return a;
       }else if (b > c){
           return c;
       }else {
           return b;
       }
    }

}
