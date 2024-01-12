package com.soap.resources;

import com.soap.client.SoapClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivideResource {

    private final SoapClient soapClient;


    public DivideResource(SoapClient soapClient) {
        this.soapClient = soapClient;
    }

    @PostMapping("/divide")
    public ResponseEntity<?> divide(@RequestParam int numberOne, @RequestParam int numberTwo) {
        return ResponseEntity.status(HttpStatus.OK).body(soapClient.getDivideResponse(numberOne, numberTwo));
    }

}
