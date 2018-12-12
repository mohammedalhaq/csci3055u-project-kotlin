# Kotlin Analysis

Mohammed Alhaq  <b> 100619303 </b> <br>
<b>mohammed.alhaq</b>@uoit.net

## About the language

> _Describe the Language_

Kotlin is a relatively new open source programming language that runs on the Java Virtual Machine. It's mainly a functional programming language with major influence from Java, and Scala. The popularity of the language is increasing rapidly as programmers are beginning to prefer its concise nature.

The language is mostly used for Android Application Development and Web Development.

Popular Android apps which swapped to Kotlin from Java are: Pinterest, Evernote, and Uber

> _History_

Kotlin was created by JetBrains and over 100 contributers on Github. It's considered a more modern language and a potential successor to Java. Similar to how Java was named, Kotlin is also named after an island. The first version to be considered stable was in 2016, five years after it was unveiled.

Google endorsed Kotlin and decided to support the language for Android Development at Google I/O 2017.

Kotlin is now natively supported in Android Studio as of version 3.0

> _Some interesting features_


 - Kotlin is intereoperable with Java. Meaning it is capable of compiling with pre-existing Java code and can use Java frameworks.
 - Kotlin can easily compile to Javscript if required.
 - Kotlin is capable of inferring types if they are not explicitly given,

_Example: x would be given type Int_
```
var x = 10  
```


## About the syntax

> _Some code snippet of the language_

_Hello World_
```
fun main(args: Array<String>){
	println("Hello World")
}
```


_Basic Sum Function_
```
fun main(args: Array<String>) :Int? {
    var x: Int = 10
    var y: Int = 20
    return x + y
}
```
Kotlin supports semi-colons to end lines, but it is optional and typically not used

## About the tools

> _Describe the compiler or interpreter needed_.

Kotlin typically runs off the Java Virtual Machine (JVM) interpreter, but it can also run off the JavaScript interpreter. The code is translated during the execution.

The JVM allows Kotlin to have the same garbage collection as Java.

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

- Kotlin supports the tuple datatypes Pair and Triple.
  - They are both valid return types for functions and are very useful when one or more value needs to be returned.

They are written as the following:
```
Pair("index1", "index2")
Triple("index1","index2","index3")
```
An example of this is included in the basic-syntax folder

- Kotlin also supports Collections in stdlib. ```map```, ```filter```, ```reduce``` are functions defined on Iterable objects similar to Clojure's standard library.

An example of filter:
```
movies.filter { it.rating > 8.5 }
    .sortedBy { it.rating}
    .take(5)
```
Assuming Movie is object. Movies takes all the movies and uses the ```filter``` function to take the top five highest rated movies.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

<a href=https://github.com/pawegio/KAndroid>KAndroid by pawegio</a> <br>

KAndroid is an open source Kotlin library to speed up the Android development process. The author describes it as a useful extension to focus on productivity. KAndroid allows already concise Kotlin code to become shorter, without increasing its visual complexity.

_Referenced from KAndroid Github Linked Above_

<b>Standard Kotlin</b>

```
Intent(this, javaClass<SampleActivity>())
startActivity(Intent(this, javaClass<SampleActivity>()))
startActivityForResult(Intent(this, javaClass<SampleActivity>()), REQUEST_CODE)
```

<b>Kotlin using KAndroid</b>
```
val intent = IntentFor<SampleActivity>(this)
startActivity<SampleActivity>()
startActivityForResult<SampleActivity>(REQUEST_CODE)
```
The library reduces the redundancy in Android development <br> <br>

Another example:

<b>Standard Kotlin</b>
```
seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
    override fun onStopTrackingTouch(seekBar: SeekBar) {

    }
    override fun onStartTrackingTouch(seekBar: SeekBar?) {

    }
    override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
        mediaPlayer.seekTo(progress)
    }

})
```

<b>Kotlin using KAndroid</b>
```
seekBar.onProgressChanged { progress, fromUser ->
    if (fromUser) mediaPlayer.seekTo(progress)
}
```
Both programs monitor a seekbar and make the indicator move as it changes. The KAndroid extension reduces the code by a noticable amount.  

# Analysis of the language
> _The style of programming supported by the language: functional vs procedural programming_

Kotlin is interesting in this regard. Overall, it is considered a functional programming lanugage, but it is flexible enough to handle object oriented programming and procedural programming.

Kotlin has full support for Higher-Order functions and Lambda functions

_See basic syntax folder for examples_



> The ability to perform meta-programming such as macros

Kotlin uses the same meta-programming abilities as Java. It is not full metaprogramming, but Kotlin makes it easier.

<a href=https://rosettacode.org/wiki/Metaprogramming#Kotlin>Fragment Referenced From Rosettacode:</a>
```
infix fun Double.pwr(exp: Double) = Math.pow(this, exp)

fun main(args: Array<String>) {
   val d = 2.0 pwr 8.0
   println(d)
}
```
This function returns 256. Infix functions can be called without using brackets or periods.


> Symbol resolution and its support for closure

Kotlin has similar symbol resolution and closure to Java, but noticeably inspired by functional programming.

```
val constValue = 20 				//Variable declared as val cannot change
var variableValue = 3 				//Variables declared as var can change
```

Kotlin has full support of closure. Lambda expressions can be used to access and change variables in the scope.
See ```fun scopeDemo()``` below for scope details.

> Scoping rules supported by the language: lexical vs dynamic scoping

Kotlin has support for both lexical and dynamic scoping.

The relevant scoping functions are: ```let```,``` run```,``` with```,``` also ``` and``` apply```.
- These are also functional programming functions

```
fun scopeDemo (){
	run {
		val x = "Hello"
		val y = "World"

		run {
			val x = "Goodbye"
			println("$x $y")
    	}
	}
}
```
In this demonstration, ```x``` in the first ```run```'s scope would be overwritten and would change from ```"Hello"``` to ```"Goodbye"``` causing the program to print ```"Goodbye World"```.


> Functional programming constructs either as part of the language or supported by the standard library of the runtime.

Kotlin is a functional programming language.  

An important construct is of Kotlin is that it can pass functions as parameters and can return functions, these functions are considered <b>High Order</b>

```
class Class {
//The declaration allows a function to be passed as a parameter
    fun highOrderFunction(function: (String) -> Unit) {
 		    println("Body of High Order Functions")  

    }
}

var demoFunction: (String) -> Unit = { println("DemoFunction") }
highOrderFunction(demoFunction)
```
The function ```highOrderFunction``` passes the function ```demoFunction```.

> Its type system: static vs dynamic types

Kotlin is statically typed. This allows the language to have overall better compile times than dynamic typed languages.

In a statically typed language, the languages goes through the code ensuring all the variable datatypes make sense before executing. Fortunately, Kotlin is capable of inferring the types, as stated earlier.



> Strengths and weaknesses of the language

Strengths:

- The biggest advantage of Kotlin is how concise it is without making code difficult to read
- It has innate interoperability with Java. Experienced Java developers will be able to pickup this language with ease. Existing Java libraries function in Kotlin exactly how it is expected to.
- Kotlin can infer variable types, as demonstrated above
- Kotlin uses the ```?``` as a safe call operator to prevent NullPointerExceptions

Weaknesses:
- Kotlin does not support namespaces. Every function is at the global level
- Kotlin does not support static attributes
