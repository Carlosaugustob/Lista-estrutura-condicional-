import javax.swing.JOptionPane;
public class ExemploString01{

    public static void main(String[] args) {

       String nome = "Curso de Java";
       // retorna a quantidade de caracteres da String
       System.out.println(nome);
       System.out.println("Tamanho da String: ")
       + nome.length());

       String nick = JOptionPane.showInputDialog(null, "Informe o nick do seu pager: ");
       if(nick.equals("")){
           JOptionPane.showMessageDialog(null, "Filho eu pedi para você o seu nick!!!");
       }
       String jogoDoAno = " League of Legends   ";
       // remove os espaços do começo ao fim
       jogoDoAno = jogoDoAno.trim();
       String sistemaOperacional = "LiNUX";
       System.OUT.println(sistemaOperacional);

       // colocar o texto todo em caixa alta

       sistemaOperacional = sistemaOperacional
                     .toUpperCase();
        System.out.println(sistemaOperacional);

        //colocar o texto todo em caixa baixa
        sistemaOperacional = sistemaOperacional
                 .toLowerCase();
                 System.out.println(sistemaOperacional);
                 // pegar um caracter em determinado indice
                 char letra = sistemaOperacional.charAt(2);
                 //                  01234567891011
       String nomeCompleto = "Juan Roberto da Rocha";
       System.out.println(nomeCompleto.substring(5,12));

       System.out.println(nomeCompleto.char)
                                    
              } 
    }
}





