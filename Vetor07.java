import javax.swing.JOptionPane;

    public class Vetor07{

        public static void main(String[] args){

            double[] altura = new double[4]; 

         altura[0] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UMA ALTURA: "));
         altura[1] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UMA ALTURA "));
         altura[2] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UMA ALTURA "));         
         altura[3] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UMA ALTURA: "));

         double menorAltura = Double.MAX_VALUE;
         
         if(altura[0]< menorAltura){
             menorAltura = altura[0];
         }if(altura[1]< menorAltura){
            menorAltura = altura[1];
        }if(altura[2]< menorAltura){
            menorAltura = altura[2];
        }if(altura[3]< menorAltura){
            menorAltura = altura[3];

        }
        JOptionPane.showMessageDialog(null, "Essa é a menor altura: " + menorAltura);
    }

}