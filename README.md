# Kotlin Analysis

Mohammed Alhaq  <b> 100619303 </b> <br>
<b>mohammed.alhaq</b>@uoit.net

## About the language

> _Describe the Language_

Kotlin is a relatively new open source programming language that runs on the Java Virtual Machine. It's mainly a functional programming language with major influence from Java, and Scala. The popularity of the language is increasing rapidly as programmers are beginning to prefer its concise nature.

The language is mostly used for Android Application Development and Web Development
> _History_

Kotlin was created by JetBrains and over 100 contributers on Github. It's considered a more modern language and a potential successor to Java. Similar to how Java was named, Kotlin is also named after an island. The first version to be considered stable was in 2016, five years after it was unveiled.
<br> Google endorsed Kotlin and decided to support the language for Android Development at Google I/O 2017.
<br> Kotlin is now natively supported in Android Studio as of version 3.0

> _Some interesting features_


 - Kotlin is intereoperable with Java. Meaning it is capable of compiling with pre-existing Java code and can use Java frameworks.
 - Kotlin is capable of inferring types if they are not explicitly given

_Example: x would be given type Int_
```
var x = 10  
```


## About the syntax

> _Some code snippet of the language_

_Basic Sum Function_
```
fun main(args: Array<String>) :Int? {
    var x: Int = 10
    var y: Int = 20
    return x + y;
}
```
Kotlin supports semi-colons, but it is optional and typically not used

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

- Kotlin also supports Collections in stdlib. Map, Filter, Reduce are functions defined on Iterable objects similar to Clojure's standard library.

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

Kotlin is interesting in this regard. Overall, it is considered a mix of functional programming and object oriented programming, but it can also handle procedural programming.


```
class Cat (val name : String){
	fun talk(){
    	println("MEOW says ${name});
    }
}

fun main(args: Array<String>){
	Cat("the cat").talk()
}
```

> The ability to perform meta-programming such as macros

Temp

> Symbol resolution and its support for closure

Temp

> Scoping rules supported by the language: lexical vs dynamic scoping

Temp

> Functional programming constructs either as part of the language or supported by the standard library of the runtime.

Temp

> Its type system: static vs dynamic types

Kotlin is statically typed. This allows the language to have overall better compile times than dynamic typed languages.

In a statically typed language, the programmer is required to state each variable type. Fortunately, Kotlin is capable of inferring the types, as stated earlier.
```
fun test() :Int? {
    var x: Int = 10
    var y: Int = 20
	var z = 5
	return x + y + z;
}
```
Kotlin would interpret z as an integer and the code will return 35.

<br>

> Strengths and weaknesses of the language

Strengths:

- The biggest advantage of Kotlin is how concise it is without making code difficult to read
- It has innate interoperability with Java. Experienced Java developers will be able to pickup this language with ease. Existing Java libraries function in Kotlin exactly how it is expected to.
- Kotlin can infer variable types, as demonstrated above
- Kotlin uses the ```?``` as a safe call operator to prevent NullPointerExceptions

Weaknesses:
- Kotlin does not support namespaces. Every function is at the global level
- Kotlin does not support static attributes
