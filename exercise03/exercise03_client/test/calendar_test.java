import org.junit.Test;
import static org.junit.Assert.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class calendar_test {

    @Test
    public void creat_an_appointment_test() throws DatatypeConfigurationException {
        DatatypeFactory df = DatatypeFactory.newInstance();
        XMLGregorianCalendar date = df.newXMLGregorianCalendar("2011-09-15");
        String appointment = "drive";
        
        addAppointment(appointment, date);
        assertEquals(appointment, getAppointment(date));
    }

    @Test
    public void creat_override_an_appointment_test() throws DatatypeConfigurationException {
        DatatypeFactory df = DatatypeFactory.newInstance();
        XMLGregorianCalendar date = df.newXMLGregorianCalendar("2011-09-15");
        String appointment = "drive";
        String appointment2 = "home";
        
        addAppointment(appointment, date);
        addAppointment(appointment2, date);
        assertEquals(appointment2, getAppointment(date));
    }
    
    private static void addAppointment(java.lang.String appointment, javax.xml.datatype.XMLGregorianCalendar date) {
        exercise03_client.CalendarWSDLService service = new exercise03_client.CalendarWSDLService();
        exercise03_client.CalendarServicePortType port = service.getCalendarServicePortTypeBindingPort();
        port.addAppointment(appointment, date);
    }

    private static String getAppointment(javax.xml.datatype.XMLGregorianCalendar date) {
        exercise03_client.CalendarWSDLService service = new exercise03_client.CalendarWSDLService();
        exercise03_client.CalendarServicePortType port = service.getCalendarServicePortTypeBindingPort();
        return port.getAppointment(date);
    }
}
