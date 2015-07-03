package calculo_Imposto;

	public class Imposto {
	public String produto= "";
	public double valor_Produto_Dolares = 0.0;
	public double cotacao_Dia = 0.0;
	public double valor_Imposto = 0.0;
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		if(produto != null){
			this.produto = produto;
		}else{
			System.out.println("Nome produto invalido!!! ");
		}
	}
	
	public double getValor_Produto_Dolares() {
		return valor_Produto_Dolares;
	}
	public void setValor_Produto_Dolares(double valor_Produto_Dolares) {
		if(valor_Produto_Dolares > 0){
			this.valor_Produto_Dolares = valor_Produto_Dolares;
		}else{
			System.out.println("Valor produto em dolares invalido!!!");
		}	
	}
	
	public double getCotacao_Dia() {
		return cotacao_Dia;
	}
	public void setCotacao_Dia(double cotacao_Dia) {
		if(cotacao_Dia > 0){
			this.cotacao_Dia = cotacao_Dia;
		}else{
			System.out.println("Valor de cotação invalido!!!");
		}
	}
	
	public double valor_Imposto() {
		
		if(this.cotacao_Dia > 0 && this.valor_Produto_Dolares > 0){
			if(this.valor_Produto_Dolares < 50){
				this. valor_Imposto = 0.0;
					System.out.println("Produto isento de impostos: R$ " + this.valor_Imposto);
		}else{
			this.valor_Imposto = (this.valor_Produto_Dolares * .6) * this.cotacao_Dia;
				System.out.println("Valor do imposto a ser pago em reais: R$ " + this.valor_Imposto);
			}	
		}
		return valor_Imposto;	
	}
	
	
	
	
	

}
