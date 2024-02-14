package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		for(int i= 0 ; i < 3 ; i++) {
			System.out.println(i+1+".번째 메뉴 등록");
		
			//String menu = input.next();
			arr.add(input.next());
		}
		System.out.println("=====등록된 메뉴=====");
		System.out.println(arr);
		System.out.println("======");
		System.out.println("수정할 메뉴 입력");
		String search = input.next();
		System.out.println(arr.contains(search));//해당 하는 문자열이 존재하는지 true , false로 알려줌
		System.out.println(arr.indexOf(search));//해당 하는 값이 존재하는 Index 번호를 알려줌
		System.out.println("-------------------");
	/*	boolean dd = arr.contains(search); --> contains 반환 값이 boolean(String 안됌)으로 출력 하는 방법
		if(dd == true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}*/
		int index = arr.indexOf(search);
		if(index != -1) {//해당 메뉴 존재
			//arr = [김밥,라면,순대] 저장
			System.out.println("수정할 이름 입력");
			String change = input.next();
			System.out.println(arr.get(index)+"=>"+change);
			arr.set(index, change); //set = 수정할 때 사용하는 기능
			System.out.println(" 수정 후 arr : " + arr);
		}else {//존재하지 않는 메뉴
			System.out.println("존재하지 않는 메뉴는 수정 불가");
		}
	}
}