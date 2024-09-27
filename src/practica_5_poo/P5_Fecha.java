/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_5_poo;

/**
 *
 * @author Luis y compañia
 */
class P5_Fecha {
    /**
     * Día de la fecha.
     */
    private int dia;
    
    /**
     * Mes de la fecha.
     */
    private int mes;
    
    /**
     * Año de la fecha.
     */
    private int anio;
    
    
/// TIP: Para los constructores vacios y llenos basta con el click derecho y poner itroducir codigo
    /**
     * Constructor vacío que crea una fecha sin valores iniciales.
     */
    public P5_Fecha(){
        
    }

    /**
     * Constructor que inicializa la fecha con los valores proporcionados.
     * 
     * @param dia el día de la fecha
     * @param mes el mes de la fecha
     * @param anio el año de la fecha
     */
    public P5_Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    
    //DIA
    /**
     * Obtiene el día de la fecha.
     * 
     * @return el día de la fecha
     */
    public int getDia() {
        return dia;
    }
    
    /**
     * Establece el día de la fecha.
     * 
     * @param dia el nuevo día de la fecha
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    
    //MES
    /**
     * Obtiene el mes de la fecha.
     * 
     * @return el mes de la fecha
     */
    public int getMes() {
        return mes;
    }
    
    /**
     * Establece el mes de la fecha.
     * 
     * @param mes el nuevo mes de la fecha
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    
    //AÑO
    /**
     * Obtiene el año de la fecha.
     * 
     * @return el año de la fecha
     */
    public int getAnio() {
        return anio;
    }
    
    /**
     * Establece el año de la fecha.
     * 
     * @param anio el nuevo año de la fecha
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    /**
     * Imprime y devuelve la fecha en formato "día/mes/año".
     * 
     * @return una cadena que representa la fecha en formato "día/mes/año"
     */
    public String impirimirFecha(){
        System.out.println(dia+"/"+mes+"/"+anio);
        return dia+"/"+mes+"/"+anio;
    }
}
