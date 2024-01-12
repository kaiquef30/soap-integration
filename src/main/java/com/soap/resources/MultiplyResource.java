package com.soap.resources;


import com.soap.client.SoapClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplyResource {

    private final SoapClient soapClient;

    public MultiplyResource(SoapClient soapClient) {
        this.soapClient = soapClient;
    }

    @PostMapping("/multiply")
    public ResponseEntity<?> multiply(@RequestParam int numberOne, @RequestParam int numberTwo) {
        return ResponseEntity.status(HttpStatus.OK).body(soapClient.getDivideResponse(numberOne, numberTwo));
    }

}
