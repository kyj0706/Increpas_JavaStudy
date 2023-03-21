package mymain;

// ctrl + shift + o => 코드내에서 불필요한거 없에주고 최적회 시켜줄께 ~ 
//import java.io.FileNotFoundException; 사라짐
import java.io.FileReader;
import java.io.IOException;

public class _04_while_test3_file {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//파일읽어오기
		
		//순서1 예시 파일선택
		
		//강사) 
		//키보드, 파일 , 네트워크로 부터 받아오는 방식은 같다.
		
		//순서2
		//파일을 읽어오는 객체다
		//파일처리는 예외처리를 한다 
		//에러 : FileNotFoundException => java는 안정성을 위해 해당파일이 없으면 어떻게 할래 ? 
		//정상적으로 열리면 첫글자에 포지션 ? -> 다음 한글자씩 읽어온다.
		
		
		FileReader fr = new FileReader("a.txt");//파일열기
		
		int ch; //읽어올 문자 저장할 변수
		
		int count=0;
		
		while(true) {
			
			ch = fr.read(); //현재화일 포지션의 문자 1개를 읽어온다.
			
			
			
			//에러2 해결 : 만약에 조건이 있으면 빠져나와 라고
			//근데 true도 가능성을 열어준거지 조건은 아니다.
			//if(true) break;
			
			//문자는 양수밖에 없다.
			//그래서 -1을 주면 멈춰 !!!  뜻
			//명칭 : EOF(End Of File)을 만나면 -1을 반환
			if(ch==-1) break;
			count++;
			
			System.out.printf("%c", ch);
			
			//읽어오는걸 확인하고 싶다면 ?
			Thread.sleep(10);//1000/1
			
		}//End-while 
		System.out.printf("총문자수:%d개\n",count);

		
		
		
		//순서1_1
		//file 및 자원을 사용중이면 닫기 해줘야한다. 공유자원이라면
		//예외처리
		//에러1 : IOException => java가 또 물어본다. 다쓰고 안닫으면 어떻할꺼야 ?
		//에러2(while시) : Unreachable => 계속 루프되서 빠져 나올수가 없는데. 어쩌라구 ? 
		fr.close();
	}

}
