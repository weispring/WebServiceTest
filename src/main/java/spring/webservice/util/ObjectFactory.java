
package spring.webservice.util;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the spring.test.control package. 
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

    private final static QName _DoSomethingResponse_QNAME = new QName("http://control.test.spring/", "doSomethingResponse");
    private final static QName _TestMultiParamsResponse_QNAME = new QName("http://control.test.spring/", "testMultiParamsResponse");
    private final static QName _TestMultiParams_QNAME = new QName("http://control.test.spring/", "testMultiParams");
    private final static QName _DoSomething_QNAME = new QName("http://control.test.spring/", "doSomething");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: spring.test.control
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestMultiParams }
     * 
     */
    public TestMultiParams createTestMultiParams() {
        return new TestMultiParams();
    }

    /**
     * Create an instance of {@link DoSomething }
     * 
     */
    public DoSomething createDoSomething() {
        return new DoSomething();
    }

    /**
     * Create an instance of {@link DoSomethingResponse }
     * 
     */
    public DoSomethingResponse createDoSomethingResponse() {
        return new DoSomethingResponse();
    }

    /**
     * Create an instance of {@link TestMultiParamsResponse }
     * 
     */
    public TestMultiParamsResponse createTestMultiParamsResponse() {
        return new TestMultiParamsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomethingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.test.spring/", name = "doSomethingResponse")
    public JAXBElement<DoSomethingResponse> createDoSomethingResponse(DoSomethingResponse value) {
        return new JAXBElement<DoSomethingResponse>(_DoSomethingResponse_QNAME, DoSomethingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestMultiParamsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.test.spring/", name = "testMultiParamsResponse")
    public JAXBElement<TestMultiParamsResponse> createTestMultiParamsResponse(TestMultiParamsResponse value) {
        return new JAXBElement<TestMultiParamsResponse>(_TestMultiParamsResponse_QNAME, TestMultiParamsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestMultiParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.test.spring/", name = "testMultiParams")
    public JAXBElement<TestMultiParams> createTestMultiParams(TestMultiParams value) {
        return new JAXBElement<TestMultiParams>(_TestMultiParams_QNAME, TestMultiParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomething }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control.test.spring/", name = "doSomething")
    public JAXBElement<DoSomething> createDoSomething(DoSomething value) {
        return new JAXBElement<DoSomething>(_DoSomething_QNAME, DoSomething.class, null, value);
    }

}
