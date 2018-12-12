fun main (args : Array<String>){
	val mutableList: MutableList<Int> = mutableListOf(0) //creates a mutable list. similar to array adapter
	val list : List<Int> = mutableList;						// creates a list to use mutable list
	for (i in 1..10){										//loops 10 times
		val number : Double = Math.random()					//gets a random number
		mutableList.add((number*i).toInt())					//adds to mutable list after multiplying it
	}
}