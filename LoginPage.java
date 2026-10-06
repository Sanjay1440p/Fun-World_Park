import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {

    public LoginPage() {

        setTitle("Login");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        JLabel title = new JLabel("LOGIN");
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setBounds(200, 40, 150, 40);
        panel.add(title);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(80, 110, 100, 30);
        panel.add(userLabel);

        JTextField username = new JTextField();
        username.setBounds(180, 110, 220, 30);
        panel.add(username);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(80, 160, 100, 30);
        panel.add(passwordLabel);

        JPasswordField password = new JPasswordField();
        password.setBounds(180, 160, 220, 30);
        panel.add(password);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(180, 220, 100, 40);
        panel.add(loginButton);

        loginButton.addActionListener(e -> {

            String user = username.getText();
            String pass = new String(password.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Login Successful!"
                );

                new BookingPage();
                dispose();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Username or Password"
                );
            }
        });

        add(panel);
        setVisible(true);
    }
}
