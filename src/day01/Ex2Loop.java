package day01;

public class Ex2Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ppt 3�� : ��� ����
		// for : Ƚ���� ������ �ݺ�
		// while, do~while : Ƚ���� �������� ���� �ݸ� ���� ���
		for (int i = 1; i <= 10; i++ )
		{
			//����ǥ�� {}�� �� �� �̻��� ��� �ݵ�� ������ϸ� �� ���� ��� ���� ����
			System.out.printf("%5d",  i);
		}
		
		System.out.println(); // 1�� �ѱ�
		int a = 1;
		while(a<=10)
		{
			System.out.println(a++); // a++ : �ϴ� ��� �� 1����(1~10) ���
			System.out.println(++a); // ++a : 1 ���� �� ��� (2~11) ���
		}
		
		System.out.println("�������� ���� a ��:" +a);
	}

}
