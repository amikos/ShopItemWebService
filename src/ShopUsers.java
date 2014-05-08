
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Admin on 07.05.14.
 */
@WebService(targetNamespace = "http://test")
public class ShopUsers {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new ShopUsers ();
    String address = "http://localhost:9000/ShopUsers";
    Endpoint.publish(address, implementor);
  }
}
