public class Main{
    public static void main(String[] args){
        Personagem personagem1 = new Personagem ("Itaipava", 100);
        // this.nome ="Itaipava";
        // this.vida = 100;
        // this.tipo ="Bebado";
        // this.Poder ="Agua";
        
    System.out.println("nome" + this.nome);
        Poder poder1 = new Poder("Agua");
        Poder[] poderes = {poder1};
        for(Poder poderz : poderes){
        System.out.println(poderz.getPoder());
        }
        Tipo tipo1 = new Tipo("bebado");
        Tipo[] tipos = {tipo1};
        for(Tipo tipoz : tipos){
        System.out.println(tipoz.getTipo());
    }
}
}