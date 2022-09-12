package ejerciciospolotic_tp1_gui;

public class E07_Conversiones {

    public double pesosDolares;
    public double pesosGuaranies;
    public double pesosReales;

    public void convertirPesosDolares(double cotizacionPD,double pesos){
        pesosDolares=pesos/cotizacionPD;
    }
    public void convertirPesosGuaranies(double cotizacionPG,double pesos){
        pesosGuaranies=pesos/cotizacionPG;
    }
    public void convertirPesosReales(double cotizacionPR,double pesos){
        pesosReales=pesos/cotizacionPR;
    }
}
