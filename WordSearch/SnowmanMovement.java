/* Name: Naumana Bajwa and Fatma Jadoon.
   Teacher: Ms. Basaraba.
   Introductory Date: Tuesday, December 7th, 2021.
   Due Date: Tuesday, January 18th, 2022.
   Assignment: This is the SnowmanMovement class, which monitors and controls the animation of our snowman on our splash screen.
*/

// The "SnowmanMovement" class.
import java.awt.*; // This gives access to the Java Command libraries.
import hsa.Console; // This gives access to a variety of Class Files in Java.

public class SnowmanMovement extends Thread
{
    private Console c; // This command creates the output window.

    // Snowman Color Variables
    Color splashScreenBlue = new Color (131, 208, 207);
    Color splashScreenTeal = new Color (0, 185, 173);
    Color splashScreenDarkTeal = new Color (49, 128, 124);
    Color splashScreenMint = new Color (247, 253, 255);
    Color splashScreenShadow = new Color (245, 245, 245);
    Color splashScreenTwig = new Color (118, 64, 23);
    Color splashScreenOrange = new Color (255, 145, 77);
    Color splashScreenHat = new Color (2, 34, 48);

    public void snowman ()  // This is the public 'snowman' method, which controls the animation of our snowman on our splashscreen.
    {

	int range = 25; // This variable monitors the amount by which the snowman is going up, and down (25 units up, and 25 units down).
	int y = 0; // This variable actually allows the snowman to move up and down.
	boolean isGoingDown = true; // This boolean variable is being used to control whether the snowman is going up or down.

	for (int j = 0 ; j <= range * 9 ; j++) // This for loops runs for roughly 14 seconds, which is the length of our splash screen.
	    // The snowman bounces up and down for 14 seconds, which is what this for loop controls.
	    {
		if (isGoingDown) // If the snowman is going DOWN, then increase the variable 'y' to make it go down.
		{
		    y++;
		}
		else // If the snowman is going UP, then DECREASE the variable 'y' to make it go  up.
		{
		    y--;
		}

		if (y >= range) // If the value of 'y' is incrementing, then make sure the snowman is going up.
		{
		    isGoingDown = false;
		}
		else if (y <= 0) // If the value of 'y' is decrementing, then make sure the snowman is going down.
		{
		    isGoingDown = true;
		}

		c.setColor (splashScreenBlue); // This is being used as the 'eraser' for the animation.
		c.fillOval (480, 177 + y, 170, 232);

		c.setColor (splashScreenShadow); // This creates one of the shadows on the body of the snowman.
		c.fillOval (486, 360, 138, 92);

		c.setColor (splashScreenMint); // This creates the largest circle on the body of the snowman.
		c.fillOval (498, 297 + y, 114, 109);

		c.setColor (splashScreenShadow); // This creates one of the shadows on the body of the snowman.
		c.fillOval (515, 246 + y, 79, 88);

		c.setColor (splashScreenMint); // This creates the middle-sized circle on the body of the snowman.
		c.fillOval (514, 249 + y, 82, 78);

		c.setColor (splashScreenShadow); // This creates one of the shadows present on the body of the snowman.
		c.fillOval (527, 225 + y, 55, 51);

		c.setColor (splashScreenMint); // This creates the smallest circle on the body of the snowman.
		c.fillOval (523, 210 + y, 63, 60);

		// This block of code creates the black buttons forming the snowman's smile.
		c.setColor (Color.black);
		c.fillOval (538, 250 + y, 5, 5);

		c.setColor (Color.black);
		c.fillOval (543, 257 + y, 5, 5);

		c.setColor (Color.black);
		c.fillOval (552, 259 + y, 5, 5);

		c.setColor (Color.black);
		c.fillOval (560, 257 + y, 5, 5);

		c.setColor (Color.black);
		c.fillOval (566, 251 + y, 5, 5);

		// This block of code creates the two black buttons present on the largest circle of the snowman.
		c.setColor (Color.black);
		c.fillOval (547, 368 + y, 15, 15);

		c.setColor (Color.black);
		c.fillOval (547, 344 + y, 15, 15);

		// This block of code creates the two black buttons present on the middle-sized circle of the snowman.
		c.setColor (Color.black);
		c.fillOval (549, 304 + y, 11, 11);

		c.setColor (Color.black);
		c.fillOval (549, 285 + y, 11, 10);

		// This block of code creates the two eyes of the snowman.
		c.setColor (Color.black);
		c.fillOval (538, 226 + y, 11, 10);

		c.setColor (Color.black);
		c.fillOval (559, 226 + y, 11, 10);

		// This block of code creates the orange nose of the snowman.
		c.setColor (splashScreenOrange);
		int[] xCarrot = {552, 574, 552};

		c.setColor (splashScreenOrange);
		int[] yCarrot = {239 + y, 244 + y, 250 + y};

		c.setColor (splashScreenOrange);
		int carrotPoints = 3;

		c.setColor (splashScreenOrange);
		c.fillPolygon (xCarrot, yCarrot, carrotPoints);

		// This block of code creates one of the arms of the snowman.
		c.setColor (splashScreenTwig);
		for (int i = 0 ; i <= 2 ; i++)
		{
		    c.setColor (splashScreenTwig);

		    c.drawLine (492, 250 + i + y, 523, 277 + i + y);
		    c.setColor (splashScreenTwig);

		    c.drawLine (501, 247 + i + y, 506, 263 + i + y);
		    c.setColor (splashScreenTwig);

		    c.drawLine (506, 263 + i + y, 498, 263 + i + y);
		}

		// This block of code creates one of the arms of the snowman.
		c.setColor (splashScreenTwig);
		for (int i = 0 ; i <= 2 ; i++)
		{
		    c.setColor (splashScreenTwig);

		    c.drawLine (612, 250 + i + y, 586, 277 + i + y);
		    c.setColor (splashScreenTwig);

		    c.drawLine (598, 253 + i + y, 600, 263 + i + y);
		    c.setColor (splashScreenTwig);

		    c.drawLine (600, 263 + i + y, 614, 259 + i + y);
		}

		// This block of code draws the hat of the snowman.
		c.setColor (splashScreenHat);
		c.fillRoundRect (529, 200 + y, 52, 18, 10, 69);
		c.setColor (splashScreenHat);
		c.fillOval (538, 180 + y, 35, 32);

		// This delays the animation.
		try
		{
		    Thread.sleep (50);
		}
		catch (Exception e)
		{
		}

	    }

    } // This is the ending bracket of the public 'snowman' method.


    // Here, we are ensuring that this animation runs as a THREAD.
    public SnowmanMovement (Console con)
    {
	c = con;
    }


    public void run ()
    {
	snowman (); // We are calling and running the 'snowman' method.
    }
} // SnowmanMovement class
