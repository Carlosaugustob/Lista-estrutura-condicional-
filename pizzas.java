import javax.swing.JOptionPane;

    public class pizzas{

    public static void main(String[] args) {

int numero = Integer.parseInt(
JOptionPane.showInputDialog(
    "\n1 Pizza de calabresa R$ 25,00" + 
"\n2 Pizza de 4 queijos R$ 27,00" + 
"\n3 Pizza de bacon     R$ 45,00" + 
"\n4 - Sair"));
 double preco = 0;
 while (numero != 4){
     if(numero == 1){
     preco = 25.00;
     }else if(numero == 3){
     preco = 45.00;
     }
JOptionPane.showMessageDialog(null, "O preço é: R$ "+ preco);

numero = Integer.parseInt(JOptionPane.showInputDialog("\n1 Pizza de calabresa R$ 25,00" + 
"\n2 Pizza de 4 queijos R$ 27,00" + 
"\n3 Pizza de bacon     R$ 45,00" + 
"\n4 - Sair"));






 }
 }
}    