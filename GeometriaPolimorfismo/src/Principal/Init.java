package Principal;
import Secundaria.Circulo;
import Secundaria.FiguraGeometrica;
import Secundaria.Retangulo;
public class Init {
	  public static void main(String[] args) {
	    // Criando um array de figuras geométricas
	    FiguraGeometrica[] figuras = new FiguraGeometrica[3];
	    figuras[0] = new Retangulo(5, 10);
	    figuras[1] = new Circulo(3);
	    figuras[2] = new Retangulo(7, 3);

	    // Iterando sobre o array e chamando o método calcularArea para cada objeto
	    for (FiguraGeometrica figura : figuras) {
	      System.out.println("Área da figura: " + figura.calcularArea());
	    }
	  }
	}
