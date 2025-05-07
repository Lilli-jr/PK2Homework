package Exercise1;

public class Customer {
    private int id;
    private Profile profile;

    public Customer(int id, Profile profile) throws InvalidCustomerException{
        setProfile(profile);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws InvalidCustomerException {
        if (id < 0) {
            throw new InvalidCustomerException("Customer ID must be a non-negative number.");
        }
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) throws InvalidCustomerException {
        if (profile == null) {
            throw new InvalidCustomerException("Profile cannot be null.");
        }
        this.profile = profile;
    }
}
