package Exercise1;

public abstract class PopularGrocery extends GroceryItem{
    int popularityLevel;
    int quantity;

    public PopularGrocery(int popularityLevel){
        super();
        isPopular = true;
        this.popularityLevel = popularityLevel;
    }



    public boolean showWarning(){
        boolean showWarning = false;
        if (quantity > householdLimit){
            showWarning = true;
        }return showWarning;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
