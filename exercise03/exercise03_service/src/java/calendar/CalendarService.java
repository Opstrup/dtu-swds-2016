/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.util.HashMap;
import javax.jws.WebService;

/**
 *
 * @author Opstrup
 */
@WebService(serviceName = "calendarWSDLService", portName = "calendarServicePortTypeBindingPort", endpointInterface = "dk.dtu.imm.ws.calendar.CalendarServicePortType", targetNamespace = "http://ws.imm.dtu.dk/calendar", wsdlLocation = "WEB-INF/wsdl/CalendarService/calendarWSDL.wsdl")
public class CalendarService {
    HashMap<javax.xml.datatype.XMLGregorianCalendar, String> appointments = new HashMap<>();
    
    public void addAppointment(java.lang.String appointment, javax.xml.datatype.XMLGregorianCalendar date) {
        appointments.put(date, appointment);
    }

    public java.lang.String getAppointment(javax.xml.datatype.XMLGregorianCalendar date) throws InterruptedException {
        String appointment = appointments.get(date);
        //Thread.sleep(3000);
        return appointment;
    }
    
}
