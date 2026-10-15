public class Personagem {
    //Atributos
    String nome = "";
    int vida = 0;
    

    public Personagem(String nome,int vida ){
        this.nome=nome;
        this.vida=vida;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public int getVida(){
        return this.vida;
    }
    public void setVida(int vida){
        
        this.vida=vida;
    }




}