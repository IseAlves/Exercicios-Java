
public class MedidorAnosMesesSemanasDias {
	
	public static void main(String[] args) {
		int anoN, anoA, D, S, M, idade, idadeM, idadeD, idadeS;
	
	System.out.print("Digite o ano do seu nascimento: ");
	anoN = Integer.parseInt(System.console().readLine());
	System.out.print("Digite o ano atual: ");
	anoA = Integer.parseInt(System.console().readLine());
	
	D = 365;
	S = 52;
	M = 12;
	idade = anoA - anoN;
	idadeM = idade * M;
	idadeD = idade * D;
	idadeS = idade * S;
	
	System.out.printf("Uma pessoa que nasceu em %d", anoN, ", no seu aniversario de %d", anoA);
	System.out.printf("tera %d", idade, " anos, %d", idadeM, " meses, %d", idadeS, " semanas e %d", idadeD, " dias.");
	
	}

}
