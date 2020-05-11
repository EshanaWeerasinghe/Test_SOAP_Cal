
package esh.WebServiceClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorWebservice", targetNamespace = "http://Webservice.begin.eshana/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWebservice {


    /**
     * 
     * @param secondNum
     * @param firstNum
     * @return
     *     returns int
     */
    @WebMethod(operationName = "AddIntegers")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AddIntegers", targetNamespace = "http://Webservice.begin.eshana/", className = "esh.WebServiceClient.AddIntegers")
    @ResponseWrapper(localName = "AddIntegersResponse", targetNamespace = "http://Webservice.begin.eshana/", className = "esh.WebServiceClient.AddIntegersResponse")
    @Action(input = "http://Webservice.begin.eshana/CalculatorWebservice/AddIntegersRequest", output = "http://Webservice.begin.eshana/CalculatorWebservice/AddIntegersResponse")
    public int addIntegers(
        @WebParam(name = "firstNum", targetNamespace = "")
        int firstNum,
        @WebParam(name = "secondNum", targetNamespace = "")
        int secondNum);

    /**
     * 
     * @param secondNum
     * @param firstNum
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divIntegers", targetNamespace = "http://Webservice.begin.eshana/", className = "esh.WebServiceClient.DivIntegers")
    @ResponseWrapper(localName = "divIntegersResponse", targetNamespace = "http://Webservice.begin.eshana/", className = "esh.WebServiceClient.DivIntegersResponse")
    @Action(input = "http://Webservice.begin.eshana/CalculatorWebservice/divIntegersRequest", output = "http://Webservice.begin.eshana/CalculatorWebservice/divIntegersResponse")
    public int divIntegers(
        @WebParam(name = "firstNum", targetNamespace = "")
        int firstNum,
        @WebParam(name = "secondNum", targetNamespace = "")
        int secondNum);

    /**
     * 
     * @param secondNum
     * @param firstNum
     * @return
     *     returns int
     */
    @WebMethod(operationName = "SubIntegers")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SubIntegers", targetNamespace = "http://Webservice.begin.eshana/", className = "esh.WebServiceClient.SubIntegers")
    @ResponseWrapper(localName = "SubIntegersResponse", targetNamespace = "http://Webservice.begin.eshana/", className = "esh.WebServiceClient.SubIntegersResponse")
    @Action(input = "http://Webservice.begin.eshana/CalculatorWebservice/SubIntegersRequest", output = "http://Webservice.begin.eshana/CalculatorWebservice/SubIntegersResponse")
    public int subIntegers(
        @WebParam(name = "firstNum", targetNamespace = "")
        int firstNum,
        @WebParam(name = "secondNum", targetNamespace = "")
        int secondNum);

    /**
     * 
     * @param secondNum
     * @param firstNum
     * @return
     *     returns int
     */
    @WebMethod(operationName = "MulIntegers")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "MulIntegers", targetNamespace = "http://Webservice.begin.eshana/", className = "esh.WebServiceClient.MulIntegers")
    @ResponseWrapper(localName = "MulIntegersResponse", targetNamespace = "http://Webservice.begin.eshana/", className = "esh.WebServiceClient.MulIntegersResponse")
    @Action(input = "http://Webservice.begin.eshana/CalculatorWebservice/MulIntegersRequest", output = "http://Webservice.begin.eshana/CalculatorWebservice/MulIntegersResponse")
    public int mulIntegers(
        @WebParam(name = "firstNum", targetNamespace = "")
        int firstNum,
        @WebParam(name = "secondNum", targetNamespace = "")
        int secondNum);

}
