
package orderservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the orderservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderProductResponse_QNAME = new QName("http://OrderService/", "orderProductResponse");
    private final static QName _GetOrderInfoResponse_QNAME = new QName("http://OrderService/", "getOrderInfoResponse");
    private final static QName _PayOrderResponse_QNAME = new QName("http://OrderService/", "payOrderResponse");
    private final static QName _OrderProduct_QNAME = new QName("http://OrderService/", "orderProduct");
    private final static QName _PayOrder_QNAME = new QName("http://OrderService/", "payOrder");
    private final static QName _GetOrderInfo_QNAME = new QName("http://OrderService/", "getOrderInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: orderservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderInfo }
     * 
     */
    public GetOrderInfo createGetOrderInfo() {
        return new GetOrderInfo();
    }

    /**
     * Create an instance of {@link OrderProductResponse }
     * 
     */
    public OrderProductResponse createOrderProductResponse() {
        return new OrderProductResponse();
    }

    /**
     * Create an instance of {@link GetOrderInfoResponse }
     * 
     */
    public GetOrderInfoResponse createGetOrderInfoResponse() {
        return new GetOrderInfoResponse();
    }

    /**
     * Create an instance of {@link PayOrderResponse }
     * 
     */
    public PayOrderResponse createPayOrderResponse() {
        return new PayOrderResponse();
    }

    /**
     * Create an instance of {@link OrderProduct }
     * 
     */
    public OrderProduct createOrderProduct() {
        return new OrderProduct();
    }

    /**
     * Create an instance of {@link PayOrder }
     * 
     */
    public PayOrder createPayOrder() {
        return new PayOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://OrderService/", name = "orderProductResponse")
    public JAXBElement<OrderProductResponse> createOrderProductResponse(OrderProductResponse value) {
        return new JAXBElement<OrderProductResponse>(_OrderProductResponse_QNAME, OrderProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://OrderService/", name = "getOrderInfoResponse")
    public JAXBElement<GetOrderInfoResponse> createGetOrderInfoResponse(GetOrderInfoResponse value) {
        return new JAXBElement<GetOrderInfoResponse>(_GetOrderInfoResponse_QNAME, GetOrderInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://OrderService/", name = "payOrderResponse")
    public JAXBElement<PayOrderResponse> createPayOrderResponse(PayOrderResponse value) {
        return new JAXBElement<PayOrderResponse>(_PayOrderResponse_QNAME, PayOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://OrderService/", name = "orderProduct")
    public JAXBElement<OrderProduct> createOrderProduct(OrderProduct value) {
        return new JAXBElement<OrderProduct>(_OrderProduct_QNAME, OrderProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://OrderService/", name = "payOrder")
    public JAXBElement<PayOrder> createPayOrder(PayOrder value) {
        return new JAXBElement<PayOrder>(_PayOrder_QNAME, PayOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://OrderService/", name = "getOrderInfo")
    public JAXBElement<GetOrderInfo> createGetOrderInfo(GetOrderInfo value) {
        return new JAXBElement<GetOrderInfo>(_GetOrderInfo_QNAME, GetOrderInfo.class, null, value);
    }

}
