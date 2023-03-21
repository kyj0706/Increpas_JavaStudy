package myutil;

import java.util.ArrayList;

public class MyArrayList {
	
	//순1_2
	//자바의 모든객체를 저장관리하기 위해선 Object배열로 저장관리함
	Object [] data=null;
	
	
	//순1_2
	//method
	//size 를 구해봅시다.
	public int size() {
		
		return (data==null)? 0 :data.length;
	}
	
	//순1_3
	//데이터를 넣어봅시다.
	public void add(Object newObject) {
		
		//순1_4
		//1번째 데이터가 들어올때.
		if(data==null) {
			data = new Object[1];
			data[0] = newObject;
			return;
		}
		
		//순1_5
		//기존데이터보다. 1개 많은 임시 배열을 생성
		Object [] imsi = new Object[this.size()+1];
		
		//순1_6
		//기존배열값을 임시배열로 옮긴다. 
		
		//방법1 for문) : 기존배열 값을 임시배열로 옮긴다
		for(int i=0; i<this.size(); i++) {
			imsi[i] = data[i];
		}
		
		//방법2: System.arraycopy()
		//0System.arraycopy(data, 0, imsi, 0,this.size());
		
		
		
		//순1_7
		//맨마지막 값에 newObject를 넣는다
		imsi[this.size()] = newObject;
		
		//순1_8
		//임시의 배열을 data로 넘겨준다
		data = imsi;
		
	}//end : add()
								 //throws: 예외처리의 양도(위임)
	//									 해당메소드(get)을 사용하는 측에서 catch해서 사용 해라
	public Object get(int index) throws Exception{
		
		//무효성체크
		if(index<0 || index>=this.size()) {
			String message = String.format("첨자의 유효범위는 0~%d사이(현재 입력값: %d )"
														,this.size()-1, index
					);
			throw new Exception(message);
		}
		
		return data[index];
	}//end : get
	
	//모두삭제
	public void clear() {
		data =null;
	}
	
	//remove
	public void remove(int index) throws Exception {
		//무효성체크
				if( index<0 || index >= this.size()) {
					
					String message = String.format("첨자의 유효범위는 0~%d사이(현재 입력값:%d)", 
							                                          this.size()-1,   index
							);
					
					throw new Exception(message);
				}
				
				//삭제코드 작성
				
				//1.데이터가 한개남았을때
				if(this.size()==1) {
					data = null;
					return;
				}
				
				
				
				//2.2개이상 남았을때
				//1) 이전데이터보다 1개 적게 배열생성(imsi)
				Object [] imsi = new Object[this.size()-1];    
				
				//2) 삭제index를 제외한 나머지를 imsi배열로 옮긴다
				/*for(int i= 0; i<imsi.length; i++) {
					if(i <index)
						imsi[i] = data[i];
					else
						imsi[i] = data[i+1];
				}*/
				
				
				for(int i=0; i<imsi.length; i++) {
					if(i<index)
					
					imsi[i] = data[i];
					else 
						imsi[i] = data[i+1];
						
					
				}
				
				
				
				
				//3) imsi배열값을 data로 넘긴다
				data = imsi;
		
		
		
	  

	}

}
