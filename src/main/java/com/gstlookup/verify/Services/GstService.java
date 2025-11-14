package com.gstlookup.verify.Services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gstlookup.verify.Entity.GstResponse;

@Service
public class GstService {

    private String AppyFlow_Url="https://appyflow.in/api/verifyGST?gstNo=gstno&key_secret=apikey";
  //  @Value("${app.gst.api.key}")
    private String API_KEY="VIbG6fAmz0ez18zK6TAFHmuUhU23";


   

    public GstResponse lookUp(String gstIn){

        String Url= AppyFlow_Url.replace("gstno", gstIn).replace("apikey", API_KEY);
          RestTemplate restTemplate=new RestTemplate();

          // Add headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json"); // Important!
        HttpEntity<String> entity = new HttpEntity<>(headers);

        try{
            
        
            ResponseEntity<String> response= restTemplate.exchange(Url,HttpMethod.GET,entity,String.class);
            String json = response.getBody();
            ObjectMapper mapper = new ObjectMapper();

            JsonNode root = mapper.readTree(json);
            JsonNode taxpayerInfo = root.path("taxpayerInfo");

            GstResponse gstData = mapper.treeToValue(taxpayerInfo, GstResponse.class);
            System.out.println(gstData);
            return gstData;
        }
        catch(Exception e){
            GstResponse error= new GstResponse();
            error.setSts("Error!");
            error.setTradeNam("Verification Failed"+e.getMessage());
            return error;
        }

    }

}
