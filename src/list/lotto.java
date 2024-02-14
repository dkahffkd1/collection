package list;

public class lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length;i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;
			for(int j = 0; j < i ; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}

		for(int  i = 0; i< lotto.length; i++ ) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		int temp = 0;
		for (int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto.length; j ++) {
				if(lotto[i] > lotto[j]) { //내림차순
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
			}
	}
}
		for(int i = 0; i< lotto.length; i++) {
			System.out.print(lotto[i]+ " ");
		}
	}
}

