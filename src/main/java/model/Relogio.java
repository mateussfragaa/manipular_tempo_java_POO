package model;

import javax.swing.JOptionPane;

public class Relogio {

    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Relogio(){
        this(0, 0, 0);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    
    public int retornarTempoTotalSegundos(){
        return hora * 3600 + minuto * 60 + segundo;
    }
    
    public void incrementarSegundos(){
        segundo++;
        if (segundo >= 60 ){
            segundo = 0;
            incrementarMinutos();
        }
    }
    
    public void incrementarMinutos(){
        minuto ++;
        if (minuto >= 60){
            minuto = 0;
            incrementarHora();
        }
    }
    
    public void incrementarHora(){
        hora++;
        if (hora >= 24){
            hora = 0;
        }
    }
    
    public void decrementarSegundos(){
        segundo--;
        if (segundo < 0 ){
            segundo = 59;
            decrementarMinutos();
        }
    }
    
    public void decrementarMinutos(){
        minuto--;
        if (minuto < 0){
            minuto = 59;
            decrementarHora();
        }
    }
    
    public void decrementarHora(){
        hora--;
        if (hora < 0){
            hora = 23;
        }
    }
    
    public String formatarHora(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
