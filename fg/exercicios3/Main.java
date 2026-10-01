public class Main {
    public static void main (String [] args){
        Cesta item1=  new Cesta("001", "panetone","2", "15");
        Cesta item2=  new Cesta("0002", "pessego", "1", "6");
        Cesta item3 = new Cesta("0003", "ROSQUINHAS", "1", "5");
        Cesta item4 = new Cesta("0004", "cerveja", "12","15");
        
      //  System.out.println("Carro 1: " + carro_1.marca);
      Cesta[] coisas = {item1, item2, item3, item4 };
        for (Cesta item: coisas) {
            System.out.println("codigo:" + item.codigo);
            System.out.println("nome:" + item.nome);
            System.out.println("quantidade:" + item.quantidade);
            System.out.println("preco:" + item.preco + "\n");
           
        }
 
    }
}