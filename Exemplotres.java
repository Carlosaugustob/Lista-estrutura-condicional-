import javax.swing.JOptionPane;
 
     
     public class Exemplotres{

    public static void main(String[] args){


   String nome = JOptionPane.showInputDialog("Nome do Carro: ");
   double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do carro: "));
   double parcela = Double.parseDouble(JOptionPane.showInputDialog("Valor da parcela: "));
   int meses = Integer.parseInt(JOptionPane.showInputDialog("Meses: "));
  
   
   double valortotal = parcela * meses;
   double financiado = valortotal - valor;

                
                                      JOptionPane.showMessageDialog(null, "Nome do carro: " + nome + "\nValor: " + valor + "\nParcela" 
                                                    + parcela + "\nMeses: " + meses + "\nValor total do financiamento: " + valortotal +
                                                    "\nDiferença: " + financiado);

   }

}
                                                 
