
public class JavaDoc {

	
	/*You want other people to be able to read stuff.
They should not have to open up the actually class in Eclipse and
read through every single line to know what's going on.
They should be able to just mouse over your method name and
get as much information as possible.
So how do you do that, well here's a little
thing that you can do for any method that you write.
So here is just a screenshot from Eclipse.*/
 
	/**
	 *                                    you write the documentation here
	 * @return
	 */
	public int getNumerator() {
		return 5;
	}

/*I have this method called getNumerator,
which is inside a class called Rational Number.
Not too important what this class is really doing.
What is important though, is how you generate documentation.
So you put /**, hit that, hit Enter.
And what you'll get is this block wherein you can make your documentation.
So you add in what does getNumerator do?
It gets the numerator of a fraction,
it returns it as an integer, all that kind of stuff.
And the att return, the attribute basically tells you what this returns.
So this is auto generated once you have this sort of set up in Eclipse.
There are a bunch of different tags that you can have inside documentation.
So you have already seen the return tag, you can have a parameter tag or
a param tag.
It just provides documentation about what each parameter means.
You can also have a tag which says hey,
I'm not gonna write all the documentation over here.
But you want to see something else so
you have an @see documentation tag.
There's one other aspect that I want to highlight, which is in Eclipse.
Once you have all of this set up and you've written these Javadocs.
So anything that's between the /** that block that you saw before,
that's called a Javadoc, Java documentation.
You can use that to generate a little HTML page which describes the class.
So, all you need to do in Eclipse is go project, go generate Javadoc and click it.
Remember at this point you want every public method to have it's own Javadocs.
So just write a little block, and
then you'll get this really nice HTML page which looks like, This.
So for example, we had a constructor for
a rational number that took in a numerator and a denominator.
And then it gives you this nicely formatted thing saying,
we have a numerator over a denominator, parameters, all that sort of stuff.
So the core goal of this set of slides
was to show you how easy it is to generate documentation within Eclipse.
As you work in bigger and
bigger projects you can actually generate these HTML files.
And when someone says,
I know that you have a good class that does all of these cool things.
Let me reuse your code.
Instead of showing them all of the code,
you can just show them the documentation that Eclipse generated.
And they can take a quick look and say, okay this class is actually going to be
useful or this one might not be what I'm looking for.
They don't need to look at every single line of your code to figure out
what to do.
	 * 
	 */
}
