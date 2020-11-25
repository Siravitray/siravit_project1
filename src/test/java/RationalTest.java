import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RationalTest {

    @Test
    public void testRational() {
        Rational r = new Rational();
        assertNotNull(r);
    }

    @Test
    public void testRationalWithValues() {
        try {
            Rational r = new Rational(2, 4);
            assertEquals(1, r.numerator);
            assertEquals(3, r.denominator);
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }

    }

    /***
    * add your test cases here
    ***/

}
