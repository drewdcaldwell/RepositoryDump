public class ShoppingCartModel {
    private int itemCount;

    // Constructor initializes the item count to 0
    public ShoppingCartModel() {
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem() {
        itemCount++;
    }

    // Method to remove an item from the cart
    public void removeItem() {
        if (itemCount > 0) {
            itemCount--;
        }
    }

    // Method to get the number of items in the cart
    public int getItemCount() {
        return itemCount;
    }
}
