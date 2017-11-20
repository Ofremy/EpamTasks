import static org.junit.Assert.*;

import com.epam.TemperatureConverter;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Orest
 * 15.11.2017
 * Java Version 1.8.
 */
public class TestTemperatureConverter {
    private TemperatureConverter converter = new TemperatureConverter();

    @Before
    public void initiallize(){
        converter = new TemperatureConverter();
    }

    @Test
    public void testConvertFtoC(){
        assertEquals(-15,converter.convertFtoC(5),0.00001);
    }
    @Test
    public void testConvertCtoF(){
        assertEquals(50,converter.convertCtoF(10),0.00001);
    }
    @Test
    public void testConvertCtoK(){
        assertEquals(280.2,converter.convertCtoK(7),0.00001);
    }
    @Test
    public void testConvertKtoC(){
        assertEquals(-264.2,converter.convertKtoC(9),0.00001);
    }
    @Test
    public void testConvertFtoK(){
        assertEquals(263.722,converter.convertFtoK(15),0.001);
    }
    @Test
    public void testConvertKtoF(){
        assertEquals(-414.7,converter.convertKtoF(25),0.00001);
    }
}
