import java.io.*;
import java.util.Scanner;

interface Thepatient2 {
    String Bmicategory (double bmi);
	public String insurancecategory (double bmi, String name );
	
}





public class bmi2 implements Thepatient2 {
 
	


	


	// output BMI.txt file 
	
private static final String OUTPUT_FILE = "BMI.txt";
public static void main(String[] args) {
 // functions
	
	
	
 

// variables 
 
Scanner scanner = new Scanner(System.in);

String name = "";
 
double weight = 0; 
 
int birthday  = 0 ; 
 
double height = 0;
 
double Bodymassindex;
 
String answer;

boolean keep_going = true;

boolean keep_open = true;


//input data



 
 



while (keep_open) {
	
while(keep_going) {
try {
	System.out.println("please enter your name: ");
	name = scanner.next();
	System.out.println("please enter your weight in kilograms: ");
	weight = scanner.nextDouble();
	System.out.println("please enter your birthday mmddyy: ");
	birthday = scanner.nextInt();
	System.out.println("please enter your height in meters : ");
	 height = scanner.nextDouble();
	 

}	catch (NumberFormatException e) {
	System.out.println("height cannot be zero");
	} catch (ArithmeticException e) {
	System.out.println(e);
	} catch (NullPointerException e) {
	System.out.println(e);
	}catch ( Exception e) {
		System.out.println(e);
	} finally {
	System.out.println("welcome to the body mass calculator");
	}

 
// Bmi conversion
 
 
Bodymassindex = weight/(height * height );
 
 
System.out.println("body mass = " + Bodymassindex); 



 
 
bmi2 bmi = new bmi2();
String x = bmi.insurancecategory(Bodymassindex,name);
String y = bmi.Bmicategory(Bodymassindex);






try {

BufferedWriter writer= new BufferedWriter(new FileWriter(OUTPUT_FILE, keep_open));
writer.write(String.format("Name: %s", name) + ("\r\n"));
writer.write(("weight:")+ Double.toString( weight)+ ("\r\n"));
writer.write(("Birthday:")+ Integer.toString(birthday)+ ("\r\n"));
writer.write(("height:")+ Double.toString( height)+ ("\r\n"));
writer.write(("Bodymassindex:")+ Double.toString(Bodymassindex)+ ("\r\n"));
writer.write(String.format("BMI category: %s", y) + ("\r\n") );
writer.write(String.format("Insurance payment: %s", x ) + ("\r\n") + ("\r\n"));




writer.flush();
writer.close();
System.out.println("File :" + OUTPUT_FILE + " updated successfully.");
} catch (Exception e) {
System.out.println("Unable to write to file: " + OUTPUT_FILE + e);
} 

System.out.println("do you want to quit,press q if you do press any other key to continue ");
answer = scanner.next();
  if (answer.equals("q")) {
	keep_going = false;
	keep_open = false;
	} else {
	System.out.println("enjoy another round");
	 continue;
	}

}
}
}
@Override
public String insurancecategory(double Bodymassindex, String name ) {
	
	
	String Insurance_payment = "";

	
	if (Bodymassindex < 18.5 ) {
		 
		
		

		Insurance_payment = "low";
		 
		} else if (Bodymassindex > 18.5 && Bodymassindex < 24.9) {
		 
		
		Insurance_payment = "low";
		}else if (Bodymassindex > 25 && Bodymassindex < 29.9) {
		 
		
		Insurance_payment = "high";
		} else {
		 
		
		Insurance_payment = "highest";
		 
		}

	return Insurance_payment;
}
@Override
public  String Bmicategory(double Bodymassindex) {
	 String bmicat = "";
if (Bodymassindex < 18.5 ) {
		
		
		

		bmicat = "underweight";
		 
		} else if (Bodymassindex > 18.5 && Bodymassindex < 24.9) {
		 
		
		bmicat = "low";
		}else if (Bodymassindex > 25 && Bodymassindex < 29.9) {
		 
		
		bmicat = "high";
		} else {
		 
		
		bmicat= "highest";
		 
		}
	
	return bmicat;
}


}
