package mymain.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;
import vo.PersonVo2;

public class _08_PersonVo������ȭ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//�������� 1
		//������ȭ : ��ü����(����)
		InputStream is = new FileInputStream("person_2.dat");
		
		//�������� 2
		//������ȭ ��ü ����
		ObjectInputStream ois = new ObjectInputStream(is);
		
		//����
		PersonVo2 p = (PersonVo2) ois.readObject();
		
		System.out.println("--[������ȭ ���]--");
		System.out.println(p);
		
		//�ݱ�(��������)
		ois.close();
		is.close();
		

		
	}

}
