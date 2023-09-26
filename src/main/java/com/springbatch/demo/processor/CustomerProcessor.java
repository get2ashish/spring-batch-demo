package com.springbatch.demo.processor;

import com.springbatch.demo.entity.Customer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getCountry().equalsIgnoreCase("United States")){
            return customer;
        }else {
            return null;
        }
    }
}
