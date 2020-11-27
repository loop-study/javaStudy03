package com.example.java;

public class JavaStudy03 {

    /**
     * 백기선 선생님의 자바스터디 3주차
     */
    public static void main(String[] args) {
        /**
         3주차 과제 - 연산자에 대해서

         산술 연산자
         비트 연산자
         관계 연산자
         논리 연산자
         instanceof
         assignment(=) operator
         화살표(->) 연산자
         3항 연산자
         연산자 우선 순위
         (optional) Java 13. switch 연산자
         */

        /**
         * 연산자의 기본 개념
         * 연산(operations)   : 프로그램에서 데이터 처리하여 결과를 산출하는 것
         * 연산자(operator)    : 연산에 사용되는 표시나 기호
         * 피연산자(operand)    : 연산되는 데이터
         * 연산식(expressios)  : 연산자와 피연산자의 연산 과정
         *
         * 단항, 이항, 삼항이란?
         * 피연산자의 수를 뜻한다.
            int x = 30;
            int y = 40;
            int sum = 0;
            // 단항 - 하나의 피연산자가 필요
            x++;
            // 이항자 - 두개의 피연산자가 필요
            sum = x + y;
            // 삼항 - 세개의 피연산자가 필요
            (sum > 90) ? 100 :50;

            // 정수형 자료형 int 를 이용한 사칙연산
            int a = 10;
            int b = 4;

            System.out.println("a + b = " + (a + b));   // 14
            System.out.println("a - b = " + (a - b));   // 6
            System.out.println("a * b = " + (a * b));   // 40
            System.out.println("a / b = " + (a / b));   // 2
            System.out.println("a % b = " + (a % b));   // 2

            // 서로 다른 자료형으로 사칙연산
            int a = 10;
            double b = 4d;

            System.out.println("a + b = " + (a + b));   // 14
            System.out.println("a - b = " + (a - b));   // 6
            System.out.println("a * b = " + (a * b));   // 40
            System.out.println("a / b = " + (a / b));   // 2
            System.out.println("a % b = " + (a % b));   // 2


            // 곱셈, 나눗셈에 0 이 사용되는 경우
            double infi = 5.0 / 0;
            double nan = 5.0 % 0;

            System.out.println(infi + 1);   // Infinity
            System.out.println(infi - 1);   // Infinity
            System.out.println(infi * 1);   // Infinity
            System.out.println(infi / 1);   // Infinity
            System.out.println(infi % 1);   // Infinity

            System.out.println(nan + 1);   // NaN
            System.out.println(nan - 1);   // NaN
            System.out.println(nan * 1);   // NaN
            System.out.println(nan / 1);   // NaN
            System.out.println(nan % 1);   // NaN


         */

        // 비트 논리 연산
        int a = 20; // 0000 0000 0000 0000 0000 0000 0001 0100
        int b = 11; // 0000 0000 0000 0000 0000 0000 0000 1011

        //      0001 0100
        //      0000 1011
        // ->   0000 0000 으로 10진법으로 0
        System.out.println(a & b);

        //      0001 0100
        //      0000 1011
        // ->   0001 1111 으로 10진법으로 31
        System.out.println(a | b);

        //      0001 0100
        //      0000 1011
        // ->   0001 1111 으로 10진법으로 31
        System.out.println(a ^ b);

        //      0000 0000 0000 0000 0000 0000 0001 0100
        // ->   1111 1111 1111 1111 1111 1111 1110 1011 으로 10진법으로 -21
        System.out.println(~a);

        //      0000 0000 0000 0000 0000 0000 0000 1011
        // ->   1111 1111 1111 1111 1111 1111 1111 0100 으로 10진법으로 -12
        System.out.println(~b);

    }

}

