import javax.swing.*;
import java.awt.*;

public class LandingPage extends JFrame {

    public LandingPage() {

        // Frame
        setTitle("Amusement Park");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 248, 255));

        // Title
        JLabel title = new JLabel("WELCOME TO FUN WORLD");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setBounds(130, 60, 400, 40);
        panel.add(title);

        // Description
        JLabel description = new JLabel(
                "<html><center>Enjoy exciting rides, games and unforgettable moments!</center></html>"
        );
        description.setFont(new Font("Arial", Font.PLAIN, 16));
        description.setBounds(100, 120, 400, 60);
        panel.add(description);

        // Login Button
        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(220, 220, 160, 50);
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));

        panel.add(loginButton);

        // Button action
        loginButton.addActionListener(e -> {
            new LoginPage();
            dispose();
        });

        // Add panel to frame
        add(panel);

        setVisible(true);
    }


}
