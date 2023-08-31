package herança.fixacao1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import herança.fixacao1.entities.Employee;
import herança.fixacao1.entities.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int emp = sc.nextInt();
		
		List<Employee> emps = new ArrayList<>();

		for (int i = 0; i < emp ; i++) {
			System.out.printf("Employee #%d data: %n", i+1);
			System.out.print("Outsourced (y/n)? ");
			String outsourced = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (outsourced.equals("y")) {
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				emps.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge)); 
			} else {
			
			 emps.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee x : emps) {
			System.out.println(x);
		}
		
		
		
		
		sc.close();
	}

}
