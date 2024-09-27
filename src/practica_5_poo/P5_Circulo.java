/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_5_poo;

/**
 *
 * @author lenovo
 */
public class P5_Circulo {
    final float PI = 3.14f;
   private float radio; 
   
   //Constructor Vacío
   public P5_Circulo(){
       
   }
   
   //Constructor Lleno
   public P5_Circulo(float radio){
       this.radio = radio;
   }
   
   // Por buenas prácticas primero se ponen los get y después los sets
   //Get
   public float getRadio(){
       return radio;
   }
   //Set
   public void setRadio(float radio){
       this.radio = radio;
   }
   
   public void calcularPerimetro(){
       System.out.println("Perimetro: "+2 * PI * radio);
   }
   
   public void calcularArea(){
       System.out.println("Area: "+PI * radio * radio);
   }
   
}
