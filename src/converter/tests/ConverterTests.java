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
        assertEquals("MCXI", converter.toElbonian());
    }

    @Test
    public void ArabicToElbonianTestSample2() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("3333");
        assertEquals(converter.toElbonian(), "MMMCCCXXXIII");
    }

    @Test
    public void ArabicToElbonianTestSample3() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("444");
        assertEquals("dDlLvV", converter.toElbonian());
    }

    @Test
    public void ArabicToElbonianTestSample4() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("999");
        assertEquals("DdDLlLVvV", converter.toElbonian());
    }
    @Test
    public void ArabicToElbonianTestSample5() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("");
        assertEquals("", converter.toElbonian());
    }
    @Test
    public void ArabicToElbonianTestSample6() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("                 ");
        assertEquals("", converter.toElbonian());
    }
    @Test
    public void ArabicToElbonianTestSample7() throws MalformedNumberException, ValueOutOfBoundsException{
        ElbonianArabicConverter converter = new ElbonianArabicConverter("vV");
        assertEquals("vV", converter.toElbonian());
    }



    @Test
    public void ElbonianToArabicSampleTest1() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("vV");
        assertEquals(converter.toArabic(), 4);
    }
    @Test
    public void ElbonianToArabicSampleTest2() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("MMMdDX");
        assertEquals(converter.toArabic(), 3410);
    }
    @Test
    public void ElbonianToArabicSampleTest3() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("XV");
        assertEquals(converter.toArabic(), 15);
    }
    @Test
    public void ElbonianToArabicSampleTest4() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("VII");
        assertEquals(converter.toArabic(), 7);
    }
    @Test
    public void ElbonianToArabicSampleTest5() throws MalformedNumberException, ValueOutOfBoundsException {
        ElbonianArabicConverter converter = new ElbonianArabicConverter("12");
        assertEquals(converter.toArabic(), 12);
    }




    @Test(expected = MalformedNumberException.class)
    public void malformedNumberTest() throws MalformedNumberException, ValueOutOfBoundsException {
        throw new MalformedNumberException("TEST");
    }

    @Test(expected = ValueOutOfBoundsException.class)
    public void valueOutOfBoundsTest() throws MalformedNumberException, ValueOutOfBoundsException {
        throw new ValueOutOfBoundsException("4000");
    }

    @Test(expected = ValueOutOfBoundsException.class)
    public void valueOutOfBoundsTest2() throws MalformedNumberException, ValueOutOfBoundsException {
        throw new ValueOutOfBoundsException("0");
    }

    @Test(expected = ValueOutOfBoundsException.class)
    public void valueOutOfBoundsTest3() throws MalformedNumberException, ValueOutOfBoundsException {
        throw new ValueOutOfBoundsException("-1");
    }
}
