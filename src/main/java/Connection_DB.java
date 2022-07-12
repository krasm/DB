import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Connection_DB extends JFrame {

    private static JLabel password;
    private static JLabel label;
    private static JTextField userText;
    private static JPasswordField passwordField;
    private static JButton button;
    private static JLabel succes;
    private static JLabel ussers;
    private static  UsserService service;
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel label3;
    private static JButton [] buttony = new JButton[12];
    private static int i =0;
    private static int y = 150;






    public static void main(String[] args) throws Exception {

            frame = new JFrame("DB");
            panel = new JPanel();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            panel.setLayout(null);
            frame.add(panel);

            label = new JLabel("Usser");
            label.setBounds(10,20,80,25);
            panel.add(label);

            userText = new JTextField(20);
            userText.setBounds(100,20,165,25);



            password = new JLabel("Password");
            password.setBounds(10,50,80,25);

            passwordField = new JPasswordField();
            passwordField.setBounds(100,50,165,25);

            button = new JButton("LogIn");
            button.setBounds(10,80,80,25);


            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    try {
                        service.addUsser(new Usser(userText.getText(), passwordField.getText()));
                        succes.setText("Login succesful");
                        buttony[i] = new JButton(userText.getText());
                        buttony[i].setBounds(10,y,80,25);
                        panel.add(buttony[i]);
                        buttony[i].addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });

                        y +=30;
                        i++;
                    } catch (SQLException ex) {
                        ex.printStackTrace();

                    }
                }
            });



            succes = new JLabel("");
            succes.setBounds(10,110,300,25);
            label3 = new JLabel("Zalogowani");
            label3.setBounds(10,125,300,25);
            ussers = new JLabel("");
            ussers.setBounds(10,135,300,25);

            panel.add(button);
            panel.add(userText);
            panel.add(passwordField);
            panel.add(password);
            panel.add(succes);
            panel.add(ussers);
            panel.add(label3);

            frame.setVisible(true);

            //"IX3L_06"
            //"#ix3l_06#"

            service = new UsserService();


        }

    }


