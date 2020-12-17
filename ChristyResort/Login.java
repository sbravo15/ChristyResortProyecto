/*
 * Login valida el Username y la contraseña 
 * U. Fidélitas 
 * Proyecto Final Intro a Programación 
 */

package ChristyResortProyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login implements ActionListener{
private int count = 0;
private static JLabel label, userLabel,passwordLabel, success;
private static JFrame frame;
private static JPanel  panel;
private static JTextField userText;
private static JPasswordField passwordText;
    
    public Login(){
        frame = new  JFrame();
        panel = new JPanel();
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hotel Christy Resort");
        
        frame.add(panel);
        
        panel.setLayout(null);
        
        userLabel = new JLabel("Usuario");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        
        passwordLabel = new JLabel("Contraseña");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);
        
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
        
        JButton loginButton = new JButton("Log In");
        loginButton.setBounds(125,80,80,25);
        panel.add(loginButton);
        
        loginButton.addActionListener(this);
        
        
        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);
        

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String user = userText.getText();
        String password = String.valueOf(passwordText.getPassword());
        System.out.println("User = " + user + " Password = " + password);
        
        if(user.equals("") && password.equals("")){
            success.setText("Inicio de Sesion Exitoso");
            InterfazUsuarios interfazUsuarios = new InterfazUsuarios();
            frame.setVisible(false);
            interfazUsuarios.setVisible(true);
        } else if(user.equals("admin") && password.equals("admin123")) {
        success.setText("Inicio de Sesion Exitoso como Admin");
                    InterfazUsuarios interfazUsuarios = new InterfazUsuarios();
            frame.setVisible(false);
            interfazUsuarios.setVisible(true);
        } 
        
    }
}
