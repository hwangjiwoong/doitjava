package chapter3;

public class StringEqualsEx {

	public static void main(String[] args) {
		String srt1 = "�ڹ�";
		String srt2 = "�ڹ�";
		String srt3 = new String("�ڹ�");
		
		System.out.println(srt1 == srt2);
		System.out.println(srt2 == srt3);
		System.out.println();
		System.out.println(srt1.equals(srt2));
		System.out.println(srt1.equals(srt3));
	}

}
