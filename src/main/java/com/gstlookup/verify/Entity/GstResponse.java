package com.gstlookup.verify.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GstResponse {

    @JsonProperty("gstin")
    private String gstin;
     @JsonProperty("lgnm")
    private String lgnm;
     @JsonProperty("tradeNam")
    private String tradeNam;
     @JsonProperty("sts")
    private String sts;
     public String getGstin() {
         return gstin;
     }
     public void setGstin(String gstin) {
         this.gstin = gstin;
     }
     public String getLgnm() {
         return lgnm;
     }
     public void setLgnm(String lgnm) {
         this.lgnm = lgnm;
     }
     public String getTradeNam() {
         return tradeNam;
     }
     public void setTradeNam(String tradeNam) {
         this.tradeNam = tradeNam;
     }
     public String getSts() {
         return sts;
     }
     public void setSts(String sts) {
         this.sts = sts;
     }
     public GstResponse() {
     }
     public GstResponse(String gstin, String lgnm, String tradeNam, String sts) {
        this.gstin = gstin;
        this.lgnm = lgnm;
        this.tradeNam = tradeNam;
        this.sts = sts;
     }
     @Override
     public String toString() {
        return "GstResponse [gstin=" + gstin + ", lgnm=" + lgnm + ", tradeNam=" + tradeNam + ", sts=" + sts + "]";
     }
     

    
   

}
