/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_5_poo;

/**
 *
 * @author lenovo
 */
class P5_Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    
/// TIP: Para los constructores vacios y llenos basta con el click derecho y poner itroducir codigo
    public P5_Fecha(){
        
    }

    public P5_Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    
    //DIA
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    
    //MES
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    
    //AÑO
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    public String impirimirFecha(){
        System.out.println(dia+"/"+mes+"/"+anio);
        return dia+"/"+mes+"/"+anio;
    }
}
