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

interface Myinter
{
	void add();
	void subtract();
} 

class one implements Myinter{
	public void add(){
		System.out.println("Addition of 2 numbers are");
}
	public void subtract(){
		System.out.println("subtraction of 2 numbers are");
	}
	}