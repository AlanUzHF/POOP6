/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_5_poo;

/**
 *
 * @author Eydan y compañia
 */
public class P5_Circulo {
   
   /**
     * Valor constante de PI usado en los cálculos.
     */ 
   final float PI = 3.14f;
   /**
     * Radio del círculo.
     */
   private float radio; 
   
   //Constructor Vacío
   /**
     * Constructor vacío que crea un círculo sin un valor inicial para el radio.
     */
   public P5_Circulo(){
       
   }
   
   //Constructor Lleno
   /**
     * Constructor que inicializa el círculo con un valor para el radio.
     * 
     * @param radio el radio del círculo
     */
   public P5_Circulo(float radio){
       this.radio = radio;
   }
   
   // Por buenas prácticas primero se ponen los get y después los sets
   //Get
   /**
     * Obtiene el radio del círculo.
     * 
     * @return el radio del círculo
     */
   public float getRadio(){
       return radio;
   }
   //Set
   /**
     * Establece el radio del círculo.
     * 
     * @param radio el nuevo radio del círculo
     */
   public void setRadio(float radio){
       this.radio = radio;
   }
   
   /**
     * Calcula y muestra el perímetro del círculo.
     * 
     * <p>La fórmula para el perímetro es: 2 * PI * radio.</p>
     */
   public void calcularPerimetro(){
       System.out.println("Perimetro: "+2 * PI * radio);
   }
   
   /**
     * Calcula y muestra el área del círculo.
     * 
     * <p>La fórmula para el área es: PI * radio * radio.</p>
     */
   public void calcularArea(){
       System.out.println("Area: "+PI * radio * radio);
   }
   
}
