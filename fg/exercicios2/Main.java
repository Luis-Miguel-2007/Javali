public class Main {
    public static void main (String [] args){
        Alunos aluno1 = new Alunos("Fabio", "shaolinmatadordeporco@gmail.com");
        Alunos aluno2= new Alunos("Bistecone", "file@gmail.com");
        Alunos aluno3 = new Alunos("Homer", "ROSQUINHAS@gmail.com");
        Alunos aluno4 = new Alunos("Geraldo", "BalancoGeral@gmail.com");
        
      //  System.out.println("Carro 1: " + carro_1.marca);
      Alunos[] Dados = {aluno1, aluno2, aluno3, aluno4 };
        for (Alunos item: Dados) {
            System.out.println("Nome:" + item.nome);
            System.out.println("Email:" + item.email + "\n") ;
        }
 
    }
}