package Exercise1;

public class ShippingInfo {
    String city;
    String country;
    int zip;

    public ShippingInfo(String city, String country, int zip) throws InvalidShippingInfoException{
        setCity(city);
        this.country = country;
        setZip(zip);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws InvalidShippingInfoException {
        if (city == null || city.isEmpty()) {
            throw new InvalidShippingInfoException("City name cannot be empty.");
        }
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) throws InvalidShippingInfoException {
        if (zip <= 0) {
            throw new InvalidShippingInfoException("Zip code must be a positive number.");
        }
        this.zip = zip; }
}
