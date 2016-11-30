public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		int test = 4;
		Telop(test);
		int test2 = 5;
		vermenigvuldig(test,test2);
	
	}
	public static int Telop (int test){
		
		test = test +1;
		System.out.println(test);
		return test;
	}
	
	public static int vermenigvuldig (int test, int test2){
		
		int res = test * test2;
		System.out.println(res);
		return res;
	}
}
