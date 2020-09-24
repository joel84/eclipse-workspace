package Testing;

public class Stacktraces {

	/* Let's take a look at what a stacktrace is.
So a stacktrace is basically just just a sequence of method calls.
So we have on over here, who says which says exception and blah, blah,
blah, ArrayIndexOutOfBoundsException.
And then you'll notice that the next line says at something, at something. 
So for example, if it's saying ArrayIndexOutOfBounds,
there's usually a number right alongside it.
That usually gives you a little bit more information as we'll see in a little
bit here. And the very first thing we see is java.lang.ArrayIndexOutofBoundsException,
and you'll notice this number 4 over here.
So what is this number 4 talking about?
Well, It is basically saying that you're trying to index an array and
you're trying to index the fourth position in the array, but for
some reason that fourth position doesn't exist.
Maybe your array only had three elements init, and
you're trying to find the fourth one.
Also remember that your array is zero index, so even if you had four things it
would be zero, one, two and three that would be your indexes.
And 4 doesn't really exist which lies trying an exception, so
useful extra information being provided by a stock price.
There are a few other exceptions that are really common and
really important to know about.
One of them is a NullPointerException.
This is by far the most common one that you're likely to see
when you're dealing with classes and objects.
As you know, null is the initial value that a object is initialized to.
So if I had a class called person, if I just said Person p1 semicolon.
Then p1, add that point has the value null.
So if I actually try to do something like p1.getName let's say, right?
Let's say that there's some method called getName, then at that point since p1 is
null and is essentially not yet been created you can get the name of
something that hasn't been created yet, so it throw this null pointer exception.
If you see that when you're looking through a stack trace,
then go to the line of code, so that is throwing this null point or exception.
And look at what variable over there is likely to have been on.
Once you recognize that variable, then call the constructor for that variable in
order for it to be some non null value on which you can actually call this method.*/
	
	
	
}
