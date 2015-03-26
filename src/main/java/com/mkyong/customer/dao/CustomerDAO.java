package com.mkyong.customer.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


//@Component
//@Repository("haha")     // 这样是可以的，因为只存在一个CustomerDAO类
@Repository()
public class CustomerDAO
{
	@Override
	public String toString() {
		return "Hello , This is CustomerDAO";
	}	
}
