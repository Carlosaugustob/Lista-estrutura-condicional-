import javax.swing.JOptionPane;
  public class Exerciciow3{

        public static void main(String[] args){

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
       
        int contador = 0;
         
        while ((peso > 0) && (peso < 300)) {
    
       peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
       contador = contador + 1; 
        
        } 
      JOptionPane.showMessageDialog(null, "Qndade pessoas: " + contador); 

    }
  }

