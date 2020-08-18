package chapter3;

public class StringEqualsEx {

	public static void main(String[] args) {
		String srt1 = "자바";
		String srt2 = "자바";
		String srt3 = new String("자바");
		
		System.out.println(srt1 == srt2);
		System.out.println(srt2 == srt3);
		System.out.println();
		System.out.println(srt1.equals(srt2));
		System.out.println(srt1.equals(srt3));
	}

}
