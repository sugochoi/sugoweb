package day01;

import java.util.Date;
import java.util.Scanner;

public class Ex3Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner ��� Ŭ������ jdk 5.0���� �߰���
		// Ű���� �Է��� �� �� �ִ� Ŭ���� ( ������ ioŬ���� ��� )
		
		Scanner sc = new Scanner(System.in);
		
		// �Է¹��� ���� ����
		String name;
		int year;
		int age;
		
		// Ű����κ��� �̸��� �¾ �⵵ �Է� �ޱ�
		System.out.println("�̸� �Է�");
		name=sc.nextLine(); // �Է��� ���ڿ��� �� �� ��°�� �д´�.
		System.out.println("�¾ �⵵ �Է�");
		year = sc.nextInt(); // ���� ���·� ����
		
		// ���� ���
		// ���� �⵵ ���ϱ� ( Date, Calendar : Date Ŭ������ 1.1���� deprecate �Ǿ����� calendar�� �����ϳ� Date�� ���̻��)
		Date date = new Date();
		
		// ���� �⵵ ���ϱ�
		int currYear = date.getYear()+1900; // -1900�� �� �⵵�� ��ȯ
		
		// System.out.println(currYear); // �� Ȯ���ϱ�
		
		age = currYear-year+1;
		
		//���
		System.out.println("�� �̸��� " +name + "�̰�" + year + "����̸� ���̴�" + age + "���Դϴ�");
		
	}

}
