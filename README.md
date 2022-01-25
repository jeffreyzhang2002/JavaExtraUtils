# Java Extra Utils Library:
Welcome to the Java Extra Utils Library. This library is for the lazy developer who thinks it wayyy to difficult to type out basic Java Library syntax and so will go out of his way to find some random online solution that may or may not fix his problems.

## Features:

**1. Printing:**
> Ever feel that Java'a default print function is unecessarly long and a recipe for 100+ character lines of code that require you to scroll all the way to right? Well no long will you need to sit there and type out the entire `System.out.println()` but instead type `$()` and directly display what you need!

*Yes $ is a legal name for a Java method. Apparently almost all UTF-8 character that are not symbols are allowed.*

**2. Random Math and Physics Constants:**
> Why type Math.PI when you can go search online for a copy pastable `π` and then directly and it into your code? This works with other constants such as e, phi, etc (adding more in the future)

**3. TBD**
> Probably some other random thing I feel like doing. Feel Free to leave suggestions

## Installation:
There are two ways I can think of for you to use this code in your project. 
1. Simply copy the package directly into your project and use it that way. Honestly this is terrible practice but the point of this project is the be quick, easy and painless. Great for small and simple projects
2. Download the released jar file and add it to depencies. IDK why you would decided to go with this route

## Example Code:
**1. Printing to Console**
Traditionally `System.out.println()` or `System.out.print()` are used for writing to the console. I have no idea why this must over 15 characters long when other languages to fine with `print()`,`console.log`,`std::cout`. In this library, I decided to make printing `$()`. This function takes in a list of Object (basically anything you want) and prints it. Also it supports chaning and variable number of argument
```
//This Line import the project into the file
import static ExtraUtils.ExtraUtils.Print.$;

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
    }
}
```
There are also public static fields that can be changed to have this method better suit your needs. 
```
import ExtraUtils.ExtraUtils;
public class MyClass
{
    public static void main(String[] args)
    {
        //default values
        ExtraUtils.Print.delimiter = " ";
        ExtraUtils.Print.output = System.out;
    }
}
```

Lastly if your remember back to the day you just learned java, you might remember `System.out.print(anArray)` return the memory address and so students are forced to instead import the `Arrays` class and do `System.out.println(Arrays.toString(anArray))`. Yeah I think that way to annoying to type so `$()` will handel arrays automatically and print the content.

**Math Constants**
Basically allows you to type certain math constants directly into equations. Honestly this is probably more trouble than it is worth but I think its cool.
```
import static ExtraUtils.ExtraUtils.MathConstants.π;
import static ExtraUtils.ExtraUtils.MathConstants.φ;
// Other constants are also supported

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

In addition to these constants, other greek letters can be set to certain values. These values all have double precision.

```
import static ExtraUtils.ExtraUtils.Greek.Δ;
// Other letters are also supported

public class Main
{
    public static void main(String[] args)
    {
        Δ = 2;
        
        double a = Δ;
    }
}
```
## License:
MIT license. Do what ever you want with this terrible code but if you like like what you see please star the repository


## Disclamer:
This project uses a lot of wierd Java features that I am not 100% sure works on every computer. This was written with Intellj Community Edition. Also this was just a random project I thought of cause so the code is not optimized at all.
