package loja;


public class Produto {
    private String nome;
    private double preco;
    private String marca;



    public Produto(String nome, double preco, String marca){
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
     }


     public Produto(){ }

     public void setNome(String nome){
        this.nome = nome;
     }
     public void setPreco(double preco){
        this.preco = preco;
     }
     public void setMarca(String marca){
        this.marca = marca;
     }
     public String getNome(){
        return this.nome;
     }
     public double getPreco(){
        return this.preco;
     }
     public String getMarca(){
        return this.marca;
     }

}
