package example;

public class exam03 {

	public static void main(String[] args) {
		int som=1;
		
		for(int i = 1; i <= 50; i++) {
			if(i % 3 ==0)
				
			som += i;
		}
		
		System.out.println("1부터 10까지 곱셈값은" + som +"입니다");

	}

}
