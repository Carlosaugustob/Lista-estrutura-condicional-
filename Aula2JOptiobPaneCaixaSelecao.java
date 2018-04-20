  import javax.swing.JOptionPane;
    
    public class Aula2JOptiobPaneCaixaSelecao{
        public static void main(String[] args) {
        
    String opcaoselecionada = JOptionPane.showInputDialog(null, "Selecione um estado",
        "SISTEMA - DA Vovó",
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object[]{
            "", "PR", "RSw", "SC"
        },
        ""
    ).toString();
    System.out.println(opcaoselecionada);
    if(opcaoselecionada.equals("SC")){
    System.out.println("Santa Catarina");
    }else if(opcaoselecionada.equals("PR"))   {
    System.out.println("Paraná");
    }else if(opcaoselecionada.equals("RS")){
    System.out.println("Rio Grande do Sul");    
    }    
    }    
    }
    
    
