package javinha.capitulo2;
import javax.swing.*;

public class Resultado {
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void Alternativas(int inst,boolean certo,boolean errado1,boolean errado2,boolean errado3,boolean errado4){
    
    if(certo == true){
            //variaveis da criação do Confirm Dialog 
            int botaoDialogo = JOptionPane.YES_NO_OPTION;
            int resultadoDialogo = JOptionPane.showConfirmDialog(null, "Parabens! Você acertou!\nAvançar para a próxima questão?!", "Caixinha da vitória", botaoDialogo, JOptionPane.INFORMATION_MESSAGE);
            //Condição do confirm dialog
            if (resultadoDialogo == 0) {
                System.out.println("Yes option");
                // condição para ir para o proximo JF
                this.setStatus(true);
                if(inst == 1){
                    JavaPergunta1 p1 = new JavaPergunta1();
                    p1.show();}           
                if(inst == 2){
                    JavaPergunta2 p2 = new JavaPergunta2();
                    p2.show();}
                if(inst == 3){
                    JavaPergunta3 p3 = new JavaPergunta3();
                    p3.show();}
                if(inst == 4){
                    JavaPergunta4 p4 = new JavaPergunta4();
                    p4.show();}
            } else {
                System.out.println("No Option");
                JOptionPane.showMessageDialog(null, "Clique em 'Yes' para avançar para próxima questão");
            }
                       
    }else{JOptionPane.showMessageDialog(null,"você errou!");
          this.setStatus(false);}
    
    
    }
}
