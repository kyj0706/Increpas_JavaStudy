package mymain.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;

public class _02_PersonVo2������ȭ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//�������� 1
		//������ȭ : ��ü����(����)
		InputStream is = new FileInputStream("person.dat");
		
		//�������� 2
		//������ȭ ��ü ����
		ObjectInputStream ois = new ObjectInputStream(is);
		
		//����
		PersonVo p = (PersonVo) ois.readObject();
		
		System.out.println("--[������ȭ ���]--");
		System.out.println(p);
		
		//�ݱ�(��������)
		ois.close();
		is.close();
		

		
	}

}
