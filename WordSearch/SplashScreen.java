/* Name: Naumana Bajwa and Fatma Jadoon.
   Teacher: Ms. Basaraba.
   Introductory Date: Tuesday, December 7th, 2021.
   Due Date: Tuesday, January 18th, 2022.
   Assignment: This file contains the static graphics of our Splash Screen.
*/

// The "SplashScreen" class.
import java.awt.*; // This gives access to the Java Command libraries.
import hsa.Console; // This gives access to a variety of Class Files in Java.

public class SplashScreen
{

    private Console c; // This command creates the output window.

    // Splash Screen Color Variables
    Color splashScreenBlue = new Color (131, 208, 207);
    Color splashScreenTeal = new Color (0, 185, 173);
    Color splashScreenDarkTeal = new Color (49, 128, 124);
    Color splashScreenTwig = new Color (118, 64, 23);


    public void background () // This is the public 'background' method, which draws the main background colour of our screen.
    {
	c.setColor (splashScreenBlue); // This block of code draws a blue rectangle the size of our console.
	c.fillRect (0, 0, 640, 500);
    } // This is the ending bracket of the public 'background' method.


    public void trees () // This is the public 'trees' method, which draws the trees present on our screen.
    {
	// Tree Movement Variables (To Move The Trees Based On The Location Of The First One). 
	int moveDown = 34; // This variable moves the 4th tree, located towards the very right of the screen.
	int moveDown1 = 17; // This variable moves the 3th tree (from the right of the screen).
	int moveDown2 = -1; // This variable moves the 2nd tree (from the right of the screen).
	int moveLeft = -10; // This variable moves the trees left.
	int moveDown3 = -10; // This variable moves the 1st tree (from the right of the screen).
	int moveRight = 9; // This variable moves the trees right.

	c.setColor (splashScreenTwig); // Here, we are setting the color for the trunks of the trees.

	// This for loop draws the trunk of the first tree.
	for (int i = 0 ; i <= 27 ; i++)
	{
	    c.drawLine (46, 220 + i, 58, 300 + i);
	    c.drawLine (50, 220 + i, 62, 305 + i);
	}

	// This for loop draws a portion of the trunk for the second tree.
	for (int i = 0 ; i <= 44 ; i++)
	{
	    c.drawLine (137, 213 + i + moveDown2, 140, 259 + i + moveDown2);
	}

	// This for loop draws the trunk for the third tree.
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.drawLine (244 + i + moveRight, 195 + moveDown1, 244 + i + moveRight, 255 + moveDown1);
	}

	// This for loop draws a portion of the trunk for the second tree.
	for (int i = 0 ; i <= 27 ; i++)
	{
	    c.drawLine (134, 207 + i + moveDown2, 140, 285 + i + moveDown2);
	}

	// This for loop draws a portion of the trunk for the second tree.
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.drawLine (139, 207 + i + moveDown2, 147, 285 + i + moveDown2);
	}

	// This for loop draws the trunk for the fourth tree.
	for (int i = 0 ; i <= 43 ; i++)
	{
	    c.drawLine (396, 201 + i + moveDown, 368, 287 + i + moveDown);
	}

	// This block of code draws the smallest triangle on the 1st tree.
	c.setColor (splashScreenDarkTeal);
	int[] tree1X = {20, 44, 79};
	int[] tree1Y = {254, 219, 244};
	int tree1Points = 3;
	c.fillPolygon (tree1X, tree1Y, tree1Points);

	// This block of code draws the middle-sized triangle on the 1st tree.
	c.setColor (splashScreenDarkTeal);
	int[] tree2X = {23, 43, 69};
	int[] tree2Y = {236, 211, 228};
	int tree2Points = 3;
	c.fillPolygon (tree2X, tree2Y, tree2Points);

	// This block of code draws the largest triangle on the 1st tree.
	c.setColor (splashScreenDarkTeal);
	int[] tree3X = {29, 40, 56};
	int[] tree3Y = {220, 204, 214};
	int tree3Points = 3;
	c.fillPolygon (tree3X, tree3Y, tree3Points);

	// This block of code draws the smallest triangle on the 2nd tree.
	c.setColor (splashScreenTeal);
	int[] tree4X = {98, 139, 183};
	int[] tree4Y = {242 + moveDown2, 198 + moveDown2, 241 + moveDown2};
	int tree4Points = 3;
	c.fillPolygon (tree4X, tree4Y, tree4Points);

	// This block of code draws the middle-sized triangle on the 2nd tree.
	c.setColor (splashScreenTeal);
	int[] tree5X = {107, 140, 172};
	int[] tree5Y = {219 + moveDown2, 185 + moveDown2, 217 + moveDown2};
	int tree5Points = 3;
	c.fillPolygon (tree5X, tree5Y, tree5Points);

	// This block of code draws the largest triangle on the 2nd tree.
	c.setColor (splashScreenTeal);
	int[] tree6X = {121, 140, 157};
	int[] tree6Y = {197 + moveDown2, 178 + moveDown2, 196 + moveDown2};
	int tree6Points = 3;
	c.fillPolygon (tree6X, tree6Y, tree6Points);

	// This block of code draws the smallest triangle on the 3rd tree.
	c.setColor (splashScreenDarkTeal);
	int[] tree7X = {197 + moveRight, 306 + moveRight, 251 + moveRight};
	int[] tree7Y = {230 + moveDown1, 231 + moveDown1, 177 + moveDown1};
	int tree7Points = 3;
	c.fillPolygon (tree7X, tree7Y, tree7Points);

	// This block of code draws the middle-sized triangle on the 3rd tree.
	c.setColor (splashScreenDarkTeal);
	int[] tree8X = {207 + moveRight, 293 + moveRight, 250 + moveRight};
	int[] tree8Y = {201 + moveDown1, 202 + moveDown1, 158 + moveDown1};
	int tree8Points = 3;
	c.fillPolygon (tree8X, tree8Y, tree8Points);

	// This block of code draws the largest triangle on the 3rd tree.
	c.setColor (splashScreenDarkTeal);
	int[] tree9X = {226 + moveRight, 274 + moveRight, 250 + moveRight};
	int[] tree9Y = {173 + moveDown1, 174 + moveDown1, 149 + moveDown1};
	int tree9Points = 3;
	c.fillPolygon (tree9X, tree9Y, tree9Points);

	// This block of code draws the smallest triangle on the 4th tree.
	c.setColor (splashScreenTeal);
	int[] tree10X = {320, 413, 462};
	int[] tree10Y = {231 + moveDown, 182 + moveDown, 274 + moveDown};
	int tree10Points = 3;
	c.fillPolygon (tree10X, tree10Y, tree10Points);

	// This block of code draws the middle-sized triangle on the 4th tree.
	c.setColor (splashScreenTeal);
	int[] tree11X = {348, 418, 456};
	int[] tree11Y = {198 + moveDown, 160 + moveDown, 230 + moveDown};
	int tree11Points = 3;
	c.fillPolygon (tree11X, tree11Y, tree11Points);

	// This block of code draws the largest triangle on the 4th tree.
	c.setColor (splashScreenTeal);
	int[] tree12X = {382, 422, 442};
	int[] tree12Y = {169 + moveDown, 149 + moveDown, 186 + moveDown};
	int tree12Points = 3;
	c.fillPolygon (tree12X, tree12Y, tree12Points);
	
    } // This is the ending bracket of the public 'trees' method.


    public void snow () // This is the public 'snow' method, which draws the layers of snow in the background.
    {
	// This sets the colour to white.
	c.setColor (Color.white);
	
	// This draws the first layer of snow.
	c.fillOval (-202, 251, 680, 337);
	
	// This draws the second layer of snow.
	c.fillOval (-200, 341, 680, 327);
	
	// This draws the third layer of snow.
	c.fillOval (266, 400, 525, 317);
	
	// This draws the fourth layer of snow.
	c.fillOval (-50, 325, 525, 300);

    } // This is the ending bracket of the public 'snow' method.


    public SplashScreen (Console con)
    {
	c = con; // This is allowing the animations on the splash screen to run.
	background (); // This calls the background method.
	trees (); // This calls the trees method.
	snow (); // This calls the snow method.
    }
} // SplashScreen class
