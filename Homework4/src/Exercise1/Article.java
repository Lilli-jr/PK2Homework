package Exercise1;

public abstract class Article {
    int discountThreshold;
    int householdLimit;

    public Article() {
        this.discountThreshold = discountThreshold;
        this.householdLimit = householdLimit;
    }

    public abstract int getBulkDiscount();
    public abstract boolean showWarning();
}
