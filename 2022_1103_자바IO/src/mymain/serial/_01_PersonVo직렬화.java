package mymain.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;

public class _01_PersonVo����ȭ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//(��ü)����ȭ : ��ü�� ������� �����ϴ� ����
		PersonVo p = new PersonVo("�ϱ浿 ", 20, "����� ���Ǳ� �Ÿ���");
		//System.out.println(p);
		//������ ����1
		OutputStream os = new FileOutputStream("person.dat");
		
		//�����¼���2
		//��ü����ȭ ó����ü ����
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		
		//����ȭó��(ȭ������)
		oos.writeObject(p);
		
		
		
		
		
		
		//�ݱ�(��������)
		oos.close();//2
		os.close();//1
	}

}
