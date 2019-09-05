package learn.cxf;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630254
 * 2019-09-05T11:58:43.523+02:00
 * Generated source version: 3.1.5.redhat-630254
 * 
 */
@WebServiceClient(name = "HelloService", 
                  wsdlLocation = "file:/home/sgutierr/development/3Scale/pocs/CGD/fuse/fis-thin-rest2soap-master/src/main/resources/wsdl/Hello.wsdl",
                  targetNamespace = "http://cxf.learn/") 
public class HelloService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cxf.learn/", "HelloService");
    public final static QName HelloWSPort = new QName("http://cxf.learn/", "HelloWSPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/sgutierr/development/3Scale/pocs/CGD/fuse/fis-thin-rest2soap-master/src/main/resources/wsdl/Hello.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/sgutierr/development/3Scale/pocs/CGD/fuse/fis-thin-rest2soap-master/src/main/resources/wsdl/Hello.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HelloService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HelloWS
     */
    @WebEndpoint(name = "HelloWSPort")
    public HelloWS getHelloWSPort() {
        return super.getPort(HelloWSPort, HelloWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWS
     */
    @WebEndpoint(name = "HelloWSPort")
    public HelloWS getHelloWSPort(WebServiceFeature... features) {
        return super.getPort(HelloWSPort, HelloWS.class, features);
    }

}