import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kasir {
    private JFrame frame;
    private JTextField itemNameField;
    private JTextField priceField;
    private JTextField quantityField;
    private JTextArea receiptArea;
    private JButton addButton;
    private JButton totalButton;
    private JButton clearButton;
    private double totalAmount = 0.0;

    public Kasir() {
        frame = new JFrame("Kasir");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel itemNameLabel = new JLabel("Item Name:");
        itemNameLabel.setBounds(10, 10, 100, 25);
        frame.add(itemNameLabel);

        itemNameField = new JTextField();
        itemNameField.setBounds(120, 10, 200, 25);
        frame.add(itemNameField);

        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(10, 40, 100, 25);
        frame.add(priceLabel);

        priceField = new JTextField();
        priceField.setBounds(120, 40, 200, 25);
        frame.add(priceField);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setBounds(10, 70, 100, 25);
        frame.add(quantityLabel);

        quantityField = new JTextField();
        quantityField.setBounds(120, 70, 200, 25);
        frame.add(quantityField);

        addButton = new JButton("Add Item");
        addButton.setBounds(10, 100, 100, 25);
        frame.add(addButton);

        totalButton = new JButton("Total");
        totalButton.setBounds(120, 100, 100, 25);
        frame.add(totalButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(230, 100, 100, 25);
        frame.add(clearButton);

        receiptArea = new JTextArea();
        receiptArea.setBounds(10, 130, 360, 200);
        receiptArea.setEditable(false);
        frame.add(receiptArea);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showTotal();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        frame.setVisible(true);
    }

    private void addItem() {
        String itemName = itemNameField.getText();
        double price = Double.parseDouble(priceField.getText());
        int quantity = Integer.parseInt(quantityField.getText());
        double totalPrice = price * quantity;

        receiptArea.append(itemName + " - Price: " + price + ", Quantity: " + quantity + ", Total: " + totalPrice + "\n");
        totalAmount += totalPrice;

        clearFields();
    }

    private void showTotal() {
        receiptArea.append("Total Amount: " + totalAmount + "\n");
    }

    private void clearFields() {
        itemNameField.setText("");
        priceField.setText("");
        quantityField.setText("");
    }

    public static void main(String[] args) {
        new Kasir();
    }
}