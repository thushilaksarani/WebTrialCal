package com.demo.domain;

import java.util.Date;

public class Prospect {
	String fName, lName, nic;
	double loanAmt, InterestRate, installmentVal;
	int repayPeriod; 
	Date date;
	
	public Prospect(String fName, String lName, String nic, double loanAmt, int repayPeriod, double interestRate,
			double installmentVal, Date date) {
		this.fName = fName;
		this.lName = lName;
		this.nic = nic;
		this.loanAmt = loanAmt;
		this.repayPeriod = repayPeriod;
		this.InterestRate = interestRate;
		this.installmentVal = installmentVal;
		this.date=date;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setaDate(Date date) {
		this.date = date;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}

	public int getRepayPeriod() {
		return repayPeriod;
	}

	public void setRepayPeriod(int repayPeriod) {
		this.repayPeriod = repayPeriod;
	}

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}

	public double getInstallmentVal() {
		return installmentVal;
	}

	public void setInstallmentVal(double installmentVal) {
		this.installmentVal = installmentVal;
	}
	
	
	
}
