public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCartModel model = new ShoppingCartModel();
        ShoppingCartView view = new ShoppingCartView();
        ShoppingCartController controller = new ShoppingCartController(model, view);
    }
}
