package day01;

public class Ex1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("happy");
		System.out.println("nice");
		System.out.println("java");
		
		// �⺻ ������ Ÿ��
		// �⺻�� ( char, int, long, double... )
		// ���۷����� ( ���� Ŭ������ �� ������ Ÿ�� )
		
		char a = 'A', b='��'; // char Ÿ���� 2����Ʈ-�ѱ� �ѱ��ڵ� �Ȱ����� �� ���´�.
		int n = 30; // int : 4����Ʈ (ũ�� �� 21��)
		double f = 12345678; // double�� 8����Ʈ ( ��ȿ���� 15�ڸ������� ��Ȯ�ϰ� ���´�. )
		
		// ���ڿ� �����ϴ� ��� 2����
		String  str = "Happy Day!!";
		String str2 = new String("Java programming!!");
		
		System.out.println("a=" +a );
		System.out.println("b=" +b );
		System.out.println("n=" +n );
		
		System.out.println("f=" +f );
		System.out.println("str="+str+", str2=" +str2);
		
		// printf(5.0���� �߰� )
		// ��ȯ��ȣ�� �̿��ؼ� ��� : ���� : %c, ����: %d, �Ǽ� : %f, ���ڿ� : %s
		
		System.out.printf("a=%c, b=%c, n=%d, f=%f\n",  a, b, n, f);
		System.out.printf("%10.2f\n %10.1f\n",  f,f); // 10: ��ü�ڸ��� 2:�Ҽ��������ڸ���
		System.out.printf("str=%s, str2=%s\n", str, str2);
	}

}
