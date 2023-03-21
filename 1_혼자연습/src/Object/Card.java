package Object;

public class Card {

	String kind; // spade, diamond, heart , clover 4개
	String number; // 1,2,3,4,5,6,7,8,9,10,j,q,k
	
	String kind_c; // spade, diamond, heart , clover 4개
	String number_c; // 1,2,3,4,5,6,7,8,9,10,j,q,k
	// 기본생성자

	Card() {
		this("SPADE", "1"); // 적으면 오류나는 이유 다른생성자를 바라보는데 그게 없어서.
	}

	Card(String kind, String number) {
		
		this.kind = kind;
		this.number = number;
		this.kind_c = kind;
		this.number_c = number;
	}

	public void Card_c(String kind_c, String number_c) {
		this.kind_c = kind_c;
		this.number_c = number_c;
	}
	
	
}