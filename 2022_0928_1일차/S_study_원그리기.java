import java.util.Scanner;

public class S_study_���׸��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��Ʈ�� ������� �����ϰ� �׸� ��(���׶��)�� ����غ�����. ����� �Է¹޾� �̰��� ��ȭ���� ���ο� ������ ���̰� �ǵ��� �ϰ�, 
		//��ȭ���� "��" ��ȣ�� ä���, ���� "��"���� �׷����ϴ�.
		
		//��Ʈ: ���� �������� x^2 + y^2 = (������)^2 �Դϴ�.
		
		//��������
		int num;
		
		//�Էº��� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����� �Է��ϼ���:");
		num = scanner.nextInt();
		
		for(int i= -num/2; i<=num/2; i++) {
			for(int j= -num/2; j<=num/2; j++) {
				if(i*i+j*j< num/2*num/2 && i*i+j*j > (num-2.5)/2 * (num-2.5)/2) {
					System.out.print("��");
				}else {
					System.out.print("��");
					
				}
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		//�Էú��� ����
		scanner.close();

	}

}
