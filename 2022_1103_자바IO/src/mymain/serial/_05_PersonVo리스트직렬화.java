package mymain.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _05_PersonVo����Ʈ����ȭ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//(��ü)����ȭ : ��ü�� ������� �����ϴ� ����
		List<PersonVo> p_list = new ArrayList<PersonVo>();
		
		p_list.add(new PersonVo("�ϱ浿 ", 20, "����� ���Ǳ� �Ÿ�1��"));
		p_list.add(new PersonVo("�̱浿 ", 21, "����� ���Ǳ� �Ÿ�2��"));
		p_list.add(new PersonVo("��浿 ", 22, "����� ���Ǳ� �Ÿ�3��"));
		p_list.add(new PersonVo("��浿 ", 23, "����� ���Ǳ� �Ÿ�4��"));
		p_list.add(new PersonVo("���浿 ", 24, "����� ���Ǳ� �Ÿ�5��"));
		
		
	
		//System.out.println(p);
		//������ ����1
		OutputStream os = new FileOutputStream("person_list.dat");
		
		//�����¼���2
		//��ü����ȭ ó����ü ����
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		
		//����ȭó��(ȭ������)
		oos.writeObject(p_list);
		
		
		
		
		
		
		//�ݱ�(��������)
		oos.close();//2
		os.close();//1
	}

}
