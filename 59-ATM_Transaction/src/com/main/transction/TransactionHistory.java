package com.main.transction;

import com.main.customer.CustomerDetails_A;
import com.main.customer.CustomerDetails_B;

public class TransactionHistory {

	CustomerDetails_A a= new CustomerDetails_A();
	CustomerDetails_B b= new CustomerDetails_B();
	
	public int credti() {
		System.out.println("Remainig Balance of A is :");
		int remaining =a.balance()-5000;
		System.out.println(remaining);
		return remaining;
	}
	
	public int moneycredit() {
		int money_a=a.balance();
		int money_b=b.balance();
		int afterdebitmoney=a.balance()-5000;
		System.out.println("A's Money after deduction is :"+afterdebitmoney);
		int aftercreditmoney=b.balance()+afterdebitmoney;
		System.out.println("B's Money after credit is :"+aftercreditmoney);
		return aftercreditmoney;
	}
}
