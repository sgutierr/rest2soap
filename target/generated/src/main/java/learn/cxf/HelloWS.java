package learn.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630254
 * 2019-09-05T11:58:43.481+02:00
 * Generated source version: 3.1.5.redhat-630254
 * 
 */
@WebService(targetNamespace = "http://cxf.learn/", name = "HelloWS")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWS {

    @WebMethod
    @RequestWrapper(localName = "bonjour", targetNamespace = "http://cxf.learn/", className = "learn.cxf.Bonjour")
    @ResponseWrapper(localName = "bonjourResponse", targetNamespace = "http://cxf.learn/", className = "learn.cxf.BonjourResponse")
    public void bonjour(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "nickname", targetNamespace = "")
        java.lang.String nickname,
        @WebParam(mode = WebParam.Mode.OUT, name = "message", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> message,
        @WebParam(mode = WebParam.Mode.OUT, name = "status", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> status
    );
}
