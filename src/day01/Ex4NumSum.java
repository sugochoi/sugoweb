package day01;

import java.util.Scanner;

public class Ex4NumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ݺ��ؼ� ���ڸ� �Է��ϴٰ� 0�� �Է��ϸ� �ݺ����� �������ͼ� �Է��� ������ �հ� ����� ����غ���
		
		// 1. ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		int score, tot=0, count=0;
		
		double avg;
		
		// 2. �Է¹ޱ� & ����
		
		while(true)
		{
			System.out.println("���� �Է��ϱ� ( ���� : 0 )=> ");
			score = sc.nextInt();
			
			// 0�� ��� �ݺ��� ����������
			if(score == 0)
				break;
			
			// �߸� �Է��� ��� �ٽ� ó������ ���ư���
			if(score < 0 || score > 100)
			{
				System.out.println("\t�߸��� �����Դϴ�");
				continue; // ���ǽ����� ���ư���
			}
			
			//������ ����� �Է��� ���
			count++; // ���� ����
			tot+=score; // �հ� ������ �Է��� ������ �����ؼ� ���Ѵ�.
			
			// 3. ���
			// ��� ���ϱ�
			// �� ���� �� �Ѱ��� double�� ���� ����ȯ�� �Ѵ�
			avg=(double)tot/count; // �ڹٿ����� ����/������ ������ ����Ÿ������ ���ȴ�.
			
			System.out.println("��"+count+"��");
			System.out.println("�� �հ�:"+tot);
			System.out.println("���:"+avg);
		}
	}

}
