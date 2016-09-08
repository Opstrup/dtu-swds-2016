/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import net.webservicex.TemperatureUnit;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Opstrup
 */
public class exercise02_test {
    
    @Test
    public void convert_celsius_to_fahrenheit_test() {
        double celsius = 100;
        double expectedFahrenheit = 212;
        double result = convertTemp(celsius, TemperatureUnit.DEGREE_CELSIUS, TemperatureUnit.DEGREE_FAHRENHEIT);
        assertEquals(expectedFahrenheit, result, 0.001);
    }
    
    @Test
    public void convert_fahrenheit_to_celsius_test() {
        double fahrenheit = 100;
        double expectedCelsuis = 37.77777777777777;
        double result = convertTemp(fahrenheit, TemperatureUnit.DEGREE_FAHRENHEIT, TemperatureUnit.DEGREE_CELSIUS);
        assertEquals(expectedCelsuis, result, 0.001);
    }

    private static double convertTemp(double temperature, net.webservicex.TemperatureUnit fromUnit, net.webservicex.TemperatureUnit toUnit) {
        net.webservicex.ConvertTemperature service = new net.webservicex.ConvertTemperature();
        net.webservicex.ConvertTemperatureSoap port = service.getConvertTemperatureSoap();
        return port.convertTemp(temperature, fromUnit, toUnit);
    }

}
