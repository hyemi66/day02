package day02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 예제
		String name;
		int num1;
		int num2;
		int num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = sc.next();
		System.out.print(name + "님의 국어 점수 : ");
		num1 = sc.nextInt();
		System.out.print(name + "님의 영어 점수 : ");
		num2 = sc.nextInt();
		System.out.print(name + "님의 수학 점수 : ");
		num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		
		System.out.println("===========");
		System.out.println("이름 : " + name);
		System.out.println("===========");
		System.out.println("국어 : " + num1);
		System.out.println("영어 : " + num2);
		System.out.println("수학 : " + num3);
		System.out.println("===========");
		System.out.println("합계 : " + sum);
		System.out.println("===========");
	}
}
