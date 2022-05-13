package exam;

public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		try {
		int [] scores = {10,20,30};
		System.out.println(scores[3]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열값 오류 발생했습니다");
		}
		try {
		System.out.println(2/0);
		//예외발생
		}catch(ArithmeticException e) {
			System.out.println("잘못된표현이 있습니다");
		}
		System.out.println(3);
		// TODO Auto-generated method stub

	}

}
