package com.gstlookup.verify.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gstlookup.verify.Entity.GstResponse;
import com.gstlookup.verify.Services.GstService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/gst")
@CrossOrigin(origins = "*")
public class MainController {

    @Autowired
    private GstService gstService;

    @GetMapping( value= "/verify/{gstIn}", produces = "application/json")
    public GstResponse verifyGst(@PathVariable() String gstIn){
             gstIn = gstIn.trim(); 
        return gstService.lookUp(gstIn);
    }
    
     



}
