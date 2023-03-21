package myutil;

//generic설정   :   클래스명<임의의Type>  
//                  E: element(요소)  
public class MyArrayList<E> {

	//자바의 모든객체를 저장관리하기 위해서 Object배열로 저장관리함
	E [] data=null;
	
	public int size() {
		
		return (data==null) ? 0 : data.length;
	}
	
	public void add(E newObject) {
		
		//1번째 데이터가 들어올때
		if(data==null) {
			data = (E[]) new Object[1];
			data[0] = newObject;
			return;
		}
		
		//기존데이터(this.size()) 보다 1개 많은 imsi 배열을 생성
		E [] imsi = (E[])new Object[this.size()+1];
		
		//방법1 : 기존배열값을 임시배열로 옮긴다(for)
		for(int i=0;i<this.size();i++) {
			imsi[i] = data[i];
		}
		
		//방법2: System.arraycopy()
		//System.arraycopy(data, 0, imsi, 0, this.size());
		
		//맨마지막첨자에 newObject를 넣는다
		imsi[this.size()] = newObject;
		
		//임시의 배열을 data로 넘겨준다
		data = imsi;
		
	}//end-add()
	
	
	// index번째 데이터를 반환
	//                            throws:예외처리의 양도(위임) 
	//                                   해당메소드(get)을 사용하는 측에서 catch에서 사용
	public E get(int index) throws Exception {
		
		//무효성체크
		if( index<0 || index >= this.size()) {
			
			String message = String.format("첨자의 유효범위는 0~%d사이(현재 입력값:%d)", 
					                                          this.size()-1,   index
					);
			
			throw new Exception(message);
		}
		
		
		return data[index];
		
	}//end-get()
	
	
	public void clear() {
		
		data = null;
	}//end-clear()
	
	
	
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
		E []  imsi = (E [])new Object[this.size()-1];    
		
		//2) 삭제index를 제외한 나머지를 imsi배열로 옮긴다
		//   삭제index보다 작으면 그대로 복사 아니면 다음것 복사
		for(int i=0;i<imsi.length;i++) {
			
			if(i < index) 
				imsi[i] = data[i];  //그대로복사
			else
				imsi[i] = data[i+1];//다음것복사
		}
		
		//3) imsi배열값을 data로 넘긴다
		data = imsi;
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
