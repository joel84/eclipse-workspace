
public class Polymorphism {

	/*
	 * In this final section of the course,
we're gonna talk about the central concept in Java called polymorphism,
which is, instead of writing something over and over again, and
repeating yourself, Java provides several ways in which you can avoid that.
Most importantly it allows methods and
objects to exist in several different forms.
This might seem a little bit confusing at first and
what we're going to do is slit it up into the two main components.
One is that of overloading and the other one is that of overriding.
And you see units that correspond to both of them.
So today's unit is just going to be on overloading.
Where we're going to focus on multiple methods that have the same name.
So overloading, as I said before, is just one component of polymorphism.
So in polymorphism,
it's basically the condition of existing in several different forms.
So in this case,
we're talking about a method existing in several different forms.
We'll talk about objects existing in different forms much later.
So let's take a look and see why you would want to have multiple methods
that are named exactly the same inside the same class.
So consider the fact that you do a lot of printing to the console in your
Java applications, let's say that you want to write a method such that when
you pass in an argument that is an int, it should be able to print an int.
If you pass in a double, it should be able to print a double.
If you pass in a string, it should be able to print the string, and so on.
Now one way of doing this is to have three functions or three methods rather,
that are named print int, print double, print string.
And this might seem to be okay, but what if you now have an object like a person or
a car or something like that, would you then want to do a print car and
a print person, and so on and so forth?
At this point, you're just running out of names for your method.
So instead of doing something like this,
why not just create one method called print?
Well, that doesn't work in Java,
it might work in certain other programming languages.
But in Java,
Java needs to know the data type of the argument that you're passing in.
So that's not gonna work at all in Java.
So the alternative to those two options is to call all of these methods print but
then the Java figured out which method to use by passing in different data types.
So you're going to write one method called print and
then inside the argument you'll say, int x, for example, and another one,
you write the same method name and have instead of an int, you'll have,
let's say double y, for example.
And Java is gonna be able to figure out which print method to
use depending upon what argument you pass in.
So let's look at this idea in more detail.The rules for overloading a method come down to this definition
of what a signature of a method in Java correspond to.
So in Java, to figure out the signature of the method,
basically just consider the portion after the return type.
	
	public String subString(String s1, int a, int b) {
		
		
	}
	
	/*
	 * So in this example, we have public string, so don't look at that.
Look at subString, the name of the method,
and then all the stuff in the parentheses after it.
So after it you have a string followed by an int, followed by another int.
That corresponds to the signature.
The rule for overloading basically says that there can be only one method for
a given signature.
So if, for example, I tried writing another method and
I called it the same thing, I said public.
And instead of the return type being string, I said int, and
called it subString.
So let's say public int subString here, and then I just have the same return type,
the same data type of the arguments, so String s2 and
then some int followed by another int, that will not work.
Because these two signatures would basically be the same.
So if you have two methods with the same signature, that's not allowed in
the class, two methods with different signatures totally allowed in the class.
	 */
	
	/*
	class Test {
		public static void main (String args[]) {
			myprint(5);
			myprint(5.0);
		}
		static void myprint(int i) {
			System.out.println("int i = " + i);
		}
		static void myprint(double d) {             // same name , different parameters
			System.out.println("double d = " + i);
		}
	}
	
	So, in order to see this in action, let's consider what happens when you try
myPrint with an integer argument and myPrint with a double argument.
So the first line of code, this one over here which has int i = 5, since i happens
to be an integer, when you call myPrint with i as the argument, Java is able to
figure out that you meant to call myPrint the one that takes in an integer argument.
If on the other hand, you declared your variable to be a double, then
Java is able to figure out that you meant to call the other version of myPrint,
the one that takes in double as an argument.
Now let's look and see why you would want to overload a method.

But why overload at all?
Why do we even care about overloading?
So there are a couple of use cases for that.
The main idea, though, is that you want to use the same name for
methods that do basically the same thing.
So if I want to be printing different types of input,
then maybe all of my methods should be called print.
I shouldn't need to remember that if I want to print an integer then the method
is called print int.
If I want to print some details about a car,
then it needs to be print car or maybe it's called print automobile.
How am I supposed to figure all that out?
In short of doing all of that,
why not just have to remember that the method is called print and
overload the method well enough so that regardless of what you pass into it.
Java is able to figure out that you meant to call the print for the car or
you meant to call print for an int, right?
So, for example, over here, you can also do things like have
the same method name but use certain default values.

   int increment (int amount){
         count = count + amount;
         return count
         }
    int increment(){
         return increment(1);
         }     



So, here we have two methods, both of them called increment.
The first one allows for an increment amount to be passed in.
So, the amount being passed in means that I have one single parameter,
one single argument, which is an integer.
Whereas, the default that I want to do is an increment of 1.
So you will notice also over here, how one method is calling the other method.
And we're basically not repeating ourselves,
which we'll see in the next slides.
So do not repeat yourself is a core programming principle.
If you see a method that's already doing some work for you, and
you're doing something that's slightly different from that,
then why not just go and re-use code?
You can also use overloading if you want to supply additional information.

      void printResults(){
          System.out.println("total = "+ total + ", average = " + average);
          }
       
       void printResult(String message){   
          System.out.println(message + ";");
          printResults
          }

So, for example, over here, we see two methods, one of which is printing some
results, and the other one is printing some results with an additional message.
So, the first one obviously does not take in any arguments.
It's just saying that the total is something and
the average is something else.
But, over here, when you have a message,
then this is the extra argument that's showing up which makes it such that
both those methods can actually peacefully co-exist within the same class.
One of them is adding a message before printing the results,
the other one is just printing the results as is.
All of this comes down to this principle that I just talked about before,
which is you don't want to repeat yourself,
if you've written something that's working, that's good.
If you have another method that is basically doing
round about the same thing, then why not try and do some kind of overloading.

     void debug() {
         System.out.println("first= " + first);
         for(int i = first; i<=last;i++){
              System.out.println(dictionary[i] + " ");
              }
          System.out.println()
          }
          
      void debug (String s){
          System.out.println("At checkpoint" + s + ":");
          debug();
          }        




So, for example, over here, you have two methods that are both called void debug,
one of them takes in a String, one of them doesn't take in a String.
And you'll notice how the second method calls the first one, right?
Literally, the second line of this method is making a call
to the first one over here.
Which is basically just saying that I would like
to use the debugging method that I have previously written.
The bad way of doing this would literally be to copy paste.
So if I took this block and
then copy pasted this entire block over here by moving it down there,
that would be bad because you're essentially repeating yourself,
why copy paste when you can do this nice overloading thing.
Overloading does come with a few things to be careful about though.
So, for example, you want to know what you can and
can't do with, there are types that are similar-ish.
And what I mean by that is really if you think about the number five,
now as an integer, you would think of it as just the number five.
Whereas you could also think of that number five as 5.0, and
then it becomes a double.
So an int can be a double, but a double like 5.2 isn't
an int unless you did something extra to convert it to an int.
	*/
}
