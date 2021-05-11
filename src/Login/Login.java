package Login;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class Login extends JFrame {

    public Login(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(400,180);
        this.setLocationRelativeTo(null);


        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(5,6));

        //top panel
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(235, 79, 7));
        JLabel nameLabel = new JLabel("SHOPPEE");
        nameLabel.setFont(new Font("Verdana", Font.BOLD,18));
        nameLabel.setForeground(Color.WHITE);
        topPanel.add(nameLabel);

        //west panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBorder(new EmptyBorder(10,10,10,10));
        GridLayout grid = new GridLayout(2,2);
        grid.setHgap(10);
        centerPanel.setLayout(grid);

        JLabel usernameLabel = new JLabel("Username");
        JTextField usernameTF = new JTextField(10);
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(10);
        centerPanel.add(usernameLabel);
        centerPanel.add(usernameTF);
        centerPanel.add(passwordLabel);
        centerPanel.add(passwordField);

        //south panel
        JPanel southPanel = new JPanel();
        JButton loginButton = new JButton("Log in");
        southPanel.add(loginButton);




        //north
        mainContainer.add(topPanel, BorderLayout.NORTH);
        //center
        mainContainer.add(centerPanel, BorderLayout.WEST);
        //bottom
        mainContainer.add(southPanel, BorderLayout.SOUTH);


    }



    public static void main(String[] args) {

        Login login = new Login("Shoppee");
        login.setVisible(true);

    }



}
