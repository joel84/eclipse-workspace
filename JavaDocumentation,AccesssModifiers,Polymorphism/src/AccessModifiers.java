
public class AccessModifiers {

	/*
	 * So far we've been using this keyword static all over the place,
and I haven't yet told you what it really means.
It's always been public static void.
But hey, don't question me about what static means.
This is the part where you actually get to know what static means and
how to use it correctly within your class.
So there are actually two slightly different things to learn about.
The difference is very, very slight.
It kind of depends on the usage, in some sense.
So there's static instance variables, and then there's static methods.
And static methods are a little bit more commonly used than static instance
variables, even though, the meaning of the word static is the same in both contexts.
So to understand what static means,
just think about what an instance variable truly means.
An instance variable means, something that is a property of an instance of the class.
So for example,
when you say that name is an instance variable inside the person class.
What you're saying is that person one is going to have, potentially,
a different name from person two, as one would normally think of it.
Whereas with a static variable,
what you're saying is that this belongs to the class as a whole.
So think of it almost as some kind of shared value or shared resource.
So if you want all instances to have the same understanding of
a variable or a method, then you want to declare those as static.
So let's take an example of something that you've seen.
So, for example, Math.sqrt, so Math.sqrt right here.
This is a method that computes the square root of a number.
You don't need to create an instance of mathematics to know how
to know how to compute a square root of a number.
It's the same method being used,
regardless of what instance you even try to create.
Therefore, Math.sqrt is a static method.
To call a static method, you just use the class name.
So you say classname., and this could be an instance variable as well.
You could also say classname.method.
So Math.sqrt, math is a class, you're calling the static method,
called sqrt, on it, you just say Math.sqrt.
The one static method that all your classes have had so far is main.
Think of it this way, there needs to be an entry point for your program to run.
In order to get your program to run, you can't have the first line be,
let's create an instance of the class that is running this program.
It's kind of a chicken and egg problem.
So you have to have one static method, let's call that main.
Let's make that the default entry point of any program.
When you hit Run,
the first line of code that gets run is the line that's there in main.
Therefore, main is public static void main.
How do you use a static method?
Well, as I said, you'd use the classname.methodname.
You don't need to create any instance of the class.
So for example, when you say system.out.printline,
system is a static class.
It's basically saying that you can use static methods from it,
and you don't ever actually create an instance of system.
It's just a bunch of static methods, bunch of static instance variables.
And then you can use that without actually doing anything like system S equals
new system, and so on.
Another example of static methods, so
consider that you are trying to represent a rational number, a fraction.
Now, remember how fractions like 2/4 are basically the same thing as 1/2.
And if you remember how to do the reduction to these lowest terms, right, so
this is just something called lowest terms.
In order to do that,
what you'd actually have to do is compute what's called the greatest common divisor.
If you don't remember how to that's computed,
that part's kind of not that important.
What's important to understand is that regardless of my rational number,
the way in which you compute the greatest common divisor between two numbers,
it's a mathematical process.
It's just a common helper function.
You don't need an instance of a rational number before you can compare and
figure out greatest common divisor between two other numbers.
So that method is a static method.
So over here, notice that the GCD method is static,
whereas the method where I'm adding two rational numbers is not static.
To add two rational numbers, or rather,
to add a rational number to the current instance of the rational number,
I need to know what my current instance is and then add stuff to it.
So if it's a common method, something that can live at a class level, make it static.
If it's something that requires knowledge of the current instance of the class,
then you'd have to make it non-static.
As far as static instance variables go, the main use case you see for
them is when you have trying to define a constant.
So over here, we're doing static final MAXSCORE = 100.
Static means all instances will share this.
So regardless of what I define as an instance of this class,
if I do .MAXSCORE, the value will be 100.
The other key word that you see over here is final.
So final just means that you're saying that this value is not going to change.
I want my maximum score to be 100.
I don't want anyone to be able to modify it, decrement it,
increment it, do anything like that.
So declare it as static.
So everyone shares a value and final so that no one can change the value.
So that's probably the most common use case for a static instance variable.
The other place where you see it is when you're trying
to keep track of the number of instances of a certain class.
This is extremely useful if, let's say,
you want to do some kind of unique identifier for each instance variable.
You keep track of the number of instances you have so far.
When you create a new instance,
you add one to the total number of previous instances you had so
that you'd give this new instance a completely different number.
This is a little bit complicated to explain via slides, so
we'll actually do a live coding demo, and
then you can see how that can be used for creating bank account numbers.
If you remember our bank account examples so far,
all we've done is create instances where you can deposit and you can withdraw.
But in a true bank, you'll actually have a collection of bank accounts.
Make sure that each one of them has a unique number so
that you can identify a bank account by the number.
So we'll do that via a live coding demo.
So to recap, we've talked about the keyword static and
how static means it belongs to the class or it exists at the class level.
You don't need any information about the individual instances of the class to
compute values.
Static methods, a little bit more common than static instance variables.
Static method is usually a helper method,
a static instance variable is usually a constant.
And the one case where you see static instance variables being used outside of
the constant static final type of thing is where
you're trying to find the number of instance of objects of a certain class.
So for that, just reference the bank account example.

	 */
}
