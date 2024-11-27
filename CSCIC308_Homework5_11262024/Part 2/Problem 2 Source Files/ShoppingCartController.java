import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingCartController {
    private ShoppingCartModel model;
    private ShoppingCartView view;

    // Constructor takes both the model and the view
    public ShoppingCartController(ShoppingCartModel model, ShoppingCartView view) {
        this.model = model;
        this.view = view;

        // Register the controller as the action listener for the buttons
        this.view.getButtonAdd().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        this.view.getButtonSub().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeItem();
            }
        });

        this.view.getButtonExit().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitApplication();
            }
        });
    }

    // Method to handle adding an item
    public void addItem() {
        model.addItem();
        view.updateItemCount(model.getItemCount());
    }

    // Method to handle removing an item
    public void removeItem() {
        model.removeItem();
        view.updateItemCount(model.getItemCount());
    }

    // Method to exit the application
    public void exitApplication() {
        System.exit(0);
    }
}
