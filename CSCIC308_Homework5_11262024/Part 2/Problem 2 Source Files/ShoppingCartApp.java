public class ShoppingCartApp {
    public static void main(String[] args) {
        // Create the model, view, and controller
        ShoppingCartModel model = new ShoppingCartModel();
        ShoppingCartView view = new ShoppingCartView();
        ShoppingCartController controller = new ShoppingCartController(model, view);
    }
}
