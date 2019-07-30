package com.yedam.jsc;

public class Account {
	//���¹�ȣ
	//�̸�
	//�ܾ�
	private String accountNO;
	private String name;
	private int balance;

	
	public Account(String accountNO, String name, int balance) {
		super();
		this.accountNO = accountNO;
		this.name = name;
		this.balance = balance;
	}
	
	//�Ա�(deposit)
	//���(withdraw)
	//�ܾ�(checkbalance)
	
	void deposit(int money) {
		this.balance = this.balance + money;
	}
	
	void withdraw(int money) {
		this.balance = this.balance - money;
		
	}
	
	void checkbalance() {
		System.out.println("���¹�ȣ " + this.accountNO + "�ܾ���" + balance);
	}

	public String getAccountNO() {
		return accountNO;
	}

	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
