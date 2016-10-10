import javax.xml.ws.Holder;
import org.junit.Test;
import ws.helloworld.HelloWorldPortType;
import ws.helloworld.HelloWorldService;
import static org.junit.Assert.*;

public class HelloWorldClient {

     @Test
     public void testHelloWorld() {
             HelloWorldService service = new HelloWorldService();
             HelloWorldPortType port = service.getHelloWorldPort();
             Holder<java.lang.String> part1 = new Holder<java.lang.String>();
             part1.value = "World";
             port.helloWorld(part1);
             assertEquals("Hello World", part1.value);
     }

}