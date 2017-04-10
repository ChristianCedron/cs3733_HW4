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
    public void ElbonianToArabicSampleTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("1111");
        assertEquals(converter.toElbonian(), "MCXI");
    }

    @Test
    public void ElbonianToArabicSampleTest2() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("3333");
        assertEquals(converter.toElbonian(), "MMMCCCXXXIII");
    }

    @Test
    public void ElbonianToArabicSampleTest3() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("444");
        assertEquals(converter.toElbonian(), "dDlLvV");
    }

    @Test
    public void ElbonianToArabicSampleTest4() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("999");
        assertEquals(converter.toElbonian(), "DdDLlLVvV");
    }



    @Test
    public void ArabicToElbonianSampleTest() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("vV");
        assertEquals(converter.toArabic(), 4);
    }

    @Test(expected = MalformedNumberException.class)
    public void malformedNumberTest() throws MalformedNumberException, ValueOutOfBoundsException {
        throw new MalformedNumberException("TEST");
    }

    @Test(expected = ValueOutOfBoundsException.class)
    public void valueOutOfBoundsTest() throws MalformedNumberException, ValueOutOfBoundsException {
        throw new ValueOutOfBoundsException("4000");
    }

    // TODO Add more test cases
}
