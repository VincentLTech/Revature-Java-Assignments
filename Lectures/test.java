public class test {
    
}
class Revature {
	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			System.out.println(i);

			// System.out.println(i++ + ",");
			// System.out.println(i++);
		
		}
	}
}

class Test1{
	public static void main(String[] args) {
		int i = 0;
		while(i<5){
			if(i<5){
				if(i==0){
					System.out.println(0);
				}
				i++;
				System.out.print(i + ": ");
				System.out.println((i > 2 ? 1 : 2));
				System.out.println();
			}
		}
	}
}

class OverloadingTest {

	void m1(int x) {
		System.out.println("m1 int");
	}

	void m1(double x) {
		System.out.println("m1 double");
	}

	void m1(String x) {
		System.out.println("m1 String");
	}
}

class TestClass {
	public static void main(String[] args) throws Exception {
		OverloadingTest ot = new OverloadingTest();
		ot.m1(1.0);
	}
}




class assessment{
	public static void main(String[] args) {
		int end=30;
		int i = 0;
		for(int j=0; j<end; j++) {
			if(end%15==0){
				i++;
			}
		}
		System.out.println(i);
	}
}

