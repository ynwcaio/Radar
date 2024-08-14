package mavenproject1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Mavenproject1 {

    public static void main(String[] args) {
     double vtm=0 , vp =0 , dif=0;
     String x = "";
     
     x = JOptionPane.showInputDialog("Digite a velocidade permitida");
     vp = Double.parseDouble(x);
     
     x = JOptionPane.showInputDialog("Informe velocidade no momento");
     vtm = Double.parseDouble(x);
     
     dif = vtm - vp;
     
     if(dif <= 0 ){
        JOptionPane.showMessageDialog(null,"Não há multa !");
     }else if(dif <= 10){
       JOptionPane.showMessageDialog(null, "Multa de R$ 80,00 !");  
     }else if(dif >= 11 && dif <=39){
         JOptionPane.showMessageDialog(null, "Multa de R$ 120,00 !");
     }else{
         JOptionPane.showMessageDialog(null, "Multa de R$ 200,00 !");  
     }
    }
}
