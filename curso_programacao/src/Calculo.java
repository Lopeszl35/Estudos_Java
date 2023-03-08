
public class Calculo {

	private int num1;
	private int num2;
	private int calculo;
	
	
	public int getCalculo(int num1, int num2) {
		calculo = num1 + num2;
		
		return calculo;
	}
	
	public void setCalculo(int calculo) {
		this.calculo = calculo;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
