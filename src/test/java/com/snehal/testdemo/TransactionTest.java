package com.snehal.testdemo;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransactionTest {
	List<Account> accounts = new LinkedList<Account>();

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Initializing the sample data....");
		accounts.add(new Account(1001, "Mahendra", 23000D));
		accounts.add(new Account(1002, "Sonali", 29000D));
		accounts.add(new Account(1003, "Dakshata", 2100D));
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Cleaning / Deleting the sample ....");
		accounts.clear();
	}

	@Test
	void testDeposit() {
		System.out.println("testing deposits...");
	}

	@Test
	void testWithdraw() {
		System.out.println("testing withdrawals...");
	}

}
