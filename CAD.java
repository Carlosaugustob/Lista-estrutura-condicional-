import javax.swing.JOptionPane;
 
   public class CAD{

   public static void main(String[] args){


   int numeroum = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
   int numerodois = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero "));

   int numerosoma = numeroum + numerodois;
   int numerosubtracao = numeroum - numerodois;
   int numeromulti = numeroum * numerodois;
   double numerodivi = numeroum / numerodois;
   int numerovalor = numeroum * numeroum;
   int numerovalordois= numerodois * numerodois;

    JOptionPane.showMessageDialog(null, "Soma dos n�meros" + numerosoma + "\nSubtra��o: " + numerosubtracao + 
                                        "\nMultiplica��o: "  + numeromulti + "\nDivis�o: " + numerodivi +
                                        "\nValor: " + numerovalor + "\nValor Dois: " + numerovalordois);

  }

}                                      