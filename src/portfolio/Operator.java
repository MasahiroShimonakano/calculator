package portfolio;

public class Operator {
//	このクラスは演算子を表す
	
	char plus = '+';
	char minus = '-';
	char multiply = '*';
	char devide = '/';
	public void rtninput() {
		System.out.println("好きな演算子(+ - × ÷)を入力してください");
		int op1 = new java.util.Scanner(System.in).nextInt();
	}
}
