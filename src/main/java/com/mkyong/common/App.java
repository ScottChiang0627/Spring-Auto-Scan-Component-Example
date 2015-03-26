package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.services.CustomerService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext(new String[] {"Spring-AutoScan.xml"});

    	CustomerService cust = (CustomerService)context.getBean("customerService");
		// 如果那边是@Service("haha"),这样也行
//		CustomerService cust = (CustomerService)context.getBean("haha");
// 哒哒哒哒
    	System.out.println(cust);
    	
    }
}
