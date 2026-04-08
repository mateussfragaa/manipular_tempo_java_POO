

package main;

import javax.swing.JOptionPane;
import model.Relogio;

public class Main {

    public static void main(String[] args) {
        Relogio tempo = new Relogio(24, 59, 58);
        
        System.out.println("Tempo inicial " + tempo.formatarHora());
        
        System.out.println("O tempo total em segundos é " + tempo.retornarTempoTotalSegundos());
        
        tempo.incrementarSegundos();
        System.out.println("Tempo com um segundo incrementado " + tempo.formatarHora());
        
        tempo.incrementarMinutos();        
        System.out.println("Tempo com um minuto incrementado " + tempo.formatarHora());
        
        tempo.incrementarHora();        
        System.out.println("Tempo com uma hora incrementada " + tempo.formatarHora());
        
        tempo.decrementarSegundos();       
        System.out.println("Tempo com um segundo decrementado " + tempo.formatarHora());
        
        tempo.decrementarMinutos();       
        System.out.println("Tempo com um minuto decrementado " + tempo.formatarHora());
        
        tempo.decrementarHora();        
        System.out.println("Tempo com uma hora decrementado " + tempo.formatarHora());
        
    }
}
