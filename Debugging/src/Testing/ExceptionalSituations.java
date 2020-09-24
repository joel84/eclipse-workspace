package Testing;

public class ExceptionalSituations {

	/*The first thing I'd like to point out is that there is a big difference between
an error in your program and an exception.
So an error is a bug, so for example, if you wrote some complicated equation out
and it resulted in a divide by zero, well, that's your fault.
You need to go and correct that equation,
you need to make sure that the division by zero doesn't occur and so on so forth.
So for an error, Java's not really gonna help you out,
that's something on your plate.
However, let's consider a situation where you're writing a program and
you're trying to find the most commonly used word in a text file.
Which we'll see how to do later on in this whole course.
But let's say that you ask a user for a file name.
And the user supplies a file name that doesn't actually exist on the disk at all.
Then it's really not your fault.
It's, in some sense, the user's fault, because they misspelt the name or
they were just fooling around.
In either case, you're not actually gonna try and fix the problem for the user.
You just wanna tell the user, hey, I can't find the file.
That's is an example of an exception.
In that situation, you just want to give the message to the user and
stop the program but not crash and burn.
You don't wanna say, what I'm supposed to do, I don't know where this file is and so
on, right?
It's pretty easy to do this in Java, it just means that you need to know
a little bit about this exception handling stuff.
For an error, fix it, for an exception,
handle it via the tools that Java provides for you.
That's sort of the main distinction.
So for dealing with exceptions,
you wanna make sure that they get classified in a reasonable manner.
Java actually has a whole bunch of inbuilt exception classes that you can use.
You can also define your own exception, which we'll see later on in this course
once we've talked a little bit about this concept of inheritance.
For example, if you have a file reading or writing program,
then as I just said, you could have the exception of the file not being there.
It might be the wrong type of file.
It might be a file where you can read from the file, but you can't write to the file.
So there are all these different types of exceptions and
you'd like to handle each one of them as gracefully as possible.
So there are three approaches that can be taken to all this exception handling.
The first approach is, you say, well, it's unlikely that these errors occur,
it's unlikely that all these exceptions occur so you write a lot of code.
And you don't do much of exception handling.
And when your program crashes and burns, you're like, okay, well,
I didn't think about that one, let me add this exception and proceed.
So that's kind of one end of the spectrum where you're
basically being overly optimistic.
The other end of the spectrum obviously is you being overly pessimistic and
writing a line of code.
And saying, well, maybe this error is actually the one that occurs.
So you add some exception handling code, right after that.
And then you write some more exception handling code after that, and so on.
And then what actually happens in those cases is that you could
end up with a piece of code where the actual code,
the stuff where interesting things are happening.
Is just 5 lines and then the exception handling is 25 lines or some
ridiculous monster that you now created where if someone wants to read your code.
They are unable to figure out where the real stuff is actually happening.
Java tries to take the approach of being somewhere in between usually,
where Java insists that certain errors are handled by you, or
certain exceptions rather are the handled by you.
And for the others, it's kind of up to you how you really want to deal with them.
For situations where it's kind of specific to your application, you get to
figure out whether you want to handle them or whether you want to live in a more
optimistic world where you feel like those errors are unlikely to take place.
So the way Java does its exception handling
is via the combination of try-catch statements.

 try {
    do the normal code, ignoring exception
 }
 catch (some exception) {
    handle the exception
 }
 catch (other exception){
    handle the exception
 }   

So to give you sort of an analogy, it's basically you have a bunch of code.
And then, what you do is that you're trying to run this code. So you go through this line by line, and then at some point, maybe you hit
an exceptional situation like the file not found issue that we just talked about.
When that occurs, then what gets thrown,
literally want to think of some garbage or
something being thrown out from this code, saying, I don't know what to do over here.
That gets thrown and
then there's another piece of code where that exception is caught.
So you want to catch this exception, right?
So the idea is do the normal code within the try block.
So right here if stuff works out just fine, then you'll just do the normal code
and then you'll be done with that sort of section of code.
If on the other hand something weird happens, something exceptional happens,
then you want to catch the exception and handle it over here.
So if you're running this piece of code and something exceptional happens,
maybe you go here.
And you can specify the different types of exceptions.
So think of it as each catch block has a specialized catcher in some sense.
Some things can be caught by this block of code.
Some things can be caught by that other block of code.
And you can specify what the type of exception is
inside the parentheses over here.
So a try block can be followed by a bunch of different catch
blocks where you're trying to figure out what exceptions are going to be handled.
Now, the interesting thing and sometimes this can get annoying as well with Java,
is that Java has this notion of a checked exception.
There are certain types of exceptions, the file not found one being one of them where
Java says, I don't trust you, I want you to be able to catch this exception.
So in certain situations, you'll write a line a code, and
if you're doing this in Eclipse it will immediately get underline and
say something like, you're not catching blah, blah, blah exception.
What's happening is that Java's trying to look out for you, and
saying that this might occur, and guess what?
I'm gonna insist that you do something about it.
So in those situations,
just add a catch block to the lines of code that you're dealing with.
What Java actually does behind the scenes when you hit an error is, it
doesn’t just like throw the error back at you, it has its own expectation handling.
So, for example, you’re running through some code and
then you hit an error where, let’s say something like a NullPointerException.
Java has that information about what the error is and
it essentially bubbles this up through its internal classes.
To provide you with that stack trace that we talked about in the previous unit. If you have a checked exception though, then Java says you can't ignore it,
you have to do something about it.
There are a few different things that you can do about it,
which we'll talk about in the next set of slides.
Java has a few inbuilt exceptions that are important to know about because you'll
include them in your catch blocks depending upon what type of
application you have.
So the first one is something called an IOException, input output exception.
For example, you have a file that's not found.
Or you're reading from a file and you've gone all the way at the end of the file
and you're still trying to read from it.
So you get an end of file, or EOFException.
We've already talked about the next exception, the NullPointerException.
Where if you try to use an object that is actually null, then you'll hit an error.
The next one is called a NumberFormatException.
So for example, let's say that you ask the user to input a number and
the user inputs a string for whatever reason.
They misunderstood you or they're just trying to be annoying.
Well, when you try and convert the string to a number, so
let's say something like umbrella or something like that,
that doesn't convert over to a number, you get a NumberFormatException.
And the last one, this is one that you'll hit every now and
then when you're dealing with a large amount of data, is the OutOfMemoryError.
So the program has used all the available memory and
this is a truly exceptional situation.
Like you don't know, going into the program, how much memory it might take.
You just are running it, you run out of memory.
In that situation, you just want to be able to handle it.
What's important to note is that Java has more than these four exceptions.
It has about 200, 250 odd exceptions that are inbuilt.
So usually, if you're dealing with an exceptional situation,
go look at the Java documentation, and try and
figure out the exception that most closely matches yours, and use that.
Because an inbuilt exception is better than trying to write your
own type of wrapper around all kinds of exceptional situations.
So what do you do when you have a catch block or when you're trying out some piece
of code and you're trying to figure out what to do with this exception handling.
Java actually has two choices.
The one that I've been talking about so far is just the catch block.
So you do a try,
and then right after that you have a catch block corresponding to the exception.
The lazier version of this and this is taken every now and
then when you don't know what needs to be done.
But let's say your teammate is the person that supposed to be responsible for
figuring out what needs to be done.
You just pass the buck.
You basically write your method and
say that this method is likely to throw an exception.
And the way you do that is that you add in
a piece of syntax that goes at the end of your method signature.
So you just write public boolean something blah, blah,
blah throws IOException, for example.
And then it's the responsibility of whoever calls this method
to take care of the exception handling.
See examples of that.
So for example, over here we're trying to open a file and
we're saying, open file with a particular string name, and
you will notice this piece here which says throws IOException.
So guess what?
Within that piece of code we're not going to write any catch statements.
The idea is that if something bad happens this IOException is going to be
thrown back to whichever function actually called this,
and that method is supposed to know what to do with the IOException.
The way to use a try statement effectively is to surround the code
that you think might go wrong with a try block.
Then at the end of that try block, you basically say these are the five or
six different types of exceptions that might occur within these lines of code.
For each one of them, put down a catch block.
So for example, if you think that an IOException might occur first up,
put a catch block corresponding to that right after the try.
With the catch block, the way it works is that,
think of it almost as things being caught one after the other.
The first catch block doesn't manage to catch an exception.
Maybe the second one fires, or maybe the third one fires.
So, you want your catch blocks to be ordered in sort of
increasing order of priority in some sense, right?
So, if the first couple of lines are likely to throw an exception of one kind,
then put a catch block, corresponding to that kind, right, after that.
The last piece of the puzzle is
somewhat appropriately just called the finally block.
So in certain situations, regardless of whether you hit the error,
or didn't hit the error, you want to do certain things.
So for example, you open up a file for reading, and
then you're trying to do some kind of file processing, and you've hit an error.
Even if you hit the error, you would like to close the file.
You would like to lock it down.
You don't want some other process to open that file and
write to it at the same time.
So you wanna basically free up resources.
So, in those situations you write a finally block
right at the end of all your try catch stuff.
So, notice over here we have try catch, and then there's a finally block.
The nice thing about the finally block is that whatever happens, whether
the code works out properly, in which case, you wouldn't hit a catch block.
Or the code works out with an exception, in which case you do hit a catch block.
In both situations, you will run the code inside the finally block.
So put all the important freeing of ,exiting the program type of stuff,
into the finally block.
So far, all we've focused on is the ordering of the try blocks,
the catch blocks, and then the finally's, the last thing we just talked about.
But what do we do inside of a catch block?
You found the exception, you're inside a catch block, and
you wanna do some kind of graceful exiting of the program.
The most common thing to do is to just say printStackTrace.
printStackTrace is the same thing as the StackTrace that we talked about earlier,
except now instead of printing to the console,
let say you want to print it to an error log.
And then later on you can go and see what happened.
Okay, it's a file not found.
Maybe you want to actually tell the user a little bit more.
You can add that as a separate piece of the user interface or something like that.
The nice thing about the stack trace is that you can specify this
argument called a stream.
And the stream can just be a particular file name.
If you don't specify a stream, then it just goes to System.err.
Now, if you're doing this in Eclipse,
what you'll notice is that System.err is basically something that looks
like the console except everything will show up in red.
Which is kind of the reason why when you're looking at your errors everything
shows up in the red text because System.err by default
is just programmed in Eclipse to show up in red.
So at this point you now know how
to handle these exceptions by writing these try catch blocks.
We've not done too much in terms of
all the different types of exceptions and how to make your exceptions.
The idea is that once we talk about inheritance and
interfaces, we will also include creating your own exceptions.
So for now, if you hit an exception, just go and look at the inbuilt
exception types that Java has, try and find one that matches yours most closely.
And write a catch block corresponding to it.
*/
}
