package list;

import java.util.ArrayList;
import java.util.Random;

public class array {
	public static void main(String[] args) {
		ArrayList<Integer> 학생1 = new ArrayList<>();
		ArrayList<Integer> 학생2 = new ArrayList<>();
		ArrayList<Integer> 학생3 = new ArrayList<>();
		Random random = new Random();
		for (int i=0 ; i<3; i++) { // 순서 int i=0; -> 조건문 -> i++ -> i<3
			학생1.add(random.nextInt(100)+1);
			학생2.add(random.nextInt(100)+1);
			학생3.add(random.nextInt(100)+1);
		}
		System.out.println("첫번째 학생 점수"+학생1);
		System.out.println("두번째 학생 점수"+학생2);
		System.out.println("세번째 학생 점수"+학생3);

		int k = 학생1.get(0); int k2 = 학생2.get(0); int k3 = 학생3.get(0);
		int e = 학생1.get(1); int e2 = 학생2.get(1); int e3 = 학생3.get(1);
		int m = 학생1.get(2); int m2 = 학생2.get(2); int m3 = 학생3.get(2);
		
		if(k>k2 && k>k3) {
			System.out.println("국어 성적 1등은 첫번째 학생입니다.");
		}else if(k2>k && k2>k3) {
			System.out.println("국어 성적 1등은 두번째 학생입니다.");
		}else {
			System.out.println("국어 성적 1등은 세번째 학생입니다.");
		}
		if(e>e2 && e>e3) {
			System.out.println("영어 성적 1등은 첫번째 학생입니다.");
		}else if(e2>e && e2>e3) {
			System.out.println("영어 성적 1등은 두번째 학생입니다.");
		}else {
			System.out.println("영어 성적 1등은 세번째 학생입니다.");
		}
		if(m>m2 && m>m3) {
			System.out.println("매쓰 성적 1등은 첫번째 학생입니다.");
		}else if(m2>m && m2>m3) {
			System.out.println("매쓰 성적 1등은 두번째 학생입니다.");
		}else {
			System.out.println("매쓰 성적 1등은 세번째 학생입니다.");
		}
		int sum1=0; int sum2 =0; int sum3=0;
				sum1 = k+e+m;
				sum2 = k2+e2+m2;
				sum3 = k3+e3+m3;
				
				if(sum1>sum2 && sum1>sum3) {
					System.out.println("전체 1등은 첫번째 학생입니다.");
				}else if(sum2>sum1 && sum2>sum3) {
					System.out.println("전체 1등은 두번째 학생입니다.");
				}else
				System.out.println("전체 1등은 세번째 학생입니다.");
		}
}