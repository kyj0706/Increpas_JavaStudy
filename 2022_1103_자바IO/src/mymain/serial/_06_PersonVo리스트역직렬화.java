package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _06_PersonVo����Ʈ������ȭ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//�������� 1
		//������ȭ : ��ü����(����)
		InputStream is = new FileInputStream("person_list.dat");
		
		//�������� 2
		//������ȭ ��ü ����
		ObjectInputStream ois = new ObjectInputStream(is);
		
		//����
		List<PersonVo> p_list = (ArrayList<PersonVo>) ois.readObject();
		//PersonVo [] p_list = (PersonVo[]) ois.readObject();
		
		System.out.println("--[�迭 ������ȭ ���]--");
		
		for(PersonVo p : p_list) {
			
			System.out.println(p);
		}
		
		
		
		//�ݱ�(��������)
		ois.close();
		is.close();
		

		
	}

}
