
public class MedidorDistancias {

	public static void main(String[] args) {
		double valor, polegadas, pes, jardas, milias;
	
	System.out.print("Digite um valor em pes: ");
	valor = Double.parseDouble(System.console().readLine());
	
	polegadas = 12;
	pes = polegadas * valor;
	jardas = (3 * pes) * valor;
	milias = (1760 * jardas) * valor;
	
	System.out.printf("O valor %.2f", valor, " representa %.2f", polegadas, " polegadas %.2f,", jardas, " jardas e %.2f", milias, " milias.");
	
	}
	
}
