package chapter4;
//메트로폴리스의 조건
//1.수도이고 인구가 100만 이상
//2. 부자가 50만 이상
//3. 1, 2 중 하나만 만족하면 메트로폴리스

public class MetroCity {

	public static void main(String[] args) {
		boolean isCapital = false;
		int cityzens =0;
		int riches = 0;
		boolean isMetro = false;
		
		System.out.println("현제 도시는 메트로폴리스입니까?");
		isCapital = false;
		cityzens = 150; //만단위를 사용
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
		System.out.println("수도여부:" + isCapital);
		System.out.println("인구수:" + cityzens + "만명");
		System.out.println("부자수:" + riches + "만명");
		System.out.println(isMetro ? "메트로폴리스 입니다." : "메트로폴리스가 아닙니다.");
	}
}
	

