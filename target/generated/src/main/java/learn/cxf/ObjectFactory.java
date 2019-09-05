
package learn.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the learn.cxf package. 
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

    private final static QName _Bonjour_QNAME = new QName("http://cxf.learn/", "bonjour");
    private final static QName _BonjourResponse_QNAME = new QName("http://cxf.learn/", "bonjourResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: learn.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Bonjour }
     * 
     */
    public Bonjour createBonjour() {
        return new Bonjour();
    }

    /**
     * Create an instance of {@link BonjourResponse }
     * 
     */
    public BonjourResponse createBonjourResponse() {
        return new BonjourResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bonjour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.learn/", name = "bonjour")
    public JAXBElement<Bonjour> createBonjour(Bonjour value) {
        return new JAXBElement<Bonjour>(_Bonjour_QNAME, Bonjour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BonjourResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.learn/", name = "bonjourResponse")
    public JAXBElement<BonjourResponse> createBonjourResponse(BonjourResponse value) {
        return new JAXBElement<BonjourResponse>(_BonjourResponse_QNAME, BonjourResponse.class, null, value);
    }

}
