import javax.swing.JOptionPane;

    public class Vetor05{

        public static void main(String[] args){

          

            double[] peso = new double[5]; 

            peso[0] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM PESO: "));
            peso[1] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM PESO: "));
            peso[2] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM PESO: "));       
            peso[3] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM PESO: "));  
            peso[4] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM PESO: "));
        
            double soma = peso[0] +
                          peso[1] +
                          peso[2] +
                          peso[3] +
                          peso[4];
        
            double media = (soma/peso.length);

            JOptionPane.showMessageDialog(null, "Essa é a média : " + media);
                        }
    }       