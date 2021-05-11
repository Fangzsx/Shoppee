package Login;

import javax.swing.*;
import java.awt.*;


public class Login extends JFrame {

    public Login(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,150);
        this.setLocation(100,100);


        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(5,6));
        mainContainer.setBackground(Color.GRAY);





    }



    public static void main(String[] args) {

        Login login = new Login("Login");
        login.setVisible(true);

    }



}
