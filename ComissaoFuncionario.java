
public class ComissaoFuncionario {
	
	public static void main(String[] args) {
		double salarioBase, comissao, imposto, salarioTotal;
	
	System.out.print("Digite o salario base do funcionario: ");
	salarioBase = Double.parseDouble(System.console().readLine());

	comissao = (salarioBase * 5) / 100;
	imposto = (comissao * 7) / 100;
	salarioTotal = salarioBase - imposto;
	
	System.out.printf("O funcionário recebera R§ %.2f", salarioTotal, " reais.");
	
	}

}


