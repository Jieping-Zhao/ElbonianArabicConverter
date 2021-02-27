package converter.tests;

import converter.ElbonianArabicConverter;
import converter.exceptions.MalformedNumberException;
import converter.exceptions.ValueOutOfBoundsException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for the ElbonianArabicConverter class.
 */
public class ConverterTests {

    @Test
    public void isElbonian1() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMCCXI");
        assertEquals(c.isElbonian(c.getNumber()), true);
    }

    @Test
    public void isElbonian2() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMCCXXXXI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian3() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MCMXI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian4() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MLDXI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian5() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MDLIX");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian6() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("mMMCCXI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian7() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("mMCCXI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian8() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMMCCCcXI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

//    @Test
//    public void isElbonian9() throws MalformedNumberException, ValueOutOfBoundsException {
//        ElbonianArabicConverter c = new ElbonianArabicConverter("MMMCCCcCXI");
//        assertEquals(c.isElbonian(c.getNumber()), true);
//    }

    @Test
    public void isElbonian10() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMMccCCXI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian11() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMMDDCCXI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian12() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMMDCCXVVI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian13() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMMDCCLLXVI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian14() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMMDCCLXVI");
        assertEquals(c.isElbonian(c.getNumber()), true);
    }

    @Test
    public void isElbonian15() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMMdDCCLXVI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }
    @Test
    public void isElbonian16() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMMDCClLXVI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }
    @Test
    public void isElbonian17() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MMMDCCLXvVI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }
    @Test
    public void isElbonian18() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("mMDCCLXVI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }
    @Test
    public void isElbonian19() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MDcCLXVI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }
    @Test
    public void isElbonian20() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("MDCLxXVI");
        assertEquals(c.isElbonian(c.getNumber()), false);
    }

    @Test
    public void isElbonian21() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("dDcC");
        assertEquals(c.isElbonian(c.getNumber()), true);
    }

    @Test
    public void isNotFormed1() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("dDcC");
        assertEquals(c.isNotFormed(c.getNumber()), true);
    }
    @Test
    public void isNotFormed2() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("dD cC");
        assertEquals(c.isNotFormed(c.getNumber()), false);
    }
    @Test
    public void isNotFormed3() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter(" dDcC");
        assertEquals(c.isNotFormed(c.getNumber()), true);
    }
    @Test
    public void isNotFormed4() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("1dDcC");
        assertEquals(c.isNotFormed(c.getNumber()), false);
    }
    @Test
    public void isNotFormed5() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("1dDcC");
        assertEquals(c.isNotFormed(c.getNumber()), false);
    }

    @Test
    public void isNotFormed6() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("ZdDcC");
        assertEquals(c.isNotFormed(c.getNumber()), false);
    }

    @Test
    public void isNotFormed7() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter c = new ElbonianArabicConverter("1d,DcC");
        assertEquals(c.isNotFormed(c.getNumber()), false);
    }

//    @Test
//    public void ElbonianToArabicSampleTest() throws MalformedNumberException, ValueOutOfBoundsException {
//        ElbonianArabicConverter converter = new ElbonianArabicConverter("1");
//        assertEquals(converter.toElbonian(), "I");
//    }
//
//
//
//    @Test
//    public void ArabicToElbonianSampleTest() throws MalformedNumberException, ValueOutOfBoundsException {
//        ElbonianArabicConverter converter = new ElbonianArabicConverter("I");
//        assertEquals(converter.toArabic(), 1);
//    }
//
//    @Test(expected = MalformedNumberException.class)
//    public void malformedNumberTest() throws MalformedNumberException, ValueOutOfBoundsException {
//        throw new MalformedNumberException("TEST");
//    }
//
//    @Test(expected = ValueOutOfBoundsException.class)
//    public void valueOutOfBoundsTest() throws MalformedNumberException, ValueOutOfBoundsException {
//        throw new ValueOutOfBoundsException("0");
//    }

    // TODO Add more test cases
}
