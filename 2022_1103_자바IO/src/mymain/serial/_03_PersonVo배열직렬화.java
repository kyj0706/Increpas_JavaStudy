package mymain.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;

public class _03_PersonVo�迭����ȭ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//(��ü)����ȭ : ��ü�� ������� �����ϴ� ����
		PersonVo [] p_array = {
								new PersonVo("�ϱ浿 ", 20, "����� ���Ǳ� �Ÿ�1��"),
								new PersonVo("�̱浿 ", 21, "����� ���Ǳ� �Ÿ�2��"),
								new PersonVo("��浿 ", 22, "����� ���Ǳ� �Ÿ�3��")
		
							
		                       };
		//System.out.println(p);
		//������ ����1
		OutputStream os = new FileOutputStream("person_array.dat");
		
		//�����¼���2
		//��ü����ȭ ó����ü ����
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		
		//����ȭó��(ȭ������)
		oos.writeObject(p_array);
		
		
		
		
		
		
		//�ݱ�(��������)
		oos.close();//2
		os.close();//1
	}

}
