import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class testExercise01 {

    @Test
    public void test_orderProduct_returns_correct_orderNumber() {
        String orderNumber = "123";
        String result = orderProduct("123", "Anders", 10, "Cars");
        assertEquals(orderNumber, result);
    }
    
    @Test
    public void test_getOrderInfo_returns_string() {
        String orderNumber = "123";
        orderProduct("123", "Anders", 10, "Cars");
        assertTrue(getOrderInfo(orderNumber) instanceof String);
    }
    
    @Test
    public void test_getOrderInfo_notPaid_returns_correct_string() {
        String expected = "Order number 123: Customer Anders has ordered 10 Cars. Not yet paid";
        String orderNumber = "123";
        orderProduct("123", "Anders", 10, "Cars");
        assertEquals(expected, getOrderInfo(orderNumber));
    }
    
    @Test
    public void test_getOrderInfo_paid_returns_correct_string() {
        String expected = "Order number 123: Customer Anders has ordered 10 Cars. Is paid";
        String orderNumber = "123";
        orderProduct("123", "Anders", 10, "Cars");
        payOrder("99999999", orderNumber);
        assertEquals(expected, getOrderInfo(orderNumber));
    }
    
    @Test
    public void test_getOrderInfo_orderNumber_not_found() {
        String expected = "Order number 123: Customer Anders has ordered 10 Cars. Is paid";
        String orderNumber = "xxxxx";
        assertEquals(expected, getOrderInfo(orderNumber));
    }

    private static String orderProduct(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3) {
        orderservice.OrderService_Service service = new orderservice.OrderService_Service();
        orderservice.OrderService port = service.getOrderServicePort();
        return port.orderProduct(arg0, arg1, arg2, arg3);
    }

    private static String getOrderInfo(java.lang.String arg0) {
        orderservice.OrderService_Service service = new orderservice.OrderService_Service();
        orderservice.OrderService port = service.getOrderServicePort();
        return port.getOrderInfo(arg0);
    }

    private static void payOrder(java.lang.String arg0, java.lang.String arg1) {
        orderservice.OrderService_Service service = new orderservice.OrderService_Service();
        orderservice.OrderService port = service.getOrderServicePort();
        port.payOrder(arg0, arg1);
    }

}
