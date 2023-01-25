/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semanaunoesp;

/**
 *
 * @author oem
 */
public class Semanaunoesp extends javax.swing.JFrame {

    //**Crear un nuevo formulario de la clase Semanaunoesp*/
    public Semanaunoesp() {
        setSize(200, 300);//Tamaño del formulario
        setTitle("Aplicacioń");//tiulo del formulario
        intComponents(); //iniciar controles o componentes
    }

    //**Este médot es llamdo desd el constructor*/
    public void intComponents() {
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }

        });
    }

    /**Salir de la aplicación  */
    public void exitForm(java.awt.event.WindowEvent evt){
        System.exit(0);
    }
    
    /**@param args: argumentos pasados en la línea de órdenes*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Semanaunoesp().setVisible(true);
        
    }
    
    //Declaración de variables

}
