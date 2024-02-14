package list;

import java.util.ArrayList;

public class Ex03 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	arr.add("111");
	arr.add("222");
	arr.add("333");

	System.out.println(arr.contains("222"));// 해당하는 ArrayList 에 값이 존재하는지 안하는지 확인 = contains
	System.out.println(arr.contains("없는 값")); // arr.contains(object o) : boolean
	
	boolean boo1 = arr.contains("1234");
	if(boo1) {
		System.out.println("입력한 값 존재합니다");
	}else {
		System.out.println("존재하지 않는 값. 다시 입력");
		
	}
	System.out.println("삭제 전 arr : " + arr);
	System.out.println("삭제 전 size : "+ arr.size());
	arr.remove(1);//index 기준으로 삭제 / 지금 111,222,333이 저장되 있으니 222가 첫번째에 있으므로 222가 삭제
	System.out.println("삭제 후 arr : " + arr);
	System.out.println("삭제 후 size : "+ arr.size());
	
	System.out.println();
	
	arr.remove("111");//
	System.out.println("삭제 후 arr : " + arr);
	System.out.println("삭제 후 size : "+ arr.size());
	System.out.println("arr 0 "+ arr.get(0));

}
}
