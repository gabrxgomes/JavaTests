package Secundaria;

public class Retangulo extends FiguraGeometrica {
	  private double base;
	  private double altura;

	  public Retangulo(double base, double altura) {
	    this.base = base;
	    this.altura = altura;
	  }

	  public double calcularArea() {
	    return base * altura;
	  }
}
