import javax.swing.JOptionPane;

    public class Vetor04{

        public static void main(String[] args){

            double[] notas = new double[4];

            notas[0] = 5.5;
            notas[1] = 6.6;
            notas[2] = 7.7;
            notas[3] = 10;

            double soma = notas[0] +
                          notas[1] +
                          notas[2] +
                          notas[3];

            double media = (soma/notas.length);
                               
            System.out.println("Esta é sua media: " + media); 
        }     
    
    }