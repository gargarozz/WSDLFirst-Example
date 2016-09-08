package WSclient;

import com.examples.wsdl.helloservice.HelloPortType;
import com.examples.wsdl.helloservice.HelloService;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

/**
 * Created by giuliano on 08/09/16.
 */
public class WSClient {
    public static void main(String[] args) {

        HelloService service = new HelloService();
        HelloPortType client;
        BindingProvider bp;
        client = service.getHelloPort();
        bp = (BindingProvider) client;
        bp.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/SayHello");
        System.out.println(client.sayHello("Hi!"));

    }
}
