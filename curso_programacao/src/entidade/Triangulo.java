package entidade;

public class Triangulo {

	public double a;
	public double b;
	public double c;
	public double area;
	
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return b;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public double getC() {
		return c;
	}
	
	public void setC(double c) {
		this.c = c;
	}
	
	public double getArea() {
		double p = (a + b + c) / 2;
		area = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
		return area;
	}
	
}
