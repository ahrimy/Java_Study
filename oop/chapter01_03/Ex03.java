package chapter01_03;
/*
 * #������ ����
 * 1.�ڷ��� (data type)�� ���� ����
 * 1) �⺻�� ����(primitive type)
 * .������ : byte(1), short(2), int(4), long(8)
 * .�Ǽ��� : float(4), double(8)
 * .������ : char(2)
 * .���� : boolean(1)
 * 2) ������ ����(reference type)
 * 
 * 2.���� ��ġ�� ���� �з�
 * 1)Ŭ���� ����
 * Ŭ���� ������ �����ϴ� ������ ����� ���ÿ� ���� �ڵ� �ʱ�ȭ�ȴ�.
 * ����(0), �Ǽ�(0.0), Ŭ����(null)
 * 	(1)static ���� (=Ŭ���� ����)
 * 		Ŭ������.������
 * 	(2)non-static ���� (=�ν��Ͻ� ����)
 * 		Ŭ������ �ν��Ͻ� = new Ŭ������()
 * 		�ν��Ͻ���.������
 * 
 * 2)�޼��� ����
 * 	*���������� ���� �ڵ��ʱ�ȭ���� �ʴ´�.
 *   ����� ���ÿ� �ʱ�ȭ���� ���� �����Ѵ�. 
 */
public class Ex03 {
	static int x;//Ŭ���� ����
	int y;//�ν��Ͻ� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Ex03.x);
				//instance (��ü)
		Ex03 e = new Ex03();
		System.out.println(e.y);
		System.out.println(new Ex03().y);
		int num = 10;
		//�ڵ� �� ��ȯ
		double d = num;
		//double d = (double)num;
		
		System.out.println(num);
		System.out.println(d);
		
		double a = 3.14;
		//�ڵ� �� ��ȯ X
		//���� �� ��ȯ
		int x = (int)a;
		System.out.println(x);
	}

}
