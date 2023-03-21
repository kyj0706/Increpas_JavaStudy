package mymain.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;

public class _04_PersonVo�迭������ȭ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//�������� 1
		//������ȭ : ��ü����(����)
		InputStream is = new FileInputStream("person_array.dat");
		
		//�������� 2
		//������ȭ ��ü ����
		ObjectInputStream ois = new ObjectInputStream(is);
		
		//����
		PersonVo [] p_array = (PersonVo[]) ois.readObject();
		
		System.out.println("--[�迭 ������ȭ ���]--");
		
		for(PersonVo p : p_array) {
			
			System.out.println(p);
		}
		
		
		
		//�ݱ�(��������)
		ois.close();
		is.close();
		

		
	}

}
