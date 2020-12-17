/*
 * Reservar Habitaciones (escoger el dia y tipo de habitacion) 
 * U. Fidélitas 
 * Proyecto Final Intro a Programación 
 */
package ChristyResortProyecto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;

public class ReservarHabitaciones extends javax.swing.JFrame {
    public ArrayList<Reserva> reservas = new ArrayList();
    private piezas piezas = null;
    
    public String getHabitacionName(  ){
        return (piezas.getNombre());
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private int valor;
    public static Reserva reserva = null;
    
    public ReservarHabitaciones() {

        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reservarBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipoHabitacion = new javax.swing.JComboBox<>();
        precioValue = new javax.swing.JLabel();
        cantidadPersonas = new javax.swing.JLabel();
        diaInicio = new javax.swing.JComboBox<>();
        mesInicio = new javax.swing.JComboBox<>();
        annoInicio = new javax.swing.JComboBox<>();
        diaFinal = new javax.swing.JComboBox<>();
        mesFinal = new javax.swing.JComboBox<>();
        annoFinal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        statusLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reservarBoton.setText("Hacer Reserva");
        reservarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarBotonActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo Habitacion:");

        jLabel2.setText("Precio:");

        jLabel3.setText("Capacidad:");

        tipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Deluxe", "Familiar", "Pareja" }));
        tipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoHabitacionActionPerformed(evt);
            }
        });

        precioValue.setText("0000000 Colones");

        cantidadPersonas.setText("# Persona(s)");

        diaInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        diaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaInicioActionPerformed(evt);
            }
        });

        mesInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesInicioActionPerformed(evt);
            }
        });

        annoInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021" }));

        diaFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        diaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaFinalActionPerformed(evt);
            }
        });

        mesFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesFinalActionPerformed(evt);
            }
        });

        annoFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021" }));

        jLabel4.setText("Fecha Entrada:");

        jLabel5.setText("Fecha Salida:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(precioValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cantidadPersonas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(annoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(diaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(mesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(annoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(diaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(statusLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(reservarBoton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(precioValue))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cantidadPersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(diaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(annoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(diaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(annoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(statusLabel)
                .addGap(68, 68, 68)
                .addComponent(reservarBoton)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoHabitacionActionPerformed
        
        setCaracteristicas(tipoHabitacion);
        
    }//GEN-LAST:event_tipoHabitacionActionPerformed

    private void diaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaInicioActionPerformed
       
    }//GEN-LAST:event_diaInicioActionPerformed

    private void mesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesInicioActionPerformed
       
    }//GEN-LAST:event_mesInicioActionPerformed

    private void diaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaFinalActionPerformed
       
    }//GEN-LAST:event_diaFinalActionPerformed

    private void mesFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesFinalActionPerformed
        
    }//GEN-LAST:event_mesFinalActionPerformed

    private void reservarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarBotonActionPerformed
        Date fecha_entrada = null;
        Date fecha_salida = null;
        
        int dInicio = diaInicio.getSelectedIndex() + 1;
        int mInicio = mesInicio.getSelectedIndex() + 1;
        String fInicio = (dInicio+"-"+mInicio+"-"+annoInicio.getSelectedItem());
        try {
            fecha_entrada = sdf.parse(fInicio);
        } catch (ParseException ex) {
            Logger.getLogger(ReservarHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int dFinal = diaFinal.getSelectedIndex() + 1;
        int mFinal = mesFinal.getSelectedIndex() + 1;
        String fFinal = (dFinal+"-"+mFinal+"-"+annoFinal.getSelectedItem());
        try {
            fecha_salida = sdf.parse(fFinal);
        } catch (ParseException ex) {
            Logger.getLogger(ReservarHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        int diff = (int) ((fecha_salida.getTime() - fecha_entrada.getTime()) / (1000*60*60*24l));
        float diferencia = fecha_entrada.compareTo(fecha_salida);
        
        if( diferencia > 0 || fecha_entrada.compareTo(fecha_salida) == 0 ){
            statusLabel.setText("Revisa las fechas de Reserva, existe algun error en ellas.");
            return;
            
        }
        else if( diferencia < 0 ){
           statusLabel.setText(Float.toString(diferencia));
            int precio_hab = piezas.getMonto();
            int valorf = precio_hab * diff;
            valor = valorf;
            reserva = new Reserva(piezas, fInicio, fFinal, valor);    
       
        EscogerPaquetes pac = new EscogerPaquetes();  
        pac.setVisible(true);

        dispose();
           return;
        }
   
    }//GEN-LAST:event_reservarBotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        InterfazUsuarios vistaUsuarios = new InterfazUsuarios(); 
        vistaUsuarios.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservarHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarHabitaciones().setVisible(true);
            }
        });
        
    }
    public void setCaracteristicas(JComboBox tipoHabitacion ){
        if(tipoHabitacion.getSelectedItem() == "Deluxe"){
            this.precioValue.setText("65000");
            this.cantidadPersonas.setText("2 Personas");
             piezas = new piezas("Deluxe", 1, "King", "Bosque y Piscina", 2 , "Refrigerador, Jacuzzi, Oficina, Cocina", 65000);
        } else if(tipoHabitacion.getSelectedItem() == "Familiar"){
            this.precioValue.setText("70000");
            this.cantidadPersonas.setText("4 Personas");
             piezas = new piezas("Familiar", 2, "Queen", "Bosque", 4 , "Refrigerador, Cocina", 70000);
        } else if(tipoHabitacion.getSelectedItem() == "Pareja"){
            this.precioValue.setText("35000");
            this.cantidadPersonas.setText("2 Personas");
             piezas = new piezas("Pareja", 1, "King", "Bosque", 2 , "Refrigerador, Jacuzzi, 2 Hamacas ", 50000);
        }
        

    }
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> annoFinal;
    private javax.swing.JComboBox<String> annoInicio;
    private javax.swing.JLabel cantidadPersonas;
    private javax.swing.JComboBox<String> diaFinal;
    private javax.swing.JComboBox<String> diaInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> mesFinal;
    private javax.swing.JComboBox<String> mesInicio;
    private javax.swing.JLabel precioValue;
    private javax.swing.JButton reservarBoton;
    public javax.swing.JLabel statusLabel;
    private javax.swing.JComboBox<String> tipoHabitacion;
    // End of variables declaration//GEN-END:variables
}

