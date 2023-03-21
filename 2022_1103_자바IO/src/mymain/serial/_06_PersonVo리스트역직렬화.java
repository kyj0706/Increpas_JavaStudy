package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _06_PersonVo리스트역직렬화 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//열린순서 1
		//역직렬화 : 객체조립(복원)
		InputStream is = new FileInputStream("person_list.dat");
		
		//열린순서 2
		//역직렬화 객체 생성
		ObjectInputStream ois = new ObjectInputStream(is);
		
		//복원
		List<PersonVo> p_list = (ArrayList<PersonVo>) ois.readObject();
		//PersonVo [] p_list = (PersonVo[]) ois.readObject();
		
		System.out.println("--[배열 역직렬화 결과]--");
		
		for(PersonVo p : p_list) {
			
			System.out.println(p);
		}
		
		
		
		//닫기(열린역순)
		ois.close();
		is.close();
		

		
	}

}
