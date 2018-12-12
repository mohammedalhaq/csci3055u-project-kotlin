fun main (args : Array<String>){
	
	println(pairDemo(Pair("Toronto", "Canada")))
	println(tripleDemo(Triple("Toronto", "Ontario", "Canada")))
}


//gets a city and country pair from the user and reorders it to country city
fun pairDemo(place: Pair<String, String>) : Pair<String, String> {
	var cityToMove = place.component1()					//gets the first component of pair
	var countryToMove = place.component2()				//gets second component of pair
	
	val reOrderedPlace = Pair(countryToMove, cityToMove)
	return reOrderedPlace		
}

//same thing but triple not pair
fun tripleDemo(place: Triple<String, String, String>) :Triple<String, String, String> {
	var cityToMove = place.component1()					
	var provinceStateMove = place.component2()
	var countryToMove = place.component3()				
	
	return Triple(countryToMove, provinceStateMove, cityToMove)
}