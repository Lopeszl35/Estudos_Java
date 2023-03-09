package entidade;

public class Triangulo {

	public double a;
	public double b;
	public double c;
	public double p;
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
	
	public void setP(double p) {
		this.p = p;
	}
	
	public double getP() {
		this.p = (this.a + this.b + this.c) / 2;
		return p;
	}
	
	public double getArea() {
		getP();
		area = Math.sqrt(this.p * (this.p - this.a) * (this.p - this.b) * (this.p - this.c));
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
}
