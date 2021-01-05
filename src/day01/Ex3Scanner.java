package day01;

import java.util.Date;
import java.util.Scanner;

public class Ex3Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 라는 클래스는 jdk 5.0에서 추가됨
		// 키보드 입력을 할 수 있는 클래스 ( 원래는 io클래스 사용 )
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 변수 선언
		String name;
		int year;
		int age;
		
		// 키보드로부터 이름과 태어난 년도 입력 받기
		System.out.println("이름 입력");
		name=sc.nextLine(); // 입력한 문자열을 한 줄 통째로 읽는다.
		System.out.println("태어난 년도 입력");
		year = sc.nextInt(); // 숫자 형태로 읽음
		
		// 나이 계산
		// 현재 년도 구하기 ( Date, Calendar : Date 클래스는 1.1에서 deprecate 되었으면 calendar를 권장하나 Date도 많이사용)
		Date date = new Date();
		
		// 현재 년도 구하기
		int currYear = date.getYear()+1900; // -1900을 한 년도가 반환
		
		// System.out.println(currYear); // 값 확인하기
		
		age = currYear-year+1;
		
		//출력
		System.out.println("내 이름은 " +name + "이고" + year + "년생이며 나이는" + age + "세입니다");
		
	}

}
