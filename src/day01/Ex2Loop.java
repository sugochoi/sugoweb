package day01;

public class Ex2Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ppt 3장 : 제어문 참조
		// for : 횟수가 정해진 반복
		// while, do~while : 횟수가 정해지지 않은 반목에 많이 사용
		for (int i = 1; i <= 10; i++ )
		{
			//구역표시 {}는 두 줄 이상인 경우 반드시 해줘야하며 한 줄인 경우 생략 가능
			System.out.printf("%5d",  i);
		}
		
		System.out.println(); // 1줄 넘김
		int a = 1;
		while(a<=10)
		{
			System.out.println(a++); // a++ : 일단 출력 후 1증가(1~10) 출력
			System.out.println(++a); // ++a : 1 증가 후 출력 (2~11) 출력
		}
		
		System.out.println("빠져나온 후의 a 값:" +a);
	}

}
