package com.nit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.LoanOperation;
import com.entity.Loan;


public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        List<Loan> data = new ArrayList<Loan>();
        
        while (true) {
			System.out.println("LOAN MANU");
			System.out.println("====================================");
			System.out.println("Press 1: Create a Loan.");
			System.out.println("Press 2: Retrive a Loan.");
			System.out.println("Press 3: Retrive all Loans.");
			System.out.println("Press 4: Update a Loan.");
			System.out.println("Press 5: Delete a Loan.");
			System.out.println("====================================");	
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:
				System.out.println("Enter you loan details:");
				Loan loan = new Loan();
				
				System.out.print("Enter a Coustomer Name: ");
				loan.setCoustomerName(sc.next());
				
				System.out.print("Enter a Loan Type: ");
				loan.setLoanType(sc.next());
				
				System.out.print("Enter a Loan Amount: ");
				loan.setLoanAmount(sc.nextDouble());
				
				System.out.print("Enter a Interest Rate: ");
				loan.setInterestRate(sc.nextDouble());
				
				System.out.print("Enter a Duration Months: ");
				loan.setDurationMonths(sc.nextInt());
				
				System.out.print("Enter a Loan Status: ");
				loan.setLoanStatus(sc.next());
				
				System.out.print("Enter a Credit Score: ");
				loan.setCreditScore(sc.nextInt());
				
				data.add(loan);
				
				String msg = LoanOperation.createALoan(loan);
				
				System.out.println(msg);
				break;
				
			case 2:
				System.out.println("Enter Loan Id for Retrive a Loan.");
				int id = sc.nextInt();
				
				Loan loan2 = LoanOperation.retriveALoan(id);
				System.out.println(loan2);
				
				break;
				
			case 3:
				List<Loan> retriveAllLoan = LoanOperation.retriveAllLoan(data);
				
				retriveAllLoan.forEach(System.out::println);
				
				break;
				
			case 4:
				System.out.println("Enter Loan Id for Update: ");
				int updateId = sc.nextInt();
				
				System.out.println("Enter your updated status: ");
				String updatedStatus = sc.next();
				
				System.out.println("Enter your updated interest rate: ");
				double updatedInterestRate = sc.nextDouble();
				
				Loan loan3 = LoanOperation.updateALoan(updateId, updatedStatus, updatedInterestRate);
				System.out.println(loan3);
				break;
				
			case 5:
				System.out.println("Enter Loan Id for remove: ");
				int removeId = sc.nextInt();
				
				String msg2 = LoanOperation.deleteALoan(removeId);
				System.out.println(msg2);
				break;
				
			case 6:
				System.out.println("Thank you.....");
				System.exit(0);
				break;
				
			default:
				System.out.println("Wrong choice! Enter you choice...");
				break;
			}
		}
    }
}
