package mymain.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;

public class _04_PersonVo배열역직렬화 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//열린순서 1
		//역직렬화 : 객체조립(복원)
		InputStream is = new FileInputStream("person_array.dat");
		
		//열린순서 2
		//역직렬화 객체 생성
		ObjectInputStream ois = new ObjectInputStream(is);
		
		//복원
		PersonVo [] p_array = (PersonVo[]) ois.readObject();
		
		System.out.println("--[배열 역직렬화 결과]--");
		
		for(PersonVo p : p_array) {
			
			System.out.println(p);
		}
		
		
		
		//닫기(열린역순)
		ois.close();
		is.close();
		

		
	}

}
