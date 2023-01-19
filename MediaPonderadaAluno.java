
public class MediaPonderadaAluno {
	
	public static void main(String[] args) {
		double nota1, nota2, nota3, peso1, peso2, peso3, media, media2, mediaP;
	
	System.out.print("Digite a primeira nota: ");
	nota1 = Double.parseDouble(System.console().readLine());
	System.out.print("Digite o peso da primeira nota: ");
	peso1 = Double.parseDouble(System.console().readLine());
	
	System.out.print("Digite a segunda nota:");
	nota2 = Double.parseDouble(System.console().readLine());
	System.out.print("Digite o peso da segunda nota:");
	peso2 = Double.parseDouble(System.console().readLine());
	
	System.out.print("Digite a terceira nota:");
	nota3 = Double.parseDouble(System.console().readLine());
	System.out.print("Digite o peso da terceira nota:");
	peso3 = Double.parseDouble(System.console().readLine());
	
	media = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
	media2 = peso1 + peso2 + peso3;
	mediaP = media / media2;
	
	System.out.printf("A media ponderada das notas do aluno sera: %.2f", mediaP);
	
	}

}