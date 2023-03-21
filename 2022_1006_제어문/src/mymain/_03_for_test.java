package mymain;

public class _03_for_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//순서1
		//질문 : 수행은 몇번까지 하는가
		//i는 0~10까지 그래서 11번까지 도는데 
		// 11<10은 false니깐  출력은 10번만 된다.
		
		//순서4
		int sum =0; //i값을 누적할 변수
		
		
		for(int i=1; i<=10; i++) {
			
			//누적식
			//sum = sum +i;
			//줄여서
			sum += i;
			
			//============= i 변화 값을 보기 위한===========
			//System.out.print(i);
			
			
			//순서3
			//if(i<10)
			//1부터 10까지 더해봅시다.
			//순서1
			//System.out.print('+');
			//else
			//순서2
			//System.out.print('=');
			
			//예외처리 때문에 에러
			//try catch 를 해야한다.
			//딜레이가 되서 출력이 되는것을 보여주기 위함
			//Thread.sleep(1000); // 1/1000(초) 대기
			//===============================================
		
		}
		//System.out.println(55); // 보여주기위한
		System.out.println("sum의 결과 : "+sum);
	}

}
