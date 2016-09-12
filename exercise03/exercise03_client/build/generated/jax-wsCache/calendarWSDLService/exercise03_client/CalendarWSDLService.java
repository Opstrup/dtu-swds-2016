
package exercise03_client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "calendarWSDLService", targetNamespace = "http://ws.imm.dtu.dk/calendar", wsdlLocation = "http://opstrup:8080/exercise03_service/calendarWSDLService?wsdl")
public class CalendarWSDLService
    extends Service
{

    private final static URL CALENDARWSDLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALENDARWSDLSERVICE_EXCEPTION;
    private final static QName CALENDARWSDLSERVICE_QNAME = new QName("http://ws.imm.dtu.dk/calendar", "calendarWSDLService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://opstrup:8080/exercise03_service/calendarWSDLService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALENDARWSDLSERVICE_WSDL_LOCATION = url;
        CALENDARWSDLSERVICE_EXCEPTION = e;
    }

    public CalendarWSDLService() {
        super(__getWsdlLocation(), CALENDARWSDLSERVICE_QNAME);
    }

    public CalendarWSDLService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALENDARWSDLSERVICE_QNAME, features);
    }

    public CalendarWSDLService(URL wsdlLocation) {
        super(wsdlLocation, CALENDARWSDLSERVICE_QNAME);
    }

    public CalendarWSDLService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALENDARWSDLSERVICE_QNAME, features);
    }

    public CalendarWSDLService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalendarWSDLService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalendarServicePortType
     */
    @WebEndpoint(name = "calendarServicePortTypeBindingPort")
    public CalendarServicePortType getCalendarServicePortTypeBindingPort() {
        return super.getPort(new QName("http://ws.imm.dtu.dk/calendar", "calendarServicePortTypeBindingPort"), CalendarServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalendarServicePortType
     */
    @WebEndpoint(name = "calendarServicePortTypeBindingPort")
    public CalendarServicePortType getCalendarServicePortTypeBindingPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.imm.dtu.dk/calendar", "calendarServicePortTypeBindingPort"), CalendarServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALENDARWSDLSERVICE_EXCEPTION!= null) {
            throw CALENDARWSDLSERVICE_EXCEPTION;
        }
        return CALENDARWSDLSERVICE_WSDL_LOCATION;
    }

}