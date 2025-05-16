package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.reference.Provider;
import com.employee.reference.Student;
import com.employee.reference.Stuff;
import com.employee.reference.WorkInter;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		System.out.println("Employee");
		
//		provide the implementation of work implementation
//		
//		WorkInter workInter = ()->{
//			System.out.println("this is do task new method");
//		};
//		
//		workInter.doTask();
		
//		WorkInter workInter = Stuff::dostuff;
//		
//		workInter.doTask();
		
//		Stuff s = new Stuff();
//		WorkInter workInter1 = s::myself;
////		int  i  = workInter1.doTask();
//		System.out.println(i);
		
		
		
//		Runnable workInter2 = Stuff::threadTask;
//		Thread t = new Thread(workInter2);
//		t.start();
		
//		Stuff stu  = new Stuff();
//		Runnable run = stu::myThread;
//		
//		Thread t1 = new Thread(run);
//		t1.start();
		Provider  provider = ()->{
			return new Student(1,"balaji");
		};
		Student student = provider.getStudent();
		student.display();
//		System.out.println(student.toString());
	
	}

}
