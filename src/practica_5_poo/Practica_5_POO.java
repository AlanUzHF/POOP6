/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_5_poo;


/**
 *
 * @author lenovo
 */
public class Practica_5_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("###### CIRCULO ######");
        ///////////// CIRCULO /////////////
        P5_Circulo circulo = new P5_Circulo();
        
        circulo.getRadio();
        
        System.out.println(circulo.getRadio());
        
        circulo.setRadio(7.77f);
        
        circulo.calcularArea();
        
        circulo.calcularPerimetro();
        
        /// TAREA: ¿Por que se necesita un constructor vacío?
        
        System.out.println("");
        
        ///////////// PERSONA NACIMIENTO /////////////
        System.out.println("###### PERSONA ######");
        
        P5_Persona Eydan = new P5_Persona();
        
        Eydan.setEdad(18);
        Eydan.getEdad();
        System.out.println(Eydan.getEdad());
        
        Eydan.setAltura(1.77f);
        Eydan.getAltura();
        System.out.println(Eydan.getAltura());
        
        Eydan.setNombre("Martinez Ortiz Eydan");
        Eydan.getNombre();
        System.out.println(Eydan.getNombre());
        
        P5_Fecha fecha = new P5_Fecha(28, 11, 2005);
        Eydan.setFechaDeNacimiento(fecha);
        
        // Obtener e imprimir la fecha de nacimiento
        System.out.println("Fecha de nacimiento: ");
        Eydan.getFechaDeNacimiento().impirimirFecha();
        
        Eydan.setOcupacion("Estudiante");
        
        
    }
    
}
