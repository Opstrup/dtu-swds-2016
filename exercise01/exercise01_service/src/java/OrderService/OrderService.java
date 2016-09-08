package OrderService;

import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService(serviceName = "OrderService")
public class OrderService {
    HashMap<String, Order> orders = new HashMap<String, Order>();
    
    /**
     *
     * @param orderNumber
     * @param costumerName
     * @param amount
     * @param product
     * @return
     */
    @WebMethod(operationName = "orderProduct")
    public String orderProduct(String orderNumber, String custumerName, int amount, String product) {
        //Create new order here and put it in the HashMap
        Order newOrder = new Order();
        newOrder.orderNumber = orderNumber;
        newOrder.customerName = custumerName;
        newOrder.amount = amount;
        newOrder.product = product;
        newOrder.isPaid = false;
        
        orders.put(orderNumber, newOrder);
        
        return newOrder.orderNumber;
    }
    
    /**
     *
     * @param orderNumber
     * @return
     */
    @WebMethod(operationName = "getOrderInfo")
    public String getOrderInfo(String orderNumber) {
        Order order = orders.get(orderNumber);
        if (order.isPaid) {
            return "Order number " + order.orderNumber + ": Customer " + 
                    order.customerName + " has ordered " + order.amount + " " +
                    order.product + ". Is paid";
        }
        return "Order number " + order.orderNumber + ": Customer " + 
                    order.customerName + " has ordered " + order.amount + " " +
                    order.product + ". Not yet paid";
    }
    
    /**
     *
     * @param cardNumber
     * @param orderNumber
     */
    @WebMethod(operationName = "payOrder")
    public void payOrder(String cardNumber, String orderNumber) {
        if (cardNumber.length() > 0) {
            Order order = orders.get(orderNumber);
            order.isPaid = true;
        }
    }
}
