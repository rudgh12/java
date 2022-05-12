package exam;

class Cal{
	public int sum(int v1,int v2) {
		return v1+v2;
	}
	//Overloading 과적재 : 원래의 기능에 기능을 더한
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+v3;
		//this는 지금 현재의 값 
	}
}
class Cal3 extends Cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}

	public int sum(int v1, int v2) {
		System.out.println("cal3");
		return super.sum(v1, v2);
	}
	}
	
public class IngeritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
	}

}
