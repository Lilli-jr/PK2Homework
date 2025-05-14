package Exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FractionTest {

  @Test
    void testKehrwert(){
      Fraction f = new Fraction(2, 3);
      f.Kehrwert();
      assertEquals(3, f.getZaehler());
      assertEquals(2, f.getNenner());
  }
  @Test
  void testMultiplikation(){
    Fraction f1 = new Fraction(2, 3);
    Fraction f2 = new Fraction(3, 4);
    f1.multiplikation(f2);
    assertEquals(6, f1.getZaehler());
    assertEquals(12, f1.getNenner());
  }
  @Test
  void testAddition(){
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(1, 3);
    f1.addition(f2);
    assertEquals(5, f1.getZaehler());
    assertEquals(6, f1.getNenner());
  }
  @Test
  void testKuerzen(){
    Fraction f = new Fraction(4,8);
    f.kuerzen();
    assertEquals(1, f.getZaehler());
    assertEquals(2, f.getNenner());
  }

}
