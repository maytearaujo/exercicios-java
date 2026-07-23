package classes.bombaCombustivel;

public class BombaCombustivel {
	
	private TipoCombustivel tipoCombustivel;
	private double valorLitro;
	private double qtdCombustivel;
	
	public BombaCombustivel(TipoCombustivel tipoCombustivel, double valorLitro, double qtdCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.qtdCombustivel = qtdCombustivel;
	}

	public double abastecerPorValor(double valorAbastecimento){
		double qtdLitros;
		
		if (valorAbastecimento > 0) {
			
			qtdLitros = valorAbastecimento / this.valorLitro;
			
			if (this.qtdCombustivel >= qtdLitros) {
				alterarQuantidadeCombustivel(qtdLitros);
				return qtdLitros;
			}
		}
		
		return 0;
		
	} 
	
		
	public double abastecerPorLitro(double qtdLitros) {
		double custo;
		
		if (qtdLitros > 0 && this.qtdCombustivel > qtdLitros) {
			custo = qtdLitros * this.valorLitro;
			alterarQuantidadeCombustivel(qtdLitros);
			return custo;
		}
		return 0;
		
	}
	
	public void alterarValor(double valorLitro ){
		this.valorLitro = valorLitro;
	} 
	
	
	public void alterarCombustivel(TipoCombustivel tipoCombustivel){
		this.tipoCombustivel = tipoCombustivel;
	} 
	private void alterarQuantidadeCombustivel(double qtdCombustivel){
		if (this.qtdCombustivel > qtdCombustivel)
			this.qtdCombustivel -= qtdCombustivel;
	} 
	
	
	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}



	public double getValorLitro() {
		return valorLitro;
	}

	public double getQtdCombustivel() {
		return qtdCombustivel;
	}
	
	
}
