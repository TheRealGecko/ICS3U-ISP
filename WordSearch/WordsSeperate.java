/* Name: Naumana Bajwa and Fatma Jadoon.
   Teacher: Ms. Basaraba.
   Introductory Date: Tuesday, December 7th, 2021.
   Due Date: Tuesday, January 18th, 2022.
   Assignments: This is the WordsSeperate class, which controls the animation of the words on our splash screen.
*/

// The "WordsSeperate" class.
import java.awt.*; // This gives access to the Java Command libraries.
import hsa.Console; // This gives access to a variety of Class Files in Java.

public class WordsSeperate extends Thread
{
    private Console c; // This command creates the output window.

    // WordsSeperate Color Variables
    Color splashScreenBlue = new Color (131, 208, 207);
    Color splashScreenTeal = new Color (0, 185, 173);
    Color splashScreenDarkTeal = new Color (49, 128, 124);

    public void text ()  // This is the public 'text' method, which animates the movements of the title text.
    {

	//// LETTER R ////

	for (int i = 0 ; i < 281 ; i += 5) // This for loop controls for how far, and how long the letter 'r' is going to be moving.
	{
	    // This block of code animates the movement of the letter 'r'.
	    c.setColor (splashScreenTeal);
	    c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	    c.setColor (splashScreenTeal);
	    c.drawString ("r", -12 + i, 340);

	    // This delays the animation.
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	    // This erases the previous traces.
	    c.setColor (Color.white);
	    c.fillRect (-12 + i, 290, 30, 60);
	}
	// This block of code draws the final 'r' in its final position.
	int i = 0;
	c.setColor (splashScreenTeal);
	c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	c.setColor (splashScreenTeal);
	c.drawString ("r", 269 + i, 340);

	//// LETTER E ////

	for (int j = 0 ; j < 252 ; j += 5) // This for loop controls for how far, and how long the letter 'e' is going to be moving.
	{
	    // This animates the movement of the letter 'e'.
	    c.setColor (splashScreenTeal);
	    c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	    c.setColor (splashScreenTeal);
	    c.drawString ("e", -12 + j, 340);

	    // This delays the animation.
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	    // This erases the previous traces.
	    c.setColor (Color.white);
	    c.fillRect (-12 + j, 290, 30, 60);
	}
	// This draws the final 'e' in its final position.
	int j = 0;
	c.setColor (splashScreenTeal);
	c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	c.setColor (splashScreenTeal);
	c.drawString ("e", 240 + j, 340);

	//// LETTER T ////

	for (int k = 0 ; k < 227 ; k += 5) // This for loop controls for how far, and how long the letter 't' is going to be moving.
	{
	    // This animates the movement of the letter 't'.
	    c.setColor (splashScreenTeal);
	    c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	    c.setColor (splashScreenTeal);
	    c.drawString ("t", -12 + k, 340);

	    // This delays the animation.
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	    // This erases the previous traces.
	    c.setColor (Color.white);
	    c.fillRect (-12 + k, 290, 30, 60);
	}
	// This draws the final 't' in its final position.
	int k = 0;
	c.setColor (splashScreenTeal);
	c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	c.setColor (splashScreenTeal);

	c.drawString ("t", 215 + k, 340);

	//// LETTER N ////

	for (int l = 0 ; l < 187 ; l += 5) // This for loop controls for how far, and how long the letter 'n' is going to be moving.
	{
	    // This animates the movement of the letter n.
	    c.setColor (splashScreenTeal);
	    c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	    c.setColor (splashScreenTeal);
	    c.drawString ("n", -17 + l, 340);

	    // This delays the animation.
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	    // This erases the previous traces.
	    c.setColor (Color.white);
	    c.fillRect (-17 + l, 290, 50, 60);
	}
	// This draws the final 'n' in its final posiiton.
	int l = 0;
	c.setColor (splashScreenTeal);
	c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	c.setColor (splashScreenTeal);
	c.drawString ("n", 170 + l, 340);

	//// LETTER I ////

	for (int m = 0 ; m < 164 ; m += 5) // This for loop controls for how far, and how long the letter 'i' is going to be moving.
	{
	    // This animates the movement of the letter 'i'.
	    c.setColor (splashScreenTeal);
	    c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	    c.setColor (splashScreenTeal);
	    c.drawString ("i", -14 + m, 340);

	    // This delays the animation.
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	    // This erases the previous traces.
	    c.setColor (Color.white);
	    c.fillRect (-14 + m, 290, 30, 60);
	}
	// This draws the 'i' in its final position.
	int m = 0;
	c.setColor (splashScreenTeal);
	c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	c.setColor (splashScreenTeal);
	c.drawString ("i", 150 + m, 340);

	//// LETTER W ////

	for (int n = 0 ; n < 124 ; n += 5) // This for loop controls for how far, and how long the letter 'w' is going to be moving.
	{
	    // This animates the letter w.
	    c.setColor (splashScreenTeal);
	    c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	    c.setColor (splashScreenTeal);
	    c.drawString ("w", -14 + n, 340);

	    // This delays the animation.
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	    // This erases the previous traces.
	    c.setColor (Color.white);
	    c.fillRect (-14 + n, 290, 50, 60);
	}
	// This draws the final 'w' in its final position.
	int n = 0;
	c.setColor (splashScreenTeal);
	c.setFont (new Font ("Segoe Script", Font.ITALIC + Font.PLAIN, 43));
	c.setColor (splashScreenTeal);
	c.drawString ("w", 110 + n, 340);

	// This draws the final teal rectangle on top of the word 'winter' and crosses out the word.
	c.setColor (splashScreenDarkTeal);
	c.fillRect (112, 326, 188, 4);

	//// WORD ////

	for (int o = 0 ; o < 181 ; o += 5) // This for loop controls for how far, and how long 'word' is going to be moving.
	{
	    // This animates 'word'.
	    c.setColor (splashScreenTeal);
	    c.setFont (new Font ("Courier New", Font.BOLD, 95));
	    c.setColor (splashScreenTeal);
	    c.drawString ("WORD", 90, 586 - o);

	    // This delays the animation.
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	    // This erases the previous traces.
	    c.setColor (Color.white);
	    c.fillRect (80, 525 - o, 315, 100);

	}
	// This draws 'word' in its final position.
	int o = 0;
	c.setColor (splashScreenTeal);
	c.setFont (new Font ("Courier New", Font.BOLD, 95));
	c.setColor (splashScreenTeal);
	c.drawString ("WORD", 90, 405 - o);

	// This draws the final teal rectangle on top of 'word' and crosses out 'word.'
	c.setColor (splashScreenDarkTeal);
	c.fillRect (83, 371, 240, 7);

	//// PUZZLES ////

	for (int p = 0 ; p < 127 ; p += 5) // This for loop controls for how far and how long the word 'puzzles' is going to be moving.
	{
	    // This animates the word 'puzzles'.
	    c.setColor (splashScreenTeal);
	    c.setFont (new Font ("Courier New Bold", Font.PLAIN, 80));
	    c.setColor (splashScreenTeal);
	    c.drawString ("PUZZLES", -92 + p, 465);

	    // This delays the animation.
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	    // This erases the previous traces.
	    c.setColor (Color.white);
	    c.fillRect (-94 + p, 410, 400, 100);

	}
	// This draws the final word 'puzzles' in its final position.
	int p = 0;
	c.setColor (splashScreenTeal);
	c.setFont (new Font ("Courier New Bold", Font.PLAIN, 80));
	c.setColor (splashScreenTeal);
	c.drawString ("PUZZLES", 35 + p, 465);

	// This draws the final teal rectangle on top of the word 'winter' and crosses out the word.
	c.setColor (splashScreenDarkTeal);
	c.fillRect (34, 439, 340, 7);

    } // This is the ending bracket of the public 'text' method.


    // Here, we are ensuring that this animation runs as a THREAD.
    public WordsSeperate (Console con)
    {
	c = con;
    }


    public void run ()
    {
	text (); // We are calling and running the 'text' method.
    }
} // WordsSeperate class
