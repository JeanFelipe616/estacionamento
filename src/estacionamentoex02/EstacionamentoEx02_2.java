package estacionamentoex02;

import javax.swing.JOptionPane;

public class EstacionamentoEx02_2 {
        
        public String placa_carro;
        public String modelo_carro;
        public double hora_entrada; 
        public double hora_saida;
        public double min_entrada;
        public double min_saida;
        public double preco_hora;
      
public void notinha(double tempo,double preco){
double valor_total= tempo*preco;
             JOptionPane.showMessageDialog(null,"Placa do carro: "+getPlacaCarro()
             +"\n Modelo: " + getModeloCarro() + "\n"
             +"Entrada: "+getHoraEntrada()+"h e "+getMinEntrada()+"min\n"
             +"Saida: "+getHoraSaida()+"h e "+getMinSaida()+"min\n" 
             +"Tempo total: "+tempo+"h"
             +"\nValor total: R$ " + valor_total);
               
}
public double tempo(double hora_entrada,double min_entrada, double hora_saida,double min_saida){
    double conv_ent = hora_entrada+min_entrada/60;
    double conv_sai = hora_saida+min_saida/60;
    double tempo = Math.ceil(conv_sai-conv_ent); 
    
    return tempo;
}
    public String getPlacaCarro(){
        return placa_carro;
    }
    
    public void setPlacaCarro(String placa){
        this.placa_carro = placa;
    }
    
    public String getModeloCarro(){
        return modelo_carro;
    }
    
    public void setModeloCarro(String modelo){
    this.modelo_carro = modelo;
    }
    
    public double getHoraEntrada(){
        return hora_entrada;
    }
 
    public void setHoraEntrada(double hora_entrada){
    this.hora_entrada = hora_entrada;
    }
    
    public double getHoraSaida(){
        return hora_saida;
    }

    public void setHoraSaida(double hora_saida){
    this.hora_saida = hora_saida;
    } 
    
    public double getMinEntrada(){
        return min_entrada;
    }
     
    public void setMinEntrada(double min_entrada){
    this.min_entrada = min_entrada;
    }
           
    public double getMinSaida(){
        return min_saida;
    }
    
    public void setMinSaida(double min_saida){
    this.min_saida = min_saida;
    }
    
    public double getPrecoHora(){
        return preco_hora;
    }
    
    public void setPrecoHora(double preco){
    this.preco_hora = preco;
    }
   


}