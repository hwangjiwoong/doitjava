package chapter022;

public class CastingEx {

	public static void main(String[] args) {
		int iVal = 40432;
		char cVal = (char) iVal;
	 	System.out.println(cVal);
	 	
	 	long lVal = 500;
	 	iVal = (int) lVal;
	 	System.out.println(iVal);
	 	
	 	double dVal = 3.14;
	 	iVal = (int) dVal;
	 	System.out.println(iVal);
	 	
	 	int iNum = 1030229770;
	 	byte bNum = (byte) iNum;
	 	System.out.println(bNum);

	}

}
