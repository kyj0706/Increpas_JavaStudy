package Object;

public class Card {

	String kind; // spade, diamond, heart , clover 4��
	String number; // 1,2,3,4,5,6,7,8,9,10,j,q,k
	
	String kind_c; // spade, diamond, heart , clover 4��
	String number_c; // 1,2,3,4,5,6,7,8,9,10,j,q,k
	// �⺻������

	Card() {
		this("SPADE", "1"); // ������ �������� ���� �ٸ������ڸ� �ٶ󺸴µ� �װ� ���.
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