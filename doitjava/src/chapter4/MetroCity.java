package chapter4;
//��Ʈ���������� ����
//1.�����̰� �α��� 100�� �̻�
//2. ���ڰ� 50�� �̻�
//3. 1, 2 �� �ϳ��� �����ϸ� ��Ʈ��������

public class MetroCity {

	public static void main(String[] args) {
		boolean isCapital = false;
		int cityzens =0;
		int riches = 0;
		boolean isMetro = false;
		
		System.out.println("���� ���ô� ��Ʈ���������Դϱ�?");
		isCapital = false;
		cityzens = 150; //�������� ���
		riches = 30;
		
//		if (isCapital) {
//			if (cityzens >= 100) {
//				isMetro = true;
//			} else if (riches >= 50) {
//				isMetro = true;
//			}
//		} else {
//			if (riches >= 50) {
//				isMetro = true;
//			}
//		}
		
//		if(isCapital && cityzens >= 100) {
//			isMetro = true;
//			}else if(riches >= 50 ) {
//			isMetro = true;
//			}else {
//			isMetro = false;
//			}
		
		isMetro = (isCapital && cityzens >= 100) || (riches >= 50) ? true : false;
		System.out.println("��������:" + isCapital);
		System.out.println("�α���:" + cityzens + "����");
		System.out.println("���ڼ�:" + riches + "����");
		System.out.println(isMetro ? "��Ʈ�������� �Դϴ�." : "��Ʈ���������� �ƴմϴ�.");
	}
}
	

