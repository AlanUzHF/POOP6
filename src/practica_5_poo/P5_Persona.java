/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_5_poo;

/**
 *
 * @author lenovo
 */
public class P5_Persona {
    private int edad;
    private float altura;
    private String nombre;
    private P5_Fecha fechaDeNacimiento;
    private String ocupacion;
    
    public P5_Persona(){
        
    }
    
    public P5_Persona(int edad, float altura, String nombre, String ocupacion){
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
    }
    
    
    //EDAD
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    //ALTURA
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    
    //NOMBRE
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    //FECHA
    public P5_Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento; 
    }
        
    public void setFechaDeNacimiento(P5_Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    
    //OCUPACION
    public String getOcupacion(){
        return ocupacion;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    
    
    public boolean comer(){
        System.out.println("Como pizza");
        return true;
    }
    
    
    public boolean jugar(){
        System.out.println("Estoy jugando");
        return true;
    } 
    
    
    public boolean correr(){
        System.out.println("Estoy cooriendo a mi clase");
        return true;
    }
    
    
    public boolean saludar(){
        System.out.println("Holaaaa");
        return true;
    }
    
    
    public boolean estudiar(){
        System.out.println("Estudio para mi examen");
        return true;
    }

    private String imprimirFecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
