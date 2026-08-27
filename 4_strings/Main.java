public class Main {
   public static void main (String [] args){
      String saudacao = "Hello World";
      System.out.println(saudacao.length());
      System.out.println(saudacao.toUpperCase());
      System.out.println(saudacao.toLowerCase());
      System.out.println(saudacao.indexOf("W"));
      System.out.println(saudacao.charAt(6));

    
        String aluno_1 = "Miranata";
        String aluno_2 = "Aeronauta";
        System.out.println(aluno_1.equals(aluno_2)); //false

      String mensagem = " Hello World ";
      System.out.println  ("-" + mensagem.trim() + "-");
  
    String nome = "Savalo";
    String sobrenome = "Horse";
    System.out.println(nome + " " + sobrenome);

      String aluno_3 = "Pombinha da Paz Silva";
      System.out.println(aluno_3.contains("Paz"));

      String aluno_4 = "";
      System.out.println(aluno_4.isEmpty());

      String frutas = String.join("-", "laranja", "Banana");
      System.out.println(frutas);


      String nome_completo = "Del Lokom Pirom";
      System.out.println(nome_completo.replace("m", "n"));

      String texto = "boa noite!";
      System.out.println(texto.substring(4,9));

      String frase = "Repetição com \"correção\" leva à \"Perfeição\"";
      System.out.println(frase);
    }

}