
fun main(args: Array<String>){				//Arrays are declared as such. The main method is expected to look like this
	println(forIfDemonstration(3, 4))
	println(whileWhenArrayDemo(arrayOf(3, 2, 1 ,4, 5)))	
	scopeDemo()
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

fun whileWhenArrayDemo(array :Array<Int>) :Int {			//passes an Integer Array as a parameter
	var sum: Int = 0									
	var z = 0										
	while (z<array.size){									
		when (z%2){
			0 -> sum += array.get(z)						//iterates through array and adds it to sum if index is even
			1 -> sum--										//if not then decrements sum
		}
		z++													//z increments every iteration
	}
	
	return sum;											
}

// scope
fun scopeDemo (){
	run{												//run creates a scope and runs the code in order
	val x = "Hello"
	val y = "World"

	run {
		var x = "Goodbye"								//x changes to goodbye in this run scope
		println("$x $y")								//prints "Goodbye World"
    	}
	}
}

