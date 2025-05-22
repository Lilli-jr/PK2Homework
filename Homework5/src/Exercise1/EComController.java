package Exercise1;

public class EComController {
    public static void main(String[] args) {
        try {
            ShippingInfo info = new ShippingInfo("hans", "Germany", 80211); // Invalid input
            Profile profile = new Profile(info);
            Customer customer = new Customer(1, profile); // Invalid input
            System.out.println("Shipping to: " + customer.getProfile().getShippingInfo().getCity());
        } catch (InvalidShippingInfoException e) {
            System.err.println("Shipping Info Error: " + e.getMessage());
        } catch (MissingShippingInfoException e) {
            System.err.println("Profile Error: " + e.getMessage());
        } catch (InvalidCustomerException e) {
            System.err.println("Customer Error: " + e.getMessage());
        }
    }


}
//Es ist Dependency Injection, da Objekte in die Konstruktor übergeben werden (Customer bekommt ein Profile und Profil
// ein ShippingInfo

//Law of Demeter: wir können in der Customer Klasse in einer Methode die Informationen abrufen (getShippingInfo(){ return profile.getShippingInfo().getCity();}
// man sollte nicht mit mehreren methoden von unterschiedlichen Klassen, auf etwas zuzugreifen
// wie kann ich das verhindern kann: indem ich eine extra Methode schreibe, dass ich dort auf andere Klassenmoethoden zugreifen kann.
// Also eine extra Methode in einer klasse, damit man von außen nicht auf soviele Klassen zugreifen muss
