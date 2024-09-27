/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

package fi.poo;

/**
 *
 * @author Alan Hernandez Flores
 */

/**
 * Clase para crear un coche
 */
public class Coche {
    
    // Hacer diagrama de clase
    /**
     * Atributos de Coche: color, marca y placa
     */
    private String color;
    private String marca;
    private String placa;

    /**
     * Constructor vacio
     */
    public Coche() {
    }

    /**
     * Constructor lleno
     * @param color Color del coche
     * @param marca Marca del coche
     * @param placa Identificacion del vehiculo
     */
    public Coche(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }

    /**
     * Metodo que obtiene el color del coche
     * @return Color del coche
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo que modifica el color del coche
     * @param color Color del coche
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo que obtiene la marca del coche
     * @return Marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que modifica la marca del coche
     * @param marca Marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo que obtiene la matricula del vehiculo
     * @return Matricula del vehiculo
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Metodo que modifica la matricula del vehiculo
     * @param placa Matricula del vehiculo
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    /**
     * Metodo que imprime acelerar en pantalla
     */
    public void acelerar(){
        System.out.println("Estoy acelerando");
    }
    
    /**
     * Metodo que imprime frenar en pantalla
     */
    public void frenar(){
        System.out.println("Voy a frenar");
    }
    
    /**
     * Metodo que transporta una cosa
     * @param cosa Es la cosa que se va a transportar
     * @return La cosa que se transporto
     */
    public String transportar(String cosa){
        System.out.println("Voy a transportar: "+ cosa);
        return cosa;
    }

    /**
     * Metodo que imprime los atributos del objeto Coche
     * @return Atributos del coche
     */
    @Override
    public String toString(){
        return "Coche{"+"color="+ color + ", marca="+ marca + ", placa="+ placa + "}";
    }
     
}
