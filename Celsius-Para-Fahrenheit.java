
public class CelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		double tempC, tempF, temperatura;
	
	System.out.print("Digite a temperatura em graus Celsius: ");
	tempC = Double.parseDouble(System.console().readLine());

	tempF = (9 * tempC) / 5;
	temperatura = tempF + 32;
	
	System.out.printf("Essa temperatura sera %.2f", temperatura, " graus em Fahrenheit.");
	
	}

}
