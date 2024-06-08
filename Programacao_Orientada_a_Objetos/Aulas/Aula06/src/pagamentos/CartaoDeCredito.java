package pagamentos;

public class CartaoDeCredito implements FormaPagamento {
    private String numeroCartao;
    private double limite;
    private double limiteUsado;


    @Override
    public double receberPagamento(String chave, double valor){
       if((limiteUsado + valor) < limite) {
        System.out.println("Compra aprovada");
        limiteUsado = limiteUsado + valor;
        return limiteUsado;
       } 
    }
    
    @Override
    public double reembolsar(double valor){
       this.limiteUsado = this.limiteUsado - valor;
       return valor
    }

    @Override
    public String emitirComprovante(){
        return "Comprovante";
    }

}
