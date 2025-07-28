package a;

public class Worker {

public int number;

public String name;
public String surname;
public int experiance;
public double salary;



public Worker() {
	
	
}

public Worker(int number, String name, String surname, int experiance, double salary) {
	
	this.number = number;
	this.name = name;
	this.surname = surname;
	this.experiance = experiance;
	this.salary = salary;
	
}


public void printInfoWorkers() {
	System.out.println("=====Worker Info====");
	System.out.println("Number    :"+ number);
	System.out.println("Name      :"+ name);
	System.out.println("Surname   :"+ surname);
	System.out.println("Experiance:"+ experiance);

}

public void raise( int valueRaise) {
	
	System.out.println("Your salary raised "+ valueRaise +" TL" );
	System.out.println("Your new salary :"+ (salary+valueRaise));

	
}

public void formatting (String op, String who) {
	
	System.out.println(who+" is formmating "+ op+ " operating system right now " );

}



}
