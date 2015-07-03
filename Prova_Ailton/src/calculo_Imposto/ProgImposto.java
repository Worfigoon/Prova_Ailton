package calculo_Imposto;

public class ProgImposto {

	public static void main(String[] args) {
		
		Imposto valor = new Imposto();
		
		valor.setProduto("Computador");
		valor.setCotacao_Dia(-3);
		valor.setValor_Produto_Dolares(50.0);
		
		System.out.println("Produto: " + valor.getProduto());
		System.out.println("Valor produto em dolares: $ " + valor.getValor_Produto_Dolares());
		System.out.println("Cotação do dolar: R$ " + valor.cotacao_Dia);
		valor.valor_Imposto();
		
	}}