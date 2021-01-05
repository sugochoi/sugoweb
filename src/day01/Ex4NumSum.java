package day01;

import java.util.Scanner;

public class Ex4NumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복해서 숫자를 입력하다가 0을 입력하면 반복문을 빠져나와서 입력한 갯수와 합계 평균을 출력해보자
		
		// 1. 변수 선언
		
		Scanner sc = new Scanner(System.in);
		
		int score, tot=0, count=0;
		
		double avg;
		
		// 2. 입력받기 & 로직
		
		while(true)
		{
			System.out.println("점수 입력하기 ( 종료 : 0 )=> ");
			score = sc.nextInt();
			
			// 0일 경우 반복문 빠져나가기
			if(score == 0)
				break;
			
			// 잘못 입력한 경우 다시 처음으로 돌아가기
			if(score < 0 || score > 100)
			{
				System.out.println("\t잘못된 점수입니다");
				continue; // 조건식으로 돌아간다
			}
			
			//점수를 제대로 입력한 경우
			count++; // 갯수 증가
			tot+=score; // 합계 변수에 입력한 점수를 누적해서 더한다.
			
			// 3. 출력
			// 평균 구하기
			// 두 변수 중 한개는 double로 강제 형변환을 한다
			avg=(double)tot/count; // 자바에서는 정수/정수는 무조건 정수타입으로 계산된다.
			
			System.out.println("총"+count+"개");
			System.out.println("총 합계:"+tot);
			System.out.println("평균:"+avg);
		}
	}

}
