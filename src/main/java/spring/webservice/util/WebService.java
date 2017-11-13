
package spring.webservice.util;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@javax.jws.WebService(name = "WebService", targetNamespace = "http://control.test.spring/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebService {


    /**
     * 
     * @param type
     * @param value
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "testMultiParams", targetNamespace = "http://control.test.spring/", className = "spring.test.control.TestMultiParams")
    @ResponseWrapper(localName = "testMultiParamsResponse", targetNamespace = "http://control.test.spring/", className = "spring.test.control.TestMultiParamsResponse")
    @Action(input = "http://control.test.spring/WebService/testMultiParamsRequest", output = "http://control.test.spring/WebService/testMultiParamsResponse")
    public String testMultiParams(
        @WebParam(name = "value", targetNamespace = "http://control.test.spring/")
        String value,
        @WebParam(name = "type", targetNamespace = "http://control.test.spring/")
        String type);

    /**
     * 
     * @param value
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "doSomething", targetNamespace = "http://control.test.spring/", className = "spring.test.control.DoSomething")
    @ResponseWrapper(localName = "doSomethingResponse", targetNamespace = "http://control.test.spring/", className = "spring.test.control.DoSomethingResponse")
    @Action(input = "http://control.test.spring/WebService/doSomethingRequest", output = "http://control.test.spring/WebService/doSomethingResponse")
    public String doSomething(
        @WebParam(name = "value", targetNamespace = "http://control.test.spring/")
        String value);

}
