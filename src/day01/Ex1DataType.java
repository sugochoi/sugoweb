package day01;

public class Ex1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("happy");
		System.out.println("nice");
		System.out.println("java");
		
		// 기본 데이터 타입
		// 기본형 ( char, int, long, double... )
		// 래퍼런스형 ( 각종 클래스로 된 데이터 타입 )
		
		char a = 'A', b='가'; // char 타입은 2바이트-한글 한글자도 안개지고 잘 나온다.
		int n = 30; // int : 4바이트 (크기 약 21억)
		double f = 12345678; // double은 8바이트 ( 유효숫자 15자리까지는 정확하게 나온다. )
		
		// 문자열 생성하는 방법 2가지
		String  str = "Happy Day!!";
		String str2 = new String("Java programming!!");
		
		System.out.println("a=" +a );
		System.out.println("b=" +b );
		System.out.println("n=" +n );
		
		System.out.println("f=" +f );
		System.out.println("str="+str+", str2=" +str2);
		
		// printf(5.0에서 추가 )
		// 변환기호를 이용해서 출력 : 문자 : %c, 정수: %d, 실수 : %f, 문자열 : %s
		
		System.out.printf("a=%c, b=%c, n=%d, f=%f\n",  a, b, n, f);
		System.out.printf("%10.2f\n %10.1f\n",  f,f); // 10: 전체자리수 2:소숫점이하자리수
		System.out.printf("str=%s, str2=%s\n", str, str2);
	}

}
