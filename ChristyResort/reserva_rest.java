/*
 * Reserva Restaurante 
 * U. Fidélitas 
 * Proyecto Final Intro a Programación 
 */
package ChristyResortProyecto;
import javax.swing.JOptionPane; 

public class reserva_rest { 

    static int i=0;
    static rest Mesa[]=new rest[5];

     public void menu(){
         
    int opcion;
     do{
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Restaurante: "
                 + "\n1-Nueva Reserva \n2-Consultar Habitación \n0-Salir"));
         switch(opcion){
             case 0:
                InterfazUsuarios interfaz = new InterfazUsuarios();
                interfaz.setVisible(true);
     
                 break;
             case 1:
                 nueva_reserva ();
                 break;
             case 2:
                check();
                break;
             default:
                JOptionPane.showMessageDialog(null,"Digito incorrecto");
                break;
         }
         
     }while(opcion!=0);

 } 
    
 
 public static void nueva_reserva () 
 {
 if(4>-i){
     
     String nombre = JOptionPane.showInputDialog("Digite su nombre: ");
     String num_habitacion = JOptionPane.showInputDialog("Numero de Habitacion: ");
     String hora = JOptionPane.showInputDialog("Hora de Reservación: ");
     int num_personas= Integer.parseInt(JOptionPane.showInputDialog("Numero de personas: "));
     Mesa[i]=new rest(nombre, num_habitacion, hora, num_personas);
     i++;         
 }else {
     JOptionPane.showMessageDialog(null,"Datos Llenos");
 }  
 
 
 }
 public void check(){
     int check=0; 
     String code = JOptionPane.showInputDialog("Digite el numero de habitación: ");
     for (int a =0; a<=4; a++){
         if(code.equals(Mesa[a].num_habitacion))
            
         
         { 
             JOptionPane.showMessageDialog(null,"Reserva de Restaurante: \nNombre: "+ Mesa[a].nombre
                                            + "\nNumero de Habitación: "+Mesa[a].num_habitacion + "\nHora: "+ Mesa[a].hora
                                            + "\nNumero de personas: "+Mesa[a].num_personas);
             check ++; 
         }
         
         reserva_rest mesa = new reserva_rest();
         mesa.menu();
     }
     if (check==0){
         JOptionPane.showMessageDialog(null, "Codigo No Existente");
         
         }
    }
}



 


