package mymain.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo3;

public class _09_PersonVo3직렬화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//(객체)직렬화 : 객체를 순서대로 분해하는 과정
		PersonVo3 p = new PersonVo3("일길동",20,"서울시 관악구");
		//System.out.println(p);
		
		//열리는 순서1
		 try (OutputStream os = new FileOutputStream("person_3.dat")) {
			 ObjectOutputStream oos = new ObjectOutputStream(os);
			 
			 oos.writeObject(p);
			 oos.close();//2
			 os.close();//1
			 
		 }catch (IOException e) {
			 System.out.println(e);
		 }
		 
		 try (InputStream is = new  FileInputStream("person_3.dat")){
			 	ObjectInputStream ois = new ObjectInputStream(is);
			 	
			 	PersonVo3 in_p = (PersonVo3) ois.readObject();
			 	
			 	System.out.println(in_p);
			 	
			 	ois.close();
				is.close();
			 
				
		 }catch (IOException | ClassNotFoundException e) {
			 System.out.println(e);
			 
		} 
		
		 
		 
		
		
		
		
		
		
		
		
		
		//닫기(열린역순)
	}

}
