package estacionamentoex02;

import javax.swing.JOptionPane;

public class EstacionamentoEx02 {

    public static void main(String[] args) {
        
        EstacionamentoEx02_2 dados = new EstacionamentoEx02_2();
           
            dados.setPlacaCarro((JOptionPane.showInputDialog("Placa do carro: ")));
            dados.setModeloCarro((JOptionPane.showInputDialog("Modelo do carro: ")));    
            dados.setHoraEntrada(Integer.parseInt(JOptionPane.showInputDialog("Hora de entrada: ")));
            dados.setMinEntrada(Integer.parseInt(JOptionPane.showInputDialog("Minuto de entrada: ")));
            dados.setHoraSaida(Integer.parseInt(JOptionPane.showInputDialog("Hora de saída: ")));
            dados.setMinSaida(Integer.parseInt(JOptionPane.showInputDialog("Minuto de saída: ")));
            dados.setPrecoHora(Integer.parseInt(JOptionPane.showInputDialog("Preço por hora: ")));
  
        double time = dados.tempo(dados.getHoraEntrada(),dados.getMinEntrada(),dados.getHoraSaida(),dados.getMinSaida());
        dados.notinha(time, time);
        
    }
    
}
