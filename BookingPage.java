import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BookingPage extends JFrame {

    ArrayList<String> bookings = new ArrayList<>();

    public BookingPage() {

        setTitle("Book Amusement Park Ticket");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(245, 245, 245));

        JLabel title = new JLabel("BOOK YOUR TICKET");
        title.setFont(new Font("Arial", Font.BOLD, 25));
        title.setBounds(180, 30, 300, 40);
        panel.add(title);

        JLabel typeLabel = new JLabel("Ticket Type:");
        typeLabel.setBounds(80, 100, 120, 30);
        panel.add(typeLabel);

        String[] ticketTypes = {"Adult - ₹500", "Child - ₹300", "Senior - ₹350"};

        JComboBox<String> ticketType =
                new JComboBox<>(ticketTypes);

        ticketType.setBounds(200, 100, 220, 30);
        panel.add(ticketType);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setBounds(80, 150, 120, 30);
        panel.add(quantityLabel);

        JTextField quantity = new JTextField();
        quantity.setBounds(200, 150, 220, 30);
        panel.add(quantity);

        JButton payButton = new JButton("PAY & BOOK");
        payButton.setBounds(200, 220, 180, 45);
        panel.add(payButton);

        payButton.addActionListener(e -> {

            try {

                int qty = Integer.parseInt(quantity.getText());

                if (qty <= 0) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Enter a valid quantity"
                    );
                    return;
                }

                int price = 0;

                if (ticketType.getSelectedIndex() == 0) {
                    price = 500;
                } else if (ticketType.getSelectedIndex() == 1) {
                    price = 300;
                } else {
                    price = 350;
                }

                int total = price * qty;

                String booking =
                        ticketType.getSelectedItem()
                        + " | Quantity: " + qty
                        + " | Total: ₹" + total;

                bookings.add(booking);

                JOptionPane.showMessageDialog(
                        this,
                        "PAYMENT SUCCESSFUL!\n\n"
                        + "Ticket: " + ticketType.getSelectedItem()
                        + "\nQuantity: " + qty
                        + "\nTotal Paid: ₹" + total
                );

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter a valid quantity"
                );
            }
        });

        add(panel);
        setVisible(true);
    }
}
