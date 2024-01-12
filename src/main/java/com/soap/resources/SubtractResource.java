package com.soap.resources;


import com.soap.client.SoapClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubtractResource {

    private final SoapClient soapClient;

    public SubtractResource(SoapClient soapClient) {
        this.soapClient = soapClient;
    }

    @PostMapping("/subtract")
    public ResponseEntity<?> subtract(@RequestParam int numberOne, @RequestParam int numberTwo) {
        return ResponseEntity.status(HttpStatus.OK).body(soapClient.getSubtractResponse(numberOne, numberTwo));
    }

}
