package Exercise1;

public class Profile {
    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException{
        setShippingInfo(shippingInfo);
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) throws MissingShippingInfoException {
        if (shippingInfo == null) {
            throw new MissingShippingInfoException("ShippingInfo cannot be null.");
        }
        this.shippingInfo = shippingInfo;
    }
}
