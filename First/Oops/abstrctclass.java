/*
 * Created on Sep 18, 2017
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Oops;

/**
 * @author sgolyala
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
abstract class abstrctclass {
	abstract void Calculate(double x);
}
class sub1 extends abstrctclass{
	 void Calculate(double x)
	{
		System.out.println("Square of" +(x*x));
	}
}
class sub2 extends abstrctclass{
	 void Calculate(double x)
	{
		System.out.println("Squart of" +Math.sqrt(x));
	}
}
