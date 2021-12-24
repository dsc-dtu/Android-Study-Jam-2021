package basics                  // contains one or more Kotlin files, linked by package header
import java.util.Scanner           // To demonstrate Scanner Class (not mandatory to use)

/*
Kotlin
Features
	- statically typed // datatype is configured in compile time and not in run time
	- inter-convertible with java
	- safe and concise to use
    
Variables 
	- var : used for non constants(can alter)
    - val : used for constant(cannot alter)
    
    - Inferred typing(Used in Kotlin)
    	- datatype not mandatory to mention
        - e.g. var a = 0
        - e.g. var b : Int = 1
        - e.g. var name : String = "Haresh"
    - Manifest typing(Not used in Kotlin)
    	- means explicitly defining the datatype
        - e.g. int a = 0 
        
Printing variable
	- print() : without line break
    - println() : with line break
    - println("<variable>")
    - println("$<variable>" + "$<variable1>") : concatenation
    - println("$<variable> $<variable1>") : no need of concatenation
    
Taking input
	- Kotlin
  		- var name = readLine()!! 
        	- readLine() : takes input and stores in name
            - !! : ensures not-null 
            - if "!!" is missed "name" will be initially null
    
     - Another way
     import java.util.*
    	- var read = Scanner(System.`in`)
        	- creates instance of Scanner method
        - var age = read.nextInt()
        	- nextInt() : takes input as Int
            - nextFloat() : takes input as Float
            - nextDouble() : takes input as Float
            - nextLine() : takes input as String
If else
	- Kotlin returns value in if else
    	- if(condition){
        		expression is returned
        	}
            else{
            	expression is returned
            }
        - hence it can be used as ternary operator
        	- var olderAge = if(age1>age2) age1 else age2
            
when()  viz. (Switch case)
	- when(num){
    	1 -> println("one")
        in 2..10 -> println("between 2 and 10")
        in 11..20 -> println("between 11 and 20")
        else ->{
        	println("not in range")
        }
        
    	- "in 2..10" is inclusive range 
        - use exactly 2 dots
        
Loops (for)
	- for (<variable> in <List>){
    	println(<variable>)
    	}
    - for((<variable1, variable2>) in <List>){
    		println($<variable1> $<variable2>)
    	}
Array
	- var friends = arrayOf<String>("Himesh", "Amandeep")
    - pick element
    	- friends[0], friends[1]
    - traverse
    	- for (name in friends){
        	println("${name}")
        	}
        - for((index, name) in friends.withIndex()){
        	println("$index $name")
        	}

Functions 
	- fun <nameOfFunction>(args: ){
    		<expression>
    	}
    - e.g. 
    	fun sum(a: Int, b:Int){
        	var s : Int = a+b
            println(s)
        }
   	- e.g. 
    	fun returnSum(a: Int, b:Int) : Int{
        	return a+b
        }
        
    - This type of argument writing is inspired from Pascal language
    - <name of argument> : <data type>
 */

// Entry point of Kotlin program
fun main() {
    print("Hello, ")
    println("world!!!") // gives line break
    println("Hi Haresh")

    // initializing variables
    val firstName = "Haresh"
    val lastName = "Nayak"
    val age = 20

    // printing variables with string
    println("Name : $firstName $lastName \nAge : $age")

    // Taking input from user using java.util.Scanner
    val read = Scanner(System.`in`)
    print("Enter Session name")
    val sessionName = read.nextLine()
    println("session name entered : $sessionName")

    // Taking input with Scanner class
    print("Which language you love : ")
    val language = readLine()
    println(language)

    // Switch case (Keyword used in Kotlin - when)
    when(age){
        1 -> println("age is one")

        // To give a range
        in 2..10 -> println("age between 2 and 10")
        in 11..20 -> println("age between 11 and 20")

        // Set a default value
        else ->{
            println("age not in range")
        }
    }

    // Arrays
    val appsInKotlin = arrayOf("Google", "Zomato", "Netflix", "Slack")
    val numbs = arrayOf(13,21,67,19)

    // Loops
    // For loop
    for (num in numbs){
        println("$num")
    }

    // While loop
    val i  = 0
    while (i < appsInKotlin.size ){
        appsInKotlin[i]
    }

    println()
    for((index, name) in appsInKotlin.withIndex()){
        println("${index+1} $name")
    }
}
