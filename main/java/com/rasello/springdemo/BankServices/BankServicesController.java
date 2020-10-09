package com.rasello.springdemo.BankServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BankServicesController {
    @Autowired
    private BankServices bankServices;


    @RequestMapping(value = "/banks/{checkId}", method = RequestMethod.PUT)
    public ResponseEntity<Object>
    updateProduct(@PathVariable("checkId") String id, @RequestBody BankInfo bankLoan){
        bankServices.updateLoan(id, bankLoan);
        return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);


}




}
