package mymain;

public class _04_관계연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//관계(비교)연산자 	: >(크냐) >=(크거나같냐) <(작냐) <=(작거나같냐) ==(같냐) !=(같지않냐??)
		//					: 결과값 boolean : true or false
		
		//순서1
		int a=3, b=2;
		System.out.printf("%d > %d -> %b\n", a,b ,(a>b));
		System.out.printf("%d >= %d -> %b\n", a,b ,(a>=b));

		
		System.out.printf("%d < %d -> %b\n", a,b ,(a<b));
		System.out.printf("%d <= %d -> %b\n", a,b ,(a<=b));

		System.out.printf("%d == %d -> %b\n", a,b ,(a==b));
		System.out.printf("%d != %d -> %b\n", a,b ,(a!=b));
	}

}
