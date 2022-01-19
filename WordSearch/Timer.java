/* Name: Naumana Bajwa and Fatma Jadoon.
   Teacher: Ms. Basaraba.
   Introductory Date: Tuesday, December 7th, 2021.
   Due Date: Tuesday, January 18th, 2022.
   Assignment: This is the Timer class, which controls and monitors the timer in our word puzzles.
*/

// The "Timer" class.
import java.awt.*; // This gives access to the Java Command libraries.
import hsa.Console; // This gives access to a variety of Class Files in Java.

public class Timer extends Thread
{
    Console c; // This command creates the output window.

    // Timer Variables
    int time; // This is the int variable 'time' which essentially monitors how long the timer has been running for.

    public void timer ()  // This is the public 'timer' method, upon which we are designing and creating our timer.
    {

	c.setColor (Color.white); // This block of code draws the white oval that represents the timer.
	c.fillOval (20, 30, 90, 90);

	while (time > 0) // While the time is NOT over, or while 'time' is greater than 0...
	{

	    c.setColor (Color.black); // This sets the color and font of the timer text.
	    c.setFont (new Font ("Arial Black", Font.PLAIN, 40));

	    if (time > 9) // While the value of 'time' is greater than 9....
	    {
		c.drawString ("" + time, 38, 89); // ... this line of code will be executed.
	    }
	    else   // Otherwise...
	    {
		c.drawString ("0" + time, 38, 89); // the character '0' will be displayed.
	    }

	    // This is being utilized to delay the timer.
	    try
	    {
		Thread.sleep (60000);
	    }
	    catch (Exception e)
	    {
	    }

	    // This continually redraws the white oval upon which the time is to be displayed.
	    c.setColor (Color.white);
	    c.fillOval (20, 30, 90, 90);

	    // The time is decreasing, or decrementing.
	    time--;
	}

	while (true) // The following code is guranteed to be executed, as the condition is while(true).
	{
	    // This block of code is setting the colour and font of the timer text.
	    c.setFont (new Font ("Arial Black", Font.PLAIN, 40));

	    // When the time is over, the characters '00' will flash in red.
	    c.setColor (Color.red);
	    c.drawString ("00", 38, 89);

	    // This is delaying the animation of the flashing characters.
	    try
	    {
		Thread.sleep (1000);
	    }
	    catch (Exception e)
	    {
	    }

	    // This redraws the white oval displaying the timer text.
	    c.setColor (Color.white);
	    c.fillOval (20, 30, 90, 90);

	    // This is further delaying the animation.
	    try
	    {
		Thread.sleep (1000);
	    }
	    catch (Exception e)
	    {
	    }
	}
    } // This is the ending bracket of the public 'timer' method.


    public int time ()  // This is the public 'int' time method, whose only function is to return the integer representing the time.
    {
	return time;
    } // This is the ending bracket of the public 'int' time method.


    public void run ()
    {
	timer (); // We are calling and running the 'timer' method.
    }


    // Here, we are ensuring that this animation runs as a THREAD.
    public Timer (Console con, int timing)
    {
	c = con;
	time = timing;
    }
} // Timer class
