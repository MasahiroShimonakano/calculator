package portfolio;

public class Operator {
//	このクラスは演算子を表す
	
	static char plus = '+';
	static char minus = '-';
	static char multiply = '*';
	static char devide = '/';
	
	public void rtninput() {
		System.out.println("好きな演算子(+ - × ÷)を入力してください");
		int op1 = new java.util.Scanner(System.in).nextInt();
	}
}
