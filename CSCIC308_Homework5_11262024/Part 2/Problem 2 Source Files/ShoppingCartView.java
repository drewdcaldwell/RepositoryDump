import javax.swing.*;
import java.awt.*;

public class ShoppingCartView {
    private JFrame frame;
    private JTextField sum;
    private JButton buttonAdd;
    private JButton buttonSub;
    private JButton buttonExit;
    private JLabel label;

    // Constructor initializes the UI components
    public ShoppingCartView() {
        frame = new JFrame("Shopping Cart");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        Box box = Box.createVerticalBox();
        Box box3 = Box.createHorizontalBox();
        Box box4 = Box.createHorizontalBox();

        label = new JLabel("Number of Items in your Cart: ");
        sum = new JTextField(15);
        sum.setEditable(false);
        buttonAdd = new JButton("Add an Item");
        buttonSub = new JButton("Remove an Item");
        buttonExit = new JButton("Exit");

        // Add components to the layout
        box3.add(label);
        box3.add(sum);
        box4.add(buttonAdd);
        box4.add(buttonSub);
        box4.add(buttonExit);

        box.add(box3);
        box.add(box4);

        panel.add(box);
        frame.add(panel);
        frame.setVisible(true);
    }

    // Method to update the displayed item count
    public void updateItemCount(int count) {
        sum.setText(String.valueOf(count));
    }

    // Getter methods for buttons
    public JButton getButtonAdd() {
        return buttonAdd;
    }

    public JButton getButtonSub() {
        return buttonSub;
    }

    public JButton getButtonExit() {
        return buttonExit;
    }
}
