/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_5_poo;

/**
 *
 * @author Alan y compañia
 */
public class P5_Persona {
    /**
     * Edad de la persona.
     */
    private int edad;
    
    /**
     * Altura de la persona en metros.
     */
    private float altura;
    
    /**
     * Nombre de la persona.
     */
    private String nombre;
    
    /**
     * Fecha de nacimiento de la persona.
     */
    private P5_Fecha fechaDeNacimiento;
    
    /**
     * Ocupación de la persona.
     */
    private String ocupacion;
    
    /**
     * Constructor vacío que crea una persona sin inicializar sus atributos.
     */
    public P5_Persona(){
        
    }
    
    /**
     * Constructor que inicializa los atributos de la persona con los valores proporcionados.
     * 
     * @param edad la edad de la persona
     * @param altura la altura de la persona en metros
     * @param nombre el nombre de la persona
     * @param ocupacion la ocupación de la persona
     */
    public P5_Persona(int edad, float altura, String nombre, String ocupacion){
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
    }
    
    
    //EDAD
    /**
     * Obtiene la edad de la persona.
     * 
     * @return la edad de la persona
     */
    public int getEdad(){
        return edad;
    }
    /**
     * Establece la edad de la persona.
     * 
     * @param edad la nueva edad de la persona
     */
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    //ALTURA
    /**
     * Obtiene la altura de la persona.
     * 
     * @return la altura de la persona en metros
     */
    public float getAltura(){
        return altura;
    }
    /**
     * Establece la altura de la persona.
     * 
     * @param altura la nueva altura de la persona en metros
     */
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    
    //NOMBRE
    /**
     * Obtiene el nombre de la persona.
     * 
     * @return el nombre de la persona
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre el nuevo nombre de la persona
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    //FECHA
    /**
     * Obtiene la fecha de nacimiento de la persona.
     * 
     * @return la fecha de nacimiento de la persona
     */
    public P5_Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento; 
    }
    /**
     * Establece la fecha de nacimiento de la persona.
     * 
     * @param fechaDeNacimiento la nueva fecha de nacimiento de la persona
     */ 
    public void setFechaDeNacimiento(P5_Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    
    //OCUPACION
    /**
     * Obtiene la ocupación de la persona.
     * 
     * @return la ocupación de la persona
     */
    public String getOcupacion(){
        return ocupacion;
    }
    /**
     * Establece la ocupación de la persona.
     * 
     * @param ocupacion la nueva ocupación de la persona
     */
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    
    /**
     * Simula la acción de comer. 
     * 
     * @return {@code true} si la persona está comiendo
     */
    public boolean comer(){
        System.out.println("Como pizza");
        return true;
    }
    
    /**
     * Simula la acción de jugar.
     * 
     * @return {@code true} si la persona está jugando
     */
    public boolean jugar(){
        System.out.println("Estoy jugando");
        return true;
    } 
    
    /**
     * Simula la acción de correr.
     * 
     * @return {@code true} si la persona está corriendo
     */
    public boolean correr(){
        System.out.println("Estoy cooriendo a mi clase");
        return true;
    }
    
    /**
     * Simula la acción de saludar.
     * 
     * @return {@code true} si la persona está saludando
     */
    public boolean saludar(){
        System.out.println("Holaaaa");
        return true;
    }
    
    /**
     * Simula la acción de estudiar.
     * 
     * @return {@code true} si la persona está estudiando
     */
    public boolean estudiar(){
        System.out.println("Estudio para mi examen");
        return true;
    }

    /**
     * Método privado, para imprimir la fecha.
     * 
     * @return una cadena con la fecha
     */ 
    private String imprimirFecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
