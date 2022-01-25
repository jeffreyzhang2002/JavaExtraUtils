# Java Extra Utils Library:
Welcome to the Java Extra Utils Library. This is simple library that adds some basic quality of life changes to Java.

## Features:

**1. Printing:**
> This library simplifies printing within Java. `System.out.println()` is replaced with `$()` and `System.out.print()` is replaced with `_$()`. Moreover these methods allow for artibraty number of inputs and can be used to print arrays!

*Apparently $ is a legal method name for a Java method. Java uses UTF-8 character encoding so there are actually a lot of symbols that can be used for naming*

**2. Math and Physics Constants:**
> Why type Math.PI when you can directly input `π` into your code? This is great for shorting equations and making them concise

**3. Assignable Symbols**
> Assign values to symbols such as `Φ`, `φ`, etc directly in your code! This isn't the most useful but I though it was cool that these are valid names for Java variables

**4. TBD**
> Probably some other random thing I feel like doing. Feel Free to leave suggestions

## Installation:
There are two ways to use this code in your project. I recommend the first way because it is easier. 
1. Simply copy the package directly into your project and use it that way. Honestly this is terrible practice but the point of this project is the be quick, easy and painless. Great for small and simple projects
2. Download the released jar file and add it to dependencies.

## Example Code:
**1. Printing to Console**
Traditionally `System.out.println()` or `System.out.print()` are used for writing to the console. I have no idea why these simple commands must be over 15 characters long when other languages do fine with `print()`,`console.log`,`std::cout`. In this library, I decided to make printing really easy. Instead of `System.out.println()` use `$()` and instead of `System.out.print()` use `_$()` . These functions takes in a list of Objects (basically anything you want) and prints it out on your screen formatted nicely.
```
//This Line import the project into the file
import static ExtraUtils.Printer.Print.*;

public class MyClass{
    public static void main(String[] args) {
        int a = 1, c = 2;
        String b = "Richard";
        
        $("cat"); //prints cat
        $(b); // prints "Richard"
        $(a); //prints the value of a
        
        //$() also works with multiple arguments! A delimeter is added inbetween
        
        $("Hello", "World", 5);
        $("The value of a + c is", 3);
        
        //$() is also chainable!
        
        $("Hello").$("World").$("Chain").$("Commands");
        /*
        * Outputs:
        * Hello
        * World  
        * Chain
        * Commands  
        */
        
        _$("Hello")._$("World")._$("Chain")._$("Commands");
        /*
        * Outputs:
        * Hello World Chain Commands  
        */
        
        int[] array = {1, 2, 3, 4, 5, 6};
        //primitive arrays must be in there own function!
        
        $("My Array", array); //throws ClassCastException instead do this
        _$("My Array").$(array); //Seprating the primitive array from the String will fix this issue
        
        //Also String templates are allowed!
        $("Template string with arguments {} and {} and {}!", 1, 2, 3);
        _$("1 + 1 = {}", (1 + 1));
    }
}
```
In the Print class, There are public static fields that can be changed to have the program better suit your needs. For example, The `output` and `delimeter` fields. The `output` field is a `PrintStream` that is used to determine where your output will be by default this will be set to `System.out`. The `delimeter` field is a String that represents what goes between each of the arguments passed in. 
```
import ExtraUtils.Printer.*;
public class MyClass
{
    public static void main(String[] args)
    {
        //default values that you can change
        ExtraUtils.Print.delimiter = " ";
        ExtraUtils.Print.output = System.out;
    }
}
```
**Math Constants**
Basically this allows you to type certain math constants directly into equations. Honestly this is probably more trouble than it is worth but I think its cool.
```
import static ExtraUtils.MathConstants.*;

public class Main
{
    public static void main(String[] args)
    {
        double radius = 2;

        double area = π * radius * radius;
        double circumfrence = 2 * π * radius;
        
        double phi = φ;
    }
}
```
In addition to these constants, other greek letters can be set to certain values. 

## License:
MIT license. Do what ever you want with this code but if you like like what you see please star the repository.

## Disclamer:
This project uses a lot of wierd Java features that I am not 100% sure works on every computer. This was written with IntellJ Community Edition. Also this was just a random project I thought of so the code is not optimized at all. Use at your own caution.
