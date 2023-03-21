package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class _03_MyMain_Array1_정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] mr = { 3,2,1,7,6,5,4,8,9};
		
		System.out.println("---[API before sorf]---");
		MyArrays.display_array(mr);
		
		//기존 API 정렬(Ascending Sort : 오름차순 정렬)
		//기존 API 정렬(Descending Sort : 내림차순) 이 없다 ... 방법은 있는데 만들어야한다.
		Arrays.sort(mr);
		
		System.out.println("---[API after sorf]---");
		MyArrays.display_array(mr);
		
		
		MyArrays.array_sort_asc(mr);
		System.out.println("---[my asc sorf]---");
		MyArrays.display_array(mr);
		
		MyArrays.array_sort_desc(mr);
		System.out.println("---[my desc sorf]---");
		MyArrays.display_array(mr);
		
		//특정구간만 소트(정렬)
		Arrays.sort(mr, 2, 2+4);
		System.out.println("---[API 특정구간 sorf 기존]---");
		MyArrays.display_array(mr);
		
		//내 API
		MyArrays.array_sort_asc(mr, 2, 2+4);
		System.out.println("---[my 특정구간 asc sorf]---");
		MyArrays.display_array(mr);
		
		MyArrays.array_sort_desc(mr, 2, 4);
		System.out.println("---[my 특정구간 desc sorf]---");
		MyArrays.display_array(mr);
		
		
	}

}
