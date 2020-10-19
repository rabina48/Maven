package com.rasello.springdemo.BankServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankServicesController {


    private final BankServices bankServices;

    @Autowired
    public BankServicesController(BankServices bankServices) {
        this.bankServices = bankServices;
    }

    @RequestMapping(value = "/banks", method = RequestMethod.PUT)
    public ResponseEntity<Object>
    updateProduct(@RequestBody CustomersInfo bankLoan) {
        bankServices.updateLoan(bankLoan);
        return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);

    }

    @PostMapping(value = "/banks")
    public ResponseEntity<Object>
    addProduct(@RequestBody CustomersInfo bankLoan) {
        bankServices.createLoan(bankLoan);
        return new ResponseEntity<>("Product is added successsfully", HttpStatus.OK);

    }

    @DeleteMapping(value = "/banks/{id}")
    public ResponseEntity<Object>
    deleteProduct(@PathVariable long id) {
        bankServices.deleteLoan(id);
        return new ResponseEntity<>("Product is delete successsfully", HttpStatus.OK);

    }

    @GetMapping(value = "/banks/{id}")
    public CustomersInfo getProduct(@PathVariable long id) {
        return bankServices.getLoan(id);

    }

    @GetMapping(value = "/banks")
    public List<CustomersInfo> getAllProduct() {
        return bankServices.getAll();

    }
}
