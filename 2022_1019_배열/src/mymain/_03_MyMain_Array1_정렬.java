package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class _03_MyMain_Array1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] mr = { 3,2,1,7,6,5,4,8,9};
		
		System.out.println("---[API before sorf]---");
		MyArrays.display_array(mr);
		
		//���� API ����(Ascending Sort : �������� ����)
		//���� API ����(Descending Sort : ��������) �� ���� ... ����� �ִµ� �������Ѵ�.
		Arrays.sort(mr);
		
		System.out.println("---[API after sorf]---");
		MyArrays.display_array(mr);
		
		
		MyArrays.array_sort_asc(mr);
		System.out.println("---[my asc sorf]---");
		MyArrays.display_array(mr);
		
		MyArrays.array_sort_desc(mr);
		System.out.println("---[my desc sorf]---");
		MyArrays.display_array(mr);
		
		//Ư�������� ��Ʈ(����)
		Arrays.sort(mr, 2, 2+4);
		System.out.println("---[API Ư������ sorf ����]---");
		MyArrays.display_array(mr);
		
		//�� API
		MyArrays.array_sort_asc(mr, 2, 2+4);
		System.out.println("---[my Ư������ asc sorf]---");
		MyArrays.display_array(mr);
		
		MyArrays.array_sort_desc(mr, 2, 4);
		System.out.println("---[my Ư������ desc sorf]---");
		MyArrays.display_array(mr);
		
		
	}

}
