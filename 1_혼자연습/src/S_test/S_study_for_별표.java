package S_test;

public class S_study_for_��ǥ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ǥ�� ���ô� ~ 
		
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++ ) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}

}
