package com.devedernatan.dsmeta.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.devedernatan.dsmeta.entities.Sale;
import com.devedernatan.dsmeta.repositories.SalesRepository;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;



@Service
public class SmsService {

    @Value("${twilio.sid}")
    private String twilioSid;

    @Value("${twilio.key}")
    private String twilioKey;

    @Value("${twilio.phone.from}")
    private String twilioPhoneFrom;

    @Value("${twilio.phone.to}")
    private String twilioPhoneTo;
    
    @Autowired
  private SalesRepository salerepository;  
    
    
    
//
    public void sendSms(Long saleID) {
    	
    	Sale sale = salerepository.findById(saleID).get();
    	String date = sale.getDate().getMonth() + "/" + sale.getDate().getYear();
    	String msg = "O vendedor" + sale.getSellerName() + "foi destaque em " + date+
    	"com um valor de R$ "+String.format("%.2f" , sale.getAmount());		
    			;
    	
    	
    	

        Twilio.init(twilioSid, twilioKey);

        PhoneNumber to = new PhoneNumber(twilioPhoneTo);
        PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

        Message message = Message.creator(to, from, msg).create();

        System.out.println(message.getSid());
    }
}