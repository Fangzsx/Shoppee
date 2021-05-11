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

        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(235, 79, 7));
        JLabel nameLabel = new JLabel("SHOPPEE");
        nameLabel.setFont(new Font("Verdana", Font.BOLD,18));
        nameLabel.setForeground(Color.WHITE);
        topPanel.add(nameLabel);

        mainContainer.add(topPanel, BorderLayout.NORTH);





    }



    public static void main(String[] args) {

        Login login = new Login("Login");
        login.setVisible(true);

    }



}
