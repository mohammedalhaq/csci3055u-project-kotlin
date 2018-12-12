//classes can be made just like java
class Cat (val name : String){
	fun talk(){
    	println("MEOW says ${name}");
    }
}

fun main(args: Array<String>){
	Cat("the cat").talk()
}