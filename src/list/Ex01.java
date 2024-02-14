package list;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>(); //<E> <- 자료 형 / 문자형 String
		arr.add("안녕");
		arr.add("하세요");
		System.out.println("arr : " + arr); // add는 문자열을 추가 = add(String)
		String s = arr.get(0); // get  = 가져오다 -> 저장된 값의 0번째 문자열을 빼오겠다 / get(int index)= String<- int + index/
		System.out.println("- :" + s);
}
}
