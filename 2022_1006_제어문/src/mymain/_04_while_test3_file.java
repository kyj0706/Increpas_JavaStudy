package mymain;

// ctrl + shift + o => �ڵ峻���� ���ʿ��Ѱ� �����ְ� ����ȸ �����ٲ� ~ 
//import java.io.FileNotFoundException; �����
import java.io.FileReader;
import java.io.IOException;

public class _04_while_test3_file {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//�����о����
		
		//����1 ���� ���ϼ���
		
		//����) 
		//Ű����, ���� , ��Ʈ��ũ�� ���� �޾ƿ��� ����� ����.
		
		//����2
		//������ �о���� ��ü��
		//����ó���� ����ó���� �Ѵ� 
		//���� : FileNotFoundException => java�� �������� ���� �ش������� ������ ��� �ҷ� ? 
		//���������� ������ ù���ڿ� ������ ? -> ���� �ѱ��ھ� �о�´�.
		
		
		FileReader fr = new FileReader("a.txt");//���Ͽ���
		
		int ch; //�о�� ���� ������ ����
		
		int count=0;
		
		while(true) {
			
			ch = fr.read(); //����ȭ�� �������� ���� 1���� �о�´�.
			
			
			
			//����2 �ذ� : ���࿡ ������ ������ �������� ���
			//�ٵ� true�� ���ɼ��� �����ذ��� ������ �ƴϴ�.
			//if(true) break;
			
			//���ڴ� ����ۿ� ����.
			//�׷��� -1�� �ָ� ���� !!!  ��
			//��Ī : EOF(End Of File)�� ������ -1�� ��ȯ
			if(ch==-1) break;
			count++;
			
			System.out.printf("%c", ch);
			
			//�о���°� Ȯ���ϰ� �ʹٸ� ?
			Thread.sleep(10);//1000/1
			
		}//End-while 
		System.out.printf("�ѹ��ڼ�:%d��\n",count);

		
		
		
		//����1_1
		//file �� �ڿ��� ������̸� �ݱ� ������Ѵ�. �����ڿ��̶��
		//����ó��
		//����1 : IOException => java�� �� �����. �پ��� �ȴ����� ��Ҳ��� ?
		//����2(while��) : Unreachable => ��� �����Ǽ� ���� ���ü��� ���µ�. ��¼�� ? 
		fr.close();
	}

}
