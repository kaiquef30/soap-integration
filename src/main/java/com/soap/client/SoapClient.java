package com.soap.client;

import com.soap.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class SoapClient extends WebServiceGatewaySupport {

    /**
     * metodo que soma dois numeros
     * @param numberOne
     * @param numberTwo
     * @return AddResponse
     */

    public AddResponse getAddResponse(int numberOne, int numberTwo) {

        Add addRequest = new Add();

        addRequest.setIntA(numberOne);
        addRequest.setIntB(numberTwo);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");

        return (AddResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", addRequest, soapActionCallback);
    }


    /**
     * metodo para subtrair dois numeros
     * @param numberOne
     * @param numberTwo
     * @return SubtractResponse
     */

    public SubtractResponse getSubtractResponse(int numberOne, int numberTwo) {
        Subtract subtractRequest = new Subtract();

        subtractRequest.setIntA(numberOne);
        subtractRequest.setIntB(numberTwo);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");

        return (SubtractResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", subtractRequest, soapActionCallback);
    }

    /**
     * metodo para multiplicar dois numeros
     * @param numberOne
     * @param numberTwo
     * @return MultiplyResponse
     */

    public MultiplyResponse getMultiplyResponse(int numberOne, int numberTwo) {
        Multiply multiplyRequest = new Multiply();

        multiplyRequest.setIntA(numberOne);
        multiplyRequest.setIntB(numberTwo);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");

        return (MultiplyResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", multiplyRequest, soapActionCallback);
    }

    /**
     * metodo para multiplicar dois numeros
     * @param numberOne
     * @param numberTwo
     * @return MultiplyResponse
     */

    public DivideResponse getDivideResponse(int numberOne, int numberTwo) {
        Divide divideRequest = new Divide();

        divideRequest.setIntA(numberOne);
        divideRequest.setIntB(numberTwo);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");

        return (DivideResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divideRequest, soapActionCallback);
    }

}
