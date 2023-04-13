package day02;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 자료형 변환
		 - 특정 자료형을 다른 자료형으로 변환하는 것
		*/
		char ch = 'a';
		int num = 65;
		System.out.println(num);
		System.out.println(ch);
		char ch02 = (char)num; // 강제형 변환
		int num02 = ch; // 자동현 변환
		System.out.println(num02);
		System.out.println(ch02);
	}
}
