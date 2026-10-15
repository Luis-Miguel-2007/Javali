public class Personagem {
    String nome;
    int vida;
    //Tipo[] tipo;
    List<Tipo> tipo;
    List<Poder> poder;

    public Personagem(String nome, int vida, String tipo, String poder){
        this.nome = nome;
        this.vida = vida;
        Tipo tipo1 = new Tipo(tipo);
        this.tipo.add(tipo1);
        Poder poder1 = new Poder (poder);
        this.poder.add(poder1);
    }
public void setNome (String nome){
    this.nome = nome;
    return this.nome;
}
    public void setVida (int vida){
        this.vida = vida;
    }
    public int getVida(){
        return this.vida;
    }

    public static void main (String[] args){
        Personagem person_1 = new Personagem ("Ben 10", 100, "Mutante", "transformar");
        Personagem person_2 = new Personagem ("Batman", 2, "Orfao", "Dinheiro");

        List<Personagem> personagens;
        personagens.add(person_1)
        personagens.add(person_2)
    };
}