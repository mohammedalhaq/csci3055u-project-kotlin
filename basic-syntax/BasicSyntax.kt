
fun main(args: Array<String>){				//Arrays are declared as such. The main method is expected to look like this
	println(forIfDemonstration(3, 4))		
}

/* For and If STATEMENTS */ 
fun forIfDemonstration(x: Int, y: Int) :Int {			//functions are declared as "fun" returns an integer
	var sum: Int = 0									//datatype comes after the variable name and its colon. variables declared var can be modified
	val z = 5											//kotlin can infer variable types. variables declared val are immutable
	for (i in 1..z){									//this is a basic for loop ranging from implicit i=0 to z, 5
		if (z % 2 == 0){								//simple if statement to check z is even
			sum += x + y					
		} else {
			sum--
		} 												//format of if statements can be very similar to Java
	}
	return sum;											//semi-colons are optional
}