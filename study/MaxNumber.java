package study;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값 구하기");
        System.out.println("첫번째 값 : ");
        int a = stdIn.nextInt();
        System.out.println("두번째 값 : ");
        int b = stdIn.nextInt();
        System.out.println("세번째 값 : ");
        int c = stdIn.nextInt();

        int max = a;

        if(b > max){
            max = b;
        }

        if (c > max){
            max = c;
        }

        System.out.println("최대값은 "+max);
    }

}
