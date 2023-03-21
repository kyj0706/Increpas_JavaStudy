package S_test;
import java.util.Arrays;
import java.util.Random;

public class S_Study_로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int Lotto[] = new int[6];
		 Random random = new Random();
		 
		 for(int i=0; i<Lotto.length; i++) {
			Lotto[i] = random.nextInt(45)+1;
			//중복제거
			for(int j=0; j <i; j++) {
				if(Lotto[i] == Lotto[j]) {
					i--;
					break;
				}
			}
		 }
		//정렬
		 for(int i=0; i<Lotto.length-1; i++) {
			 for(int j=i+1; j<Lotto.length; j++) {
				 if(Lotto[i] > Lotto[j]) {
					 int temp = Lotto[i];
					 Lotto[i] = Lotto[j];
					 Lotto[j] = temp;
				 }
			 }
		 }
		 
		 
		 System.out.println("로또번호 : "+Arrays.toString(Lotto));
		 System.out.printf("로또번호 %s" ,Arrays.toString(Lotto));
		 
	}

}
