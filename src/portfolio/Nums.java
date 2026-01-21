package portfolio;

public class Nums{
//	このクラスは入力される数字を表す
	
	static int n1 = 1;
	static int n2 = 2;
	static int n3 = 3;
	static int n4 = 4;
	static int n5 = 5;
	static int n6 = 6;
	static int n7 = 7;
	static int n8 = 8;
	static int n9 = 9;
	
	int buttonPushed;
	int[] numberUserWants;
	
	public int newNumber() {
		buttonPushed = new java.util.Scanner(System.in).nextInt();
		
		if(buttonPushed == n1) {
			numberUserWants[0] = n1;
		}
		
	}
	
	
	public int output(){
		System.out.println("数字を入力");
		int nums1 = new java.util.Scanner(System.in).nextInt();
		return nums;
	}
}
