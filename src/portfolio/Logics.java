package portfolio;

public class Logics {
//	このクラスは計算過程を表す
	
	public int calc(Nums m1, Operator o,Nums m2) {
		int an;
		switch(o) {
		case PLUS:
			an = m1.output() + m2.output();
			return an;
		case MINUS:
			an = m1.output() - m2.output();
			return an;
			case MULTIPLY
		}
	};
}
