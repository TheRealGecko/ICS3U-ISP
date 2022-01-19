/* Name: Naumana Bajwa and Fatma Jadoon.
   Teacher: Ms. Basaraba.
   Introductory Date: Tuesday, December 7th, 2021.
   Due Date: Tuesday, January 18th, 2022.
   Assignment; This is the Snowflakes class, which controls the animation of our snowflakes on the splash screen.
*/

// The "Snowflakes" class.
import java.awt.*; // This gives access to the Java Command libraries.
import hsa.Console; // This gives access to a variety of Class Files in Java.

public class Snowflakes extends Thread
{
    private Console c; // This command creates the output window.

    // Snowflake(s) Color Variables
    Color splashScreenBlue = new Color (131, 208, 207);

    public void snowflakes ()  // This is the public 'snowflakes' method, which controls the 'down' movement of our snowflakes.
    {

	/// SNOWFLAKE MOVEMENT VARIABLES: ///

	// These variables are simply being used to manipulate the location(s) of the snowflakes.
	int fx = -1;
	int fy = 1;
	int f2x = 40;
	int f2y = 55;
	int f3x = -15;
	int f3y = 90;

	// These two variables are being utilized to alter the location(s) of the first snowflake, second snowflake, and third snowflake.
	int x = 0;
	int y = -40;

	// These two variables are being utilized to alter the location of the sixth snowflake.
	int x2 = 500;
	int y2 = -125;

	// These two variables are being utilized to alter the location of the fourth snowflake.
	int x3 = 320;
	int y3 = -50;

	// These two variables are being utilized to alter the location of the fifth snowflake.
	int x4 = 500;
	int y4 = 43;

	/// SNOWFLAKE #1: ///

	for (int i = 0 ; i < 300 ; i += 5) // This for loop controls how long the first snowflake will be falling over.
	{

	    // Using the 'i' variable, we are animating the snowflake moving DOWN.

	    c.setColor (Color.white); // This array contains the coordinates for one of the components of the main body of the snowflake.
	    int[] flake7x = {71 + fx + x, 79 + fx + x, 47 + fx + x, 41 + fx + x};

	    c.setColor (Color.white); // This array contains the coordinates for one of the components of the main body of the snowflake.
	    int[] flake7y = { - 138 + fy + y + i, -130 + fy + y + i, -98 + fy + y + i, -105 + fy + y + i};

	    c.setColor (Color.white); // This array contains the coordinates for one of the components of the main body of the snowflake.
	    int[] flake8x = {47 + x, 41 + x, 71 + x, 79 + x};

	    c.setColor (Color.white); // This array contains the coordinates for one of the components of the main body of the snowflake.
	    int[] flake8y = { - 138 + y + i, -130 + y + i, -98 + y + i, -105 + y + i};

	    // The block of code below is simply creating the edges of the snowflakes, as well as the central area of the snowflake.
	    c.setColor (Color.white);
	    c.fillRect (54 + x, -136 + y + i, 11, 40);

	    c.setColor (Color.white);
	    c.fillOval (54 + x, -142 + y + i, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (54 + x, -103 + y + i, 11, 11);

	    c.setColor (Color.white);
	    c.fillRect (39 + x, -123 + y + i, 40, 11);

	    c.setColor (Color.white);
	    c.fillOval (33 + x, -123 + y + i, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (74 + x, -123 + y + i, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake7x, flake7y, 4);
	    c.fillOval (70 + fx + x, -139 + fy + y + i, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (41 + fx + x, -109 + fy + y + i, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake8x, flake8y, 4);

	    c.setColor (Color.white);
	    c.fillOval (41 + fx + x, -139 + fy + y + i, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (70 + fx + x, -109 + fy + y + i, 11, 11);

	    c.setColor (Color.white);

	    // This is being used to delay the animation.
	    try
	    {
		Thread.sleep (55);
	    }
	    catch (Exception e)
	    {
	    }
	    // This is 'erasing' the previous traces of the snowflake.
	    c.setColor (splashScreenBlue);
	    c.fillRect (20, -200 + i, 100, 80);

	}

	// Here, we are simply REDRAWING the body of the snowflake, to make it seem as if the movement of the snowflake is stopping.

	int i = 0;

	c.setColor (Color.white);
	int[] flake7x = {71 + fx + x, 79 + fx + x, 47 + fx + x, 41 + fx + x};

	c.setColor (Color.white);
	int[] flake7y = {162 + fy + y - i, 170 + fy + y - i, 202 + fy + y - i, 195 + fy + y - i};

	c.setColor (Color.white);
	int[] flake8x = {47 + x, 41 + x, 71 + x, 79 + x};

	c.setColor (Color.white);
	int[] flake8y = {162 + y - i, 170 + y - i, 202 + y - i, 195 + y - i};

	c.setColor (Color.white);
	c.fillRect (54 + x, 164 + y - i, 11, 40);

	c.setColor (Color.white);
	c.fillOval (54 + x, 158 + y - i, 11, 11);

	c.setColor (Color.white);
	c.fillOval (54 + x, 197 + y - i, 11, 11);

	c.setColor (Color.white);
	c.fillRect (39 + x, 177 + y - i, 40, 11);

	c.setColor (Color.white);
	c.fillOval (33 + x, 177 + y - i, 11, 11);

	c.setColor (Color.white);
	c.fillOval (74 + x, 177 + y - i, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake7x, flake7y, 4);

	c.setColor (Color.white);
	c.fillOval (70 + fx + x, 161 + fy + y - i, 11, 11);

	c.setColor (Color.white);
	c.fillOval (41 + fx + x, 191 + fy + y - i, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake8x, flake8y, 4);

	c.setColor (Color.white);
	c.fillOval (41 + fx + x, 161 + fy + y - i, 11, 11);

	c.setColor (Color.white);
	c.fillOval (70 + fx + x, 191 + fy + y - i, 11, 11);

	/// SNOWFLAKE #2: ///

	for (int j = 0 ; j < 200 ; j += 5) // This for loop controls how far and how long the snowflake will be falling for.
	{

	    // Using the 'j' variable, we are animating the snowflake moving DOWN.

	    c.setColor (Color.white);
	    int[] flake5x = {161 + fx + x, 169 + fx + x, 137 + fx + x, 131 + fx + x}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake5y = { - 78 + fy + y + j, -70 + fy + y + j, -38 + fy + y + j, -45 + fy + y + j}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake6x = {137 + x, 131 + x, 161 + x, 169 + x}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake6y = { - 78 + y + j, -70 + y + j, -38 + y + j, -45 + y + j}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    // This block of code below is drawing the edges and MAIN BODY of the snowflake.
	    c.setColor (Color.white);
	    c.fillRect (144 + x, -76 + y + j, 11, 40);

	    c.setColor (Color.white);
	    c.fillOval (144 + x, -82 + y + j, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (144 + x, -43 + y + j, 11, 11);

	    c.setColor (Color.white);
	    c.fillRect (129 + x, -63 + y + j, 40, 11);

	    c.setColor (Color.white);
	    c.fillOval (123 + x, -63 + y + j, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (164 + x, -63 + y + j, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake5x, flake5y, 4);

	    c.setColor (Color.white);
	    c.fillOval (160 + fx + x, -79 + fy + y + j, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (131 + fx + x, -49 + fy + y + j, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake6x, flake6y, 4);

	    c.setColor (Color.white);
	    c.fillOval (131 + fx + x, -79 + fy + y + j, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (160 + fx + x, -49 + fy + y + j, 11, 11);

	    // This is delaying the animation.
	    try
	    {
		Thread.sleep (55);
	    }
	    catch (Exception e)
	    {
	    }
	    // This is erasing the previous traces of the snowflake.
	    c.setColor (splashScreenBlue);
	    c.fillRect (120, -200 + j, 60, 150);

	}

	// Here, we are redrawing the main body of the snowflake, to make it seem as if the movement of the snowflake has been halted.
	c.setColor (Color.white);
	int[] flake5x = {161 + fx + x, 169 + fx + x, 137 + fx + x, 131 + fx + x}; // increse by 60

	c.setColor (Color.white);
	int[] flake5y = {122 + fy + y, 130 + fy + y, 162 + fy + y, 155 + fy + y};

	c.setColor (Color.white);
	int[] flake6x = {137 + x, 131 + x, 161 + x, 169 + x};

	c.setColor (Color.white);
	int[] flake6y = {122 + y, 130 + y, 162 + y, 155 + y};

	c.setColor (Color.white);
	c.fillRect (144 + x, 124 + y, 11, 40);

	c.setColor (Color.white);
	c.fillOval (144 + x, 118 + y, 11, 11);

	c.setColor (Color.white);
	c.fillOval (144 + x, 157 + y, 11, 11);

	c.setColor (Color.white);
	c.fillRect (129 + x, 137 + y, 40, 11);

	c.setColor (Color.white);
	c.fillOval (123 + x, 137 + y, 11, 11);

	c.setColor (Color.white);
	c.fillOval (164 + x, 137 + y, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake5x, flake5y, 4);

	c.setColor (Color.white);
	c.fillOval (160 + fx + x, 121 + fy + y, 11, 11);

	c.setColor (Color.white);
	c.fillOval (131 + fx + x, 151 + fy + y, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake6x, flake6y, 4);

	c.setColor (Color.white);
	c.fillOval (131 + fx + x, 121 + fy + y, 11, 11);

	c.setColor (Color.white);
	c.fillOval (160 + fx + x, 151 + fy + y, 11, 11);

	/// SNOWFLAKE #3: ///

	for (int k = 0 ; k < 150 ; k += 5) // This for loop is controlling how long and how far the snowflake will fall for.
	{

	    // The variable 'k' is being used to control the falling movement of the snowflake.

	    c.setColor (Color.white);
	    int[] flake3x = {91 + fx + x, 99 + fx + x, 67 + fx + x, 61 + fx + x}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake3y = { - 78 + fy + y + k, -70 + fy + y + k, -38 + fy + y + k, -45 + fy + y + k}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake4x = {67 + x, 61 + x, 91 + x, 99 + x}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake4y = { - 78 + y + k, -70 + y + k, -38 + y + k, -45 + y + k}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    // This block of code is drawing the main body and edges of the snowflake.
	    c.setColor (Color.white);
	    c.fillRect (74 + x, -76 + y + k, 11, 40);

	    c.setColor (Color.white);
	    c.fillOval (74 + x, -82 + y + k, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (74 + x, -43 + y + k, 11, 11);

	    c.setColor (Color.white);
	    c.fillRect (59 + x, -63 + y + k, 40, 11);

	    c.setColor (Color.white);
	    c.fillOval (53 + x, -63 + y + k, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (94 + x, -63 + y + k, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake3x, flake3y, 4);

	    c.setColor (Color.white);
	    c.fillOval (90 + fx + x, -79 + fy + y + k, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (61 + fx + x, -49 + fy + y + k, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake4x, flake4y, 4);

	    c.setColor (Color.white);
	    c.fillOval (61 + fx + x, -79 + fy + y + k, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (90 + fx + x, -49 + fy + y + k, 11, 11);

	    c.setColor (Color.white);

	    // This is delaying the animation.
	    try
	    {
		Thread.sleep (55);
	    }
	    catch (Exception e)
	    {
	    }
	    // This is erasing the previous traces of the snowflake.
	    c.setColor (splashScreenBlue);
	    c.fillRect (40, -200 + k, 70, 150);
	}

	// Here, we are redrawing the main body of the snowflake, to make it seem as if the movement of the snowflake has been halted.
	c.setColor (Color.white);
	int[] flake3x = {91 + fx + x, 99 + fx + x, 67 + fx + x, 61 + fx + x}; // og

	c.setColor (Color.white);
	int[] flake3y = {72 + fy + y, 80 + fy + y, 112 + fy + y, 105 + fy + y};

	c.setColor (Color.white);
	int[] flake4x = {67 + x, 61 + x, 91 + x, 99 + x};

	c.setColor (Color.white);
	int[] flake4y = {72 + y, 80 + y, 112 + y, 105 + y};

	c.setColor (Color.white);
	c.fillRect (74 + x, 74 + y, 11, 40);

	c.setColor (Color.white);
	c.fillOval (74 + x, 68 + y, 11, 11);

	c.setColor (Color.white);
	c.fillOval (74 + x, 107 + y, 11, 11);

	c.setColor (Color.white);
	c.fillRect (59 + x, 87 + y, 40, 11);

	c.setColor (Color.white);
	c.fillOval (53 + x, 87 + y, 11, 11);

	c.setColor (Color.white);
	c.fillOval (94 + x, 87 + y, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake3x, flake3y, 4);

	c.setColor (Color.white);
	c.fillOval (90 + fx + x, 71 + fy + y, 11, 11);

	c.setColor (Color.white);
	c.fillOval (61 + fx + x, 101 + fy + y, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake4x, flake4y, 4);

	c.setColor (Color.white);
	c.fillOval (61 + fx + x, 71 + fy + y, 11, 11);

	c.setColor (Color.white);
	c.fillOval (90 + fx + x, 101 + fy + y, 11, 11);

	/// SNOWFLAKE #4: ///

	for (int l = 0 ; l < 170 ; l += 6) // This for loop is controlling how long, and how far the snowflake is going to be falling.
	{

	    // The variable 'l' is being used to control the falling movement of the snowflake.

	    c.setColor (Color.white);
	    int[] flake9x = {161 + fx + x3, 169 + fx + x3, 137 + fx + x3, 131 + fx + x3}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake9y = { - 48 + fy + y3 + l, -40 + fy + y3 + l, -8 + fy + y3 + l, -15 + fy + y3 + l};  // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake10x = {137 + x3, 131 + x3, 161 + x3, 169 + x3}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake10y = { - 48 + y3 + l, -40 + y3 + l, -8 + y3 + l, -15 + y3 + l}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    // This block of code is being used to draw the main body and edges of the snowflake.
	    c.setColor (Color.white);
	    c.fillRect (144 + x3, -46 + y3 + l, 11, 40);

	    c.setColor (Color.white);
	    c.fillOval (144 + x3, -52 + y3 + l, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (144 + x3, -13 + y3 + l, 11, 11);

	    c.setColor (Color.white);
	    c.fillRect (129 + x3, -33 + y3 + l, 40, 11);

	    c.setColor (Color.white);
	    c.fillOval (123 + x3, -33 + y3 + l, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (164 + x3, -33 + y3 + l, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake9x, flake9y, 4);

	    c.setColor (Color.white);
	    c.fillOval (160 + fx + x3, -49 + fy + y3 + l, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (131 + fx + x3, -19 + fy + y3 + l, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake10x, flake10y, 4);

	    c.setColor (Color.white);
	    c.fillOval (131 + fx + x3, -49 + fy + y3 + l, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (160 + fx + x3, -19 + fy + y3 + l, 11, 11);

	    c.setColor (Color.white);

	    // This is being used to delay the animation.
	    try
	    {
		Thread.sleep (55);
	    }
	    catch (Exception e)
	    {
	    }
	    // This is erasing the previous traces of the snowflake.
	    c.setColor (splashScreenBlue);
	    c.fillRect (430, -200 + l, 80, 160);

	}

	// This is drawing the final location of the snowflake (essentially redrawing the code above) to make it seem like the movement of the snowflake had stopped.

	c.setColor (Color.white);
	int[] flake9x = {161 + fx + x3, 169 + fx + x3, 137 + fx + x3, 131 + fx + x3};

	c.setColor (Color.white);
	int[] flake9y = {122 + fy + y3, 130 + fy + y3, 162 + fy + y3, 155 + fy + y3};

	c.setColor (Color.white);
	int[] flake10x = {137 + x3, 131 + x3, 161 + x3, 169 + x3};

	c.setColor (Color.white);
	int[] flake10y = {122 + y3, 130 + y3, 162 + y3, 155 + y3};

	c.setColor (Color.white);
	c.fillRect (144 + x3, 124 + y3, 11, 40);

	c.setColor (Color.white);
	c.fillOval (144 + x3, 118 + y3, 11, 11);

	c.setColor (Color.white);
	c.fillOval (144 + x3, 157 + y3, 11, 11);

	c.setColor (Color.white);
	c.fillRect (129 + x3, 137 + y3, 40, 11);

	c.setColor (Color.white);
	c.fillOval (123 + x3, 137 + y3, 11, 11);

	c.setColor (Color.white);
	c.fillOval (164 + x3, 137 + y3, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake9x, flake9y, 4);

	c.setColor (Color.white);
	c.fillOval (160 + fx + x3, 121 + fy + y3, 11, 11);

	c.setColor (Color.white);
	c.fillOval (131 + fx + x3, 151 + fy + y3, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake10x, flake10y, 4);

	c.setColor (Color.white);
	c.fillOval (131 + fx + x3, 121 + fy + y3, 11, 11);

	c.setColor (Color.white);
	c.fillOval (160 + fx + x3, 151 + fy + y3, 11, 11);

	/// SNOWFLAKE #5: ///

	for (int n = 0 ; n < 195 ; n += 5) // This for loop is controlling how long and how far the snowflake is going to be falling (for).
	{

	    // The variable 'n' is controlling the falling movement of the snowflake.

	    c.setColor (Color.white);
	    int[] flake13x = {91 + fx + x4, 99 + fx + x4, 67 + fx + x4, 61 + fx + x4}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake13y = { - 123 + fy + y4 + n, -115 + fy + y4 + n, -83 + fy + y4 + n, -90 + fy + y4 + n}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake14x = {67 + x4, 61 + x4, 91 + x4, 99 + x4}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake14y = { - 123 + y4 + n, -115 + y4 + n, -83 + y4 + n, -90 + y4 + n}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    // This block of code is drawing the main centre of the snowflake, and the edges of the snowflake.
	    c.setColor (Color.white);
	    c.fillRect (74 + x4, -121 + y4 + n, 11, 40);

	    c.setColor (Color.white);
	    c.fillOval (74 + x4, -127 + y4 + n, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (74 + x4, -88 + y4 + n, 11, 11);

	    c.setColor (Color.white);
	    c.fillRect (59 + x4, -108 + y4 + n, 40, 11);

	    c.setColor (Color.white);
	    c.fillOval (53 + x4, -108 + y4 + n, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (94 + x4, -108 + y4 + n, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake13x, flake13y, 4);

	    c.setColor (Color.white);
	    c.fillOval (90 + fx + x4, -124 + fy + y4 + n, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (61 + fx + x4, -94 + fy + y4 + n, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake14x, flake14y, 4);

	    c.setColor (Color.white);
	    c.fillOval (61 + fx + x4, -124 + fy + y4 + n, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (90 + fx + x4, -94 + fy + y4 + n, 11, 11);

	    // This delays the animation.
	    try
	    {
		Thread.sleep (55);
	    }
	    catch (Exception e)
	    {
	    }
	    // This erases the previous traces of the snowflake.
	    c.setColor (splashScreenBlue);
	    c.fillRect (550, -200 + n, 60, 170);

	}

	// This is drawing the final location of the snowflake (essentially redrawing the code above) to make it seem like the movement of the snowflake had stopped.

	c.setColor (Color.white);
	int[] flake13x = {91 + fx + x4, 99 + fx + x4, 67 + fx + x4, 61 + fx + x4}; // og

	c.setColor (Color.white);
	int[] flake13y = {72 + fy + y4, 80 + fy + y4, 112 + fy + y4, 105 + fy + y4};

	c.setColor (Color.white);
	int[] flake14x = {67 + x4, 61 + x4, 91 + x4, 99 + x4};

	c.setColor (Color.white);
	int[] flake14y = {72 + y4, 80 + y4, 112 + y4, 105 + y4};

	c.setColor (Color.white);
	c.fillRect (74 + x4, 74 + y4, 11, 40);

	c.setColor (Color.white);
	c.fillOval (74 + x4, 68 + y4, 11, 11);

	c.setColor (Color.white);
	c.fillOval (74 + x4, 107 + y4, 11, 11);

	c.setColor (Color.white);
	c.fillRect (59 + x4, 87 + y4, 40, 11);

	c.setColor (Color.white);
	c.fillOval (53 + x4, 87 + y4, 11, 11);

	c.setColor (Color.white);
	c.fillOval (94 + x4, 87 + y4, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake13x, flake13y, 4);

	c.setColor (Color.white);
	c.fillOval (90 + fx + x4, 71 + fy + y4, 11, 11);

	c.setColor (Color.white);
	c.fillOval (61 + fx + x4, 101 + fy + y4, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake14x, flake14y, 4);

	c.setColor (Color.white);
	c.fillOval (61 + fx + x4, 71 + fy + y4, 11, 11);

	c.setColor (Color.white);
	c.fillOval (90 + fx + x4, 101 + fy + y4, 11, 11);

	/// SNOWFLAKE #6: ///

	for (int m = 0 ; m < 205 ; m += 6) // This for loop is controlling how far and how long the snowflake is falling down for.
	{

	    // The variable 'm' is controlling the falling movement of the snowflake.

	    c.setColor (Color.white);
	    int[] flake11x = {71 + fx + x2, 79 + fx + x2, 47 + fx + x2, 41 + fx + x2}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake11y = { - 43 + fy + y2 + m, -35 + fy + y2 + m, -3 + fy + y2 + m, -10 + fy + y2 + m}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake12x = {47 + x2, 41 + x2, 71 + x2, 79 + x2}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    c.setColor (Color.white);
	    int[] flake12y = { - 43 + y2 + m, -35 + y2 + m, -3 + y2 + m, -10 + y2 + m}; // This array contains the coordinates for one of the components of the main body of the snowflake.

	    // This block of code is drawing the main centre and the edges of the snowflake.
	    c.setColor (Color.white);
	    c.fillRect (54 + x2, -41 + y2 + m, 11, 40);

	    c.setColor (Color.white);
	    c.fillOval (54 + x2, -47 + y2 + m, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (54 + x2, -8 + y2 + m, 11, 11);

	    c.setColor (Color.white);
	    c.fillRect (39 + x2, -28 + y2 + m, 40, 11);

	    c.setColor (Color.white);
	    c.fillOval (33 + x2, -28 + y2 + m, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (74 + x2, -28 + y2 + m, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake11x, flake11y, 4);

	    c.setColor (Color.white);
	    c.fillOval (70 + fx + x2, -44 + fy + y2 + m, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (41 + fx + x2, -14 + fy + y2 + m, 11, 11);

	    c.setColor (Color.white);
	    c.fillPolygon (flake12x, flake12y, 4);

	    c.setColor (Color.white);
	    c.fillOval (41 + fx + x2, -44 + fy + y2 + m, 11, 11);

	    c.setColor (Color.white);
	    c.fillOval (70 + fx + x2, -14 + fy + y2 + m, 11, 11);

	    // This is delaying the animation.
	    try
	    {
		Thread.sleep (55);
	    }
	    catch (Exception e)
	    {
	    }
	    // This is erasing the previous traces of the snowflake.
	    c.setColor (splashScreenBlue);
	    c.fillRect (530, -200 + m, 60, 100);

	}

	// This is drawing the final location of the snowflake (essentially redrawing the code above) to make it seem like the movement of the snowflake had stopped.
	c.setColor (Color.white);
	int[] flake11x = {71 + fx + x2, 79 + fx + x2, 47 + fx + x2, 41 + fx + x2}; // 90

	c.setColor (Color.white);
	int[] flake11y = {162 + fy + y2, 170 + fy + y2, 202 + fy + y2, 195 + fy + y2};

	c.setColor (Color.white);
	int[] flake12x = {47 + x2, 41 + x2, 71 + x2, 79 + x2};

	c.setColor (Color.white);
	int[] flake12y = {162 + y2, 170 + y2, 202 + y2, 195 + y2};

	c.setColor (Color.white);
	c.fillRect (54 + x2, 164 + y2, 11, 40);

	c.setColor (Color.white);
	c.fillOval (54 + x2, 158 + y2, 11, 11);

	c.setColor (Color.white);
	c.fillOval (54 + x2, 197 + y2, 11, 11);

	c.setColor (Color.white);
	c.fillRect (39 + x2, 177 + y2, 40, 11);

	c.setColor (Color.white);
	c.fillOval (33 + x2, 177 + y2, 11, 11);

	c.setColor (Color.white);
	c.fillOval (74 + x2, 177 + y2, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake11x, flake11y, 4);

	c.setColor (Color.white);
	c.fillOval (70 + fx + x2, 161 + fy + y2, 11, 11);

	c.setColor (Color.white);
	c.fillOval (41 + fx + x2, 191 + fy + y2, 11, 11);

	c.setColor (Color.white);
	c.fillPolygon (flake12x, flake12y, 4);

	c.setColor (Color.white);
	c.fillOval (41 + fx + x2, 161 + fy + y2, 11, 11);

	c.setColor (Color.white);
	c.fillOval (70 + fx + x2, 191 + fy + y2, 11, 11);

    } // This is the ending bracket of the public 'snowflakes' method.


    // Here, we are ensuring that this animation runs as a THREAD.
    public Snowflakes (Console con)
    {
	c = con;
    }


    public void run ()
    {
	snowflakes (); // We are calling and running the 'snowflakes' method.
    }
} // Snowflakes class
