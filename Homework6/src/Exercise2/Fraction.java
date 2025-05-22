package Exercise2;

public class Fraction {

    private int zaehler;
    private int nenner;

    // icomplete
    public Fraction(int zaehler, int nenner) {
        if (nenner == 0) {
            throw new IllegalArgumentException("Der Nenner darf nicht 0 sein");
        }
        this.zaehler = zaehler;
        this.nenner = nenner;
        kuerzen();
    }

    // korrekt
    public void Kehrwert() {
        int temp = this.zaehler;
        this.zaehler = this.nenner;
        this.nenner = temp;
    }

    // wrong
    public void multiplikation(Fraction a) {
        this.zaehler *= a.zaehler;
        this.nenner *= a.nenner;

    }

    // wrong
    public void addition(Fraction a) {
        if (this.nenner != a.nenner) {
            int gemeinsamerNenner = this.nenner * a.nenner;
            this.zaehler = this.zaehler * a.nenner + a.zaehler * this.nenner;
            this.nenner = gemeinsamerNenner;
        } else {
            this.zaehler += a.zaehler;
        }
        kuerzen();
    }

    // wrong
    public void kuerzen() {
        int ggt = ggt(Math.abs(zaehler), Math.abs(nenner));
        this.zaehler /= ggt;
        this.nenner /= ggt;
    }

    // helper method Euklidian algorithm ,
// here are no mistakes
    private int ggt(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return this.getZaehler() + "/" + this.getNenner();
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }
}

