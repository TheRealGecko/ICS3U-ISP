/* Name: Naumana Bajwa and Fatma Jadoon.
   Teacher: Ms. Basaraba.
   Introductory Date: Tuesday, December 7th, 2021.
   Due Date: Tuesday, January 18th, 2022.
   Assignment: Our incredibly exciting and well-made ISP features an immense variety of winter-themed word searches and puzzles of two difficulty levels (Normal and Hard).
	       The user will initially view our splash screen. Our splash screen features three wondefully executed animations, including the bobbing movement of a snowman,
	       the gliding movement of snowflakes, as well as the graceful 'sliding' movements of the main title text onto the screen, followed by each individual portion of
	       the title text getting 'crossed out'. The user is then taken to our main menu, which showcases four central options. From there, the user may choose to progress to
	       the 'instructions' screen, the 'quit' or 'goodbye' screen, the 'scoreboard', or, simply move on to the game itself. If they choose to head on to the game itself,
	       the user will be prompted to enter their preferred user name. They will then be transported to the 'askTimer' screen, which asks for them to choose to play either
	       a 'timed' or 'un-timed' puzzle. If they choose 'timed', they are to enter their own preferred time limit (which, funnily enough, has its own limit (between 1 and
	       30 min)). Ensuing this, they will be asked to choose between our two difficulty levels. After a difficulty level has been selected, we will head on to the word search!
	       The user may play one word search at a time. The word searches are randomly generated, each with different winter-related topics. To 'cross put' a word on the word
	       search, the user will have to enter the row + column number(s) for the first letter of the word, and the row + column number(s) for the second letter of the word. They
	       must be aware of the ticking clock (if they chose a timed puzzle). Each guessed word will bestow upon them a certain number of points. After completing the puzzle, the user
	       will be featured on the scoreboard. They may clear the scores on the scoreboard. They may also quit, or play again.
*/

// The "WordSearch" class.
import java.awt.*; // This gives access to the Java Command libraries.
import hsa.*; // This gives access to a variety of Class Files in Java.
import java.io.*; // This imports all the classes of the input output package in the program.

public class WordSearch
{
    Console c; // This command creates the output window.

    // Primary Global Variables To Be Used Throughout The Program.
    String menu; // This variable takes input from the user, on the main menu screen.
    String difficulty; // This variable takes input from the user, on the 'askDifficulty' screen.
    int wordSearch; // This variable is going to be utilized to store a random number applicable to a certain word search.
    String temp; // This variable stores user input temporarily to error trap.
    char timed; // This variable relates to the timer of the program.
    int time; // This variable relates to the timer of the program.
    String name = "player"; // This variable stores the name of the user.
    boolean game; // This variable stores whether the user wishes to quit during a game.
    int words = 0; // This variable stores the user's score when playing the word search

    // General Color Variables
    Color gradient1 = new Color (32, 68, 102);
    Color gradient2 = new Color (58, 106, 150);
    Color gradient3 = new Color (95, 151, 203);
    Color gradient4 = new Color (130, 187, 239);
    Color gradient5 = new Color (158, 205, 248);

    // Main Menu Color Variables
    Color mainMenuTextBox = new Color (214, 223, 255);
    Color mainMenuTextBox2 = new Color (232, 237, 255);
    Color mainMenuTextBox3 = new Color (240, 243, 255);

    public void splashScreen ()  // This is the public 'splashScreen' method; it contains the various constructors related to the execution of the splash screen.
    {
	SplashScreen s = new SplashScreen (c); // This line of code is creating a new 'SplashScreen' object.
	WordsSeperate o = new WordsSeperate (c); // This line of code is creating a new 'WordsSeperate' object.
	SnowmanMovement m = new SnowmanMovement (c); // This line of code is creating a new 'SnowmanMovement' obkect.
	Snowflakes f = new Snowflakes (c); // This line of code is creating a new 'Snowflakes' obkect.
	o.start (); // This starts the animation(s) for the movement of the words.
	m.start (); // This starts the animation(s) for the movement of the snowman.
	f.start (); // This starts the animation(s) for the movement of the snowflakes.
    } // This is the ending bracket of the public 'splashScreen' method.


    public void mainMenu ()  // This is the public 'mainMenu' method, which features the main menu of our program.
    {
	c.setColor (gradient1); // This block of code is creating the background of the main menu screen.
	c.fillRect (0, 0, 640, 100);
	c.setColor (gradient2);
	c.fillRect (0, 100, 640, 100);
	c.setColor (gradient3);
	c.fillRect (0, 200, 640, 100);
	c.setColor (gradient4);
	c.fillRect (0, 300, 640, 100);
	c.setColor (gradient5);
	c.fillRect (0, 400, 640, 100);

	c.setColor (mainMenuTextBox); // This block of code is creating the text boxes on the main menu screen.
	c.fillRect (59, 52, 522, 400);
	c.setColor (mainMenuTextBox2);
	c.fillRect (69, 62, 502, 380);
	c.setColor (mainMenuTextBox3);
	c.fillRect (79, 72, 482, 360);

	c.setColor (gradient1); // This block of code is creating the 'title' and 'subtitle' text on the screen.
	c.setFont (new Font ("Segoe Script", Font.PLAIN, 50));
	c.drawString ("winter", 227, 134);
	c.setFont (new Font ("Brush Script MT", Font.PLAIN, 90));
	c.drawString ("word puzzles", 137, 198);

	c.setColor (Color.white); // This block of code is adding two 'accents' of white on the screen.
	c.fillRect (129, 235, 385, 5);
	c.fillRect (129, 395, 385, 5);

	c.setColor (gradient1); // This block of code is creating the main text to be read on the main menu screen.
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 16));
	c.drawString ("Welcome to our winter-themed word puzzle,", 152, 271);
	c.drawString ("featuring many exciting word searches!", 175, 291);
	c.drawString ("Press 'c' to commence our puzzle!", 193, 316);
	c.drawString ("Press 'i' for instructions.", 235, 336);
	c.drawString ("Press 'q' to quit.", 263, 356);
	c.drawString ("Press 's' for scoreboard.", 236, 376);

	///////// SNOWFLAKES: /////////

	// Snowflake #1
	c.setColor (Color.white);
	int[] xPoints = {39, 44, 44};
	int[] yPoints = {122, 116, 127};
	int numPoints = 3;
	c.fillPolygon (xPoints, yPoints, numPoints); // Each custom shape was used to create the 'ends' of the four rectangles that compose the main body of the snowflake.

	c.setColor (Color.white);
	int[] xPoints1 = {39, 44, 44};
	int[] yPoints1 = {158, 152, 163};
	int numPoints1 = 3;
	c.fillPolygon (xPoints1, yPoints1, numPoints1);

	c.setColor (Color.white);
	int[] xPoints2 = {81, 81, 86};
	int[] yPoints2 = {116, 127, 122};
	int numPoints2 = 3;
	c.fillPolygon (xPoints2, yPoints2, numPoints2);

	c.setColor (Color.white);
	int[] xPoints3 = {81, 81, 86};
	int[] yPoints3 = {153, 164, 159};
	int numPoints3 = 3;
	c.fillPolygon (xPoints3, yPoints3, numPoints3);

	c.setColor (Color.white); // These two for loops were utilized to draw several thick white lines beside each other, to create the 'illusion' that we drew a rectangle.
	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.drawLine (59 + i, 112, 59 + i, 168);
	    c.drawLine (34, 137 + i, 90, 137 + i);
	}
	for (int i = 0 ; i <= 9 ; i++)
	{

	    c.drawLine (44, 118 + i, 80, 153 + i);
	    c.drawLine (80, 118 + i, 44, 153 + i);
	}

	// Snowflake #2
	c.setColor (Color.white);
	int[] xPoints4 = {79, 84, 84};
	int[] yPoints4 = {42, 36, 47};
	int numPoints4 = 3;
	c.fillPolygon (xPoints4, yPoints4, numPoints4); // Each custom shape was used to create the 'ends' of the four rectangles that compose the main body of the snowflake.

	c.setColor (Color.white);
	int[] xPoints5 = {79, 84, 84};
	int[] yPoints5 = {78, 72, 83};
	int numPoints5 = 3;
	c.fillPolygon (xPoints5, yPoints5, numPoints5);

	c.setColor (Color.white);
	int[] xPoints6 = {121, 121, 126};
	int[] yPoints6 = {36, 47, 42};
	int numPoints6 = 3;
	c.fillPolygon (xPoints6, yPoints6, numPoints6);

	c.setColor (Color.white);
	int[] xPoints7 = {121, 121, 126};
	int[] yPoints7 = {73, 84, 79};
	int numPoints7 = 3;
	c.fillPolygon (xPoints7, yPoints7, numPoints7);

	c.setColor (Color.white); // These two for loops were utilized to draw several thick white lines beside each other, to create the 'illusion' that we drew a rectangle.
	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.drawLine (99 + i, 32, 99 + i, 88);
	    c.drawLine (74, 57 + i, 130, 57 + i);
	}
	for (int i = 0 ; i <= 9 ; i++)
	{

	    c.drawLine (84, 38 + i, 120, 73 + i);
	    c.drawLine (120, 38 + i, 84, 73 + i);
	}

	// Snowflake #3
	c.setColor (Color.white);
	int[] xPoints8 = {439, 444, 444};
	int[] yPoints8 = {42, 36, 47};
	int numPoints8 = 3;
	c.fillPolygon (xPoints8, yPoints8, numPoints8); // Each custom shape was used to create the 'ends' of the four rectangles that compose the main body of the snowflake.

	c.setColor (Color.white);
	int[] xPoints9 = {439, 444, 444};
	int[] yPoints9 = {78, 72, 83};
	int numPoints9 = 3;
	c.fillPolygon (xPoints9, yPoints9, numPoints9);

	c.setColor (Color.white);
	int[] xPoints10 = {481, 481, 486};
	int[] yPoints10 = {36, 47, 42};
	int numPoints10 = 3;
	c.fillPolygon (xPoints10, yPoints10, numPoints10);

	c.setColor (Color.white);
	int[] xPoints11 = {481, 481, 486};
	int[] yPoints11 = {73, 84, 79};
	int numPoints11 = 3;
	c.fillPolygon (xPoints11, yPoints11, numPoints11);

	c.setColor (Color.white); // These two for loops were utilized to draw several thick white lines beside each other, to create the 'illusion' that we drew a rectangle.
	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.drawLine (459 + i, 32, 459 + i, 88);
	    c.drawLine (434, 57 + i, 490, 57 + i);
	}
	for (int i = 0 ; i <= 9 ; i++)
	{

	    c.drawLine (444, 38 + i, 480, 73 + i);
	    c.drawLine (480, 38 + i, 444, 73 + i);
	}

	// Snowflake #4
	c.setColor (Color.white);
	int[] xPoints12 = {502, 507, 507};
	int[] yPoints12 = {118, 112, 123};
	int numPoints12 = 3;
	c.fillPolygon (xPoints12, yPoints12, numPoints12); // Each custom shape was used to create the 'ends' of the four rectangles that compose the main body of the snowflake.

	int[] xPoints13 = {502, 507, 507};
	int[] yPoints13 = {146, 140, 151};
	int numPoints13 = 3;
	c.fillPolygon (xPoints13, yPoints13, numPoints13);

	int[] xPoints14 = {535, 535, 540};
	int[] yPoints14 = {113, 124, 119};
	int numPoints14 = 3;
	c.fillPolygon (xPoints14, yPoints14, numPoints14);

	int[] xPoints15 = {536, 536, 541};
	int[] yPoints15 = {141, 152, 147};
	int numPoints15 = 3;
	c.fillPolygon (xPoints15, yPoints15, numPoints15);

	c.setColor (Color.white); // These two for loops were utilized to draw several thick white lines beside each other, to create the 'illusion' that we drew a rectangle.
	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.drawLine (518 + i, 109, 518 + i, 154);
	    c.drawLine (498, 128 + i, 545, 128 + i);
	}
	c.setColor (Color.white);
	for (int i = 0 ; i <= 9 ; i++)
	{

	    c.drawLine (507, 114 + i, 535, 141 + i);
	    c.drawLine (535, 114 + i, 507, 141 + i);
	}

	// Snowflake #5
	c.setColor (Color.white);
	int[] xPoints16 = {149, 154, 154};
	int[] yPoints16 = {93, 87, 98};
	int numPoints16 = 3;
	c.fillPolygon (xPoints16, yPoints16, numPoints16); // Each custom shape was used to create the 'ends' of the four rectangles that compose the main body of the snowflake.

	int[] xPoints17 = {149, 154, 154};
	int[] yPoints17 = {121, 115, 126};
	int numPoints17 = 3;
	c.fillPolygon (xPoints17, yPoints17, numPoints17);

	int[] xPoints18 = {182, 182, 187};
	int[] yPoints18 = {88, 99, 94};
	int numPoints18 = 3;
	c.fillPolygon (xPoints18, yPoints18, numPoints18);

	int[] xPoints19 = {183, 183, 188};
	int[] yPoints19 = {116, 127, 122};
	int numPoints19 = 3;
	c.fillPolygon (xPoints19, yPoints19, numPoints19);

	c.setColor (Color.white); // These two for loops were utilized to draw several thick white lines beside each other, to create the 'illusion' that we drew a rectangle.
	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.drawLine (165 + i, 84, 165 + i, 129);
	    c.drawLine (145, 103 + i, 192, 103 + i);
	}
	c.setColor (Color.white);
	for (int i = 0 ; i <= 9 ; i++)
	{

	    c.drawLine (154, 89 + i, 182, 116 + i);
	    c.drawLine (182, 89 + i, 154, 116 + i);
	}

	// Snowflake #6
	c.setColor (Color.white);
	int[] xPoints20 = {552, 557, 557};
	int[] yPoints20 = {68, 62, 73};
	int numPoints20 = 3;
	c.fillPolygon (xPoints20, yPoints20, numPoints20); // Each custom shape was used to create the 'ends' of the four rectangles that compose the main body of the snowflake.

	int[] xPoints21 = {552, 557, 557};
	int[] yPoints21 = {96, 90, 101};
	int numPoints21 = 3;
	c.fillPolygon (xPoints21, yPoints21, numPoints21);

	int[] xPoints22 = {585, 585, 590};
	int[] yPoints22 = {63, 74, 69};
	int numPoints22 = 3;
	c.fillPolygon (xPoints22, yPoints22, numPoints22);

	int[] xPoints23 = {586, 586, 591};
	int[] yPoints23 = {91, 102, 97};
	int numPoints23 = 3;
	c.fillPolygon (xPoints23, yPoints23, numPoints23);

	c.setColor (Color.white); // These two for loops were utilized to draw several thick white lines beside each other, to create the 'illusion' that we drew a rectangle.
	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.drawLine (568 + i, 59, 568 + i, 104);
	    c.drawLine (548, 78 + i, 595, 78 + i);
	}
	c.setColor (Color.white);
	for (int i = 0 ; i <= 9 ; i++)
	{

	    c.drawLine (557, 64 + i, 585, 91 + i);
	    c.drawLine (585, 64 + i, 557, 91 + i);
	}

	menu = " "; // Here, the value of menu is equivalent to ' '.

	// This block of code checks the letter inputted by the user, to progress to the next screen.
	while (!menu.equals ("i") && !menu.equals ("s") && !menu.equals ("q") && !menu.equals ("c")) // While a valid option isn't chosen by the user...
	{
	    menu = ("" + c.getChar ()).toLowerCase ();
	    ;
	    if (menu.equals ("i")) // If they click 'i', they progress to instructions.
	    {
		instructions ();
	    }
	    else if (menu.equals ("q")) //  If they click 'q', they progress to the quit screen.
	    {
		goodbye ();
	    }
	    else if (menu.equals ("s")) // If they click 's', they progress to the scoreboard.
	    {
		scoreboard ();
	    }
	    else if (menu.equals ("c")) // If they click 'c', they progress to the next screen of the puzzle (where they are asked for the difficulty).
	    {
		askName ();
	    }
	    else
	    {
		new Message ("Please press either 'c', 'i', 'q', or 's'");
	    }
	}
    } // This is the ending bracket of the public 'mainMenu' method.


    private void scoreboard ()  // This is the private scoreboard method, which displays our scoreboard.
    {
	String choice = "x";
	int[] topScore = { - 1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	String[] topName = {"eeeeeeeeeeeeeeeee", "eeeeeeeeeeeeeeeee", "eeeeeeeeeeeeeeeee", "eeeeeeeeeeeeeeeee", "eeeeeeeeeeeeeeeee", "eeeeeeeeeeeeeeeee", "eeeeeeeeeeeeeeeee", "eeeeeeeeeeeeeeeee", "eeeeeeeeeeeeeeeee", "eeeeeeeeeeeeeeeee"};
	String[] topMode = {"x", "x", "x", "x", "x", "x", "x", "x", "x", "x"};
	// ^^ These three arrays are being utilized to aid with displaying the topName, topScore, and topMode (essentially the order of the scores).

	c.setColor (gradient1); // This block of code displays our gradient background.
	c.fillRect (0, 0, 640, 500);
	c.setColor (gradient2);
	c.fillRect (0, 83, 640, 500);
	c.setColor (gradient3);
	c.fillRect (20, 103, 593, 373);
	c.setColor (gradient4);
	c.fillRect (39, 122, 556, 335);

	c.setColor (gradient5); // This displays our main blue background.
	c.fillRect (54, 138, 523, 303);

	c.setColor (Color.white); // This displays the column seperators.
	c.fillRect (90, 191, 451, 5);
	c.fillRect (90, 406, 451, 5);
	c.fillRect (219, 160, 5, 250);
	c.fillRect (386, 160, 5, 250);

	c.setColor (gradient1); // This displays the subtitle text.
	c.setFont (new Font ("Berlin Sans FB", Font.PLAIN, 28));
	c.drawString ("name", 115, 179);
	c.drawString ("score", 275, 179);
	c.drawString ("level", 438, 179);

	c.setColor (Color.white); // This displays the title text.
	c.setFont (new Font ("Britannic Bold", Font.BOLD, 50));
	c.drawString ("SCOREBOARD", 170, 58);

	c.setColor (gradient1); // This displays the tiny text at the bottom.
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 13));
	c.drawString ("Press 'c' to clear the scores, or press 'm' to return to the main menu.", 110, 430);

	try
	{
	    // This creates the scoreboard file
	    File scoring = new File("scoreboard.txt");
	    scoring.createNewFile(); 
	    
	    BufferedReader s = new BufferedReader (new FileReader (scoring)); // We are reading and storing the scores in a file.

	    String tempName; // This represents the name of the user.
	    int tempNum; // This represents the score of the user.
	    String tempMode; // This represents the mode (Normal or Hard).

	    // This block of code finds and sorts the top ten highest scores on the scoreboard.
	    while ((tempName = s.readLine ()) != null)
	    {
		tempNum = Integer.parseInt (s.readLine ());

		tempMode = s.readLine ();
		for (int k = 0 ; k < 10 ; k++)
		{
		    if (tempNum > topScore [k])
		    {
			for (int g = topScore.length - 1 ; g > k ; g--)
			{
			    topScore [g] = topScore [g - 1];
			    topName [g] = topName [g - 1];
			    topMode [g] = topMode [g - 1];
			}

			topName [k] = tempName;
			topScore [k] = tempNum;
			topMode [k] = tempMode;

			break;
		    }
		}
	    }

	    s.close (); // This closes the file.

	    for (int i = 0 ; i < 10 ; i++) // This block of code displays the name, score, and level of the user on the scoreboard.
	    {
		if (!topMode [i].equals ("x"))
		{
		    c.setFont (new Font ("Berlin Sans FB", Font.BOLD, 13));
		    c.drawString (topName [i], 105, 215 + i * 20);

		    c.setFont (new Font ("Berlin Sans FB", Font.PLAIN, 13));
		    c.drawString ("" + topScore [i], 301, 215 + i * 20);
		    c.drawString (topMode [i], 463, 215 + i * 20);
		}
	    }

	    while (!choice.equals ("m")) // If the user chooses not to go back to the main menu, then...
	    {
		choice = ("" + c.getChar ()).toLowerCase (); // Here, we are obtaining input from the user.
		if (choice.equals ("c")) // If the user clicks 'c', we will clear the scores on the screen.
		{
		    FileWriter f = new FileWriter (scoring);

		    f.write (""); // We are removing the scores from the file.

		    c.setColor (gradient5); // This erases the scores on the screen.
		    c.fillRect (70, 200, 147, 203);
		    c.fillRect (240, 200, 137, 203);
		    c.fillRect (450, 200, 107, 203);

		    f.close (); // This closes the file.
		}
		else if (!choice.equals ("m"))
		{
		    new Message ("Please press either 'c' or 'm'");
		}
	    }

	    mainMenu (); // If the user clicked 'm', we leave the scores as is, and return to the main menu.
	}
	catch (IOException e)
	{
	    new Message ("Could not open the file scoreboard.txt"); // This message is displayed if there is an issue with opening the file.
	}
    } // This is the ending bracket of the method.


    private void instructions ()  // This is the private 'instructions' method, which displays the 'instructions' screen of our program.
    {
	c.setColor (gradient5); // This block of code produces the gradient background of the instructions screen.
	c.fillRect (0, 0, 640, 100);
	c.setColor (gradient4);
	c.fillRect (0, 100, 640, 100);
	c.setColor (gradient3);
	c.fillRect (0, 200, 640, 100);
	c.setColor (gradient2);
	c.fillRect (0, 300, 640, 100);
	c.setColor (gradient1);
	c.fillRect (0, 400, 640, 100);

	c.setColor (Color.white); // This block of code produces the white text box to be displayed on the instructions screen.
	c.fillRect (59, 52, 522, 400);

	c.setColor (gradient1); // This block of code produces the title text on the instructions screen.
	c.setFont (new Font ("Segoe Script", Font.PLAIN, 50));
	c.drawString ("instructions", 158, 133);

	c.setColor (gradient1); // This block of code produces the main text to be displayed on the screen.
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 16));
	c.drawString ("This program will feature 6 different word search", 135, 214);
	c.drawString ("puzzles, that can be played timed or untimed.", 149, 239);
	c.drawString ("You will be prompted to choose one of our levels of", 120, 269);
	c.drawString ("        difficulty, <<Normal>> or <<Hard>>, and will", 99, 294);
	c.drawString ("receive a winter-themed search! You can quit anytime", 118, 319);
	c.drawString ("during the puzzle, if you give up. After you are done with", 102, 344);
	c.drawString ("the puzzle, you will be able to view your final score!", 122, 369);
	c.drawString ("Press any key to continue!", 226, 399);

	c.setColor (gradient1); // This line of code creates a blue 'accent' under the title.
	c.fillRect (193, 165, 260, 3);

	///////// SNOWFLAKES: /////////

	// Snowflake #1
	c.setColor (gradient1);
	int[] xPoints = {39, 44, 44};
	int[] yPoints = {122, 116, 127};
	int numPoints = 3;
	c.fillPolygon (xPoints, yPoints, numPoints); // Each custom shape was utilized to fill in the gaps present on the four rectangles comprising the snowflake.

	c.setColor (gradient1);
	int[] xPoints1 = {39, 44, 44};
	int[] yPoints1 = {158, 152, 163};
	int numPoints1 = 3;
	c.fillPolygon (xPoints1, yPoints1, numPoints1);

	c.setColor (gradient1);
	int[] xPoints2 = {81, 81, 86};
	int[] yPoints2 = {116, 127, 122};
	int numPoints2 = 3;
	c.fillPolygon (xPoints2, yPoints2, numPoints2);

	c.setColor (gradient1);
	int[] xPoints3 = {81, 81, 86};
	int[] yPoints3 = {153, 164, 159};
	int numPoints3 = 3;
	c.fillPolygon (xPoints3, yPoints3, numPoints3);

	c.setColor (gradient1); // These two for loops create several THICK lines beside each other, to create the 'illusion' that the snowflake is composed of rectangles.
	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.drawLine (59 + i, 112, 59 + i, 168);
	    c.drawLine (34, 137 + i, 90, 137 + i);
	}
	for (int i = 0 ; i <= 9 ; i++)
	{

	    c.drawLine (44, 118 + i, 80, 153 + i);
	    c.drawLine (80, 118 + i, 44, 153 + i);
	}

	// Snowflake #2
	c.setColor (gradient2);
	int[] xPoints4 = {149, 154, 154};
	int[] yPoints4 = {33, 27, 38};
	int numPoints4 = 3;
	c.fillPolygon (xPoints4, yPoints4, numPoints4); // Each custom shape was utilized to fill in the gaps present on the four rectangles comprising the snowflake.

	int[] xPoints5 = {149, 154, 154};
	int[] yPoints5 = {61, 54, 66};
	int numPoints5 = 3;
	c.fillPolygon (xPoints5, yPoints5, numPoints5);

	int[] xPoints6 = {182, 182, 187};
	int[] yPoints6 = {28, 39, 34};
	int numPoints6 = 3;
	c.fillPolygon (xPoints6, yPoints6, numPoints6);

	int[] xPoints7 = {183, 183, 188};
	int[] yPoints7 = {56, 67, 62};
	int numPoints7 = 3;
	c.fillPolygon (xPoints7, yPoints7, numPoints7);

	c.setColor (gradient2); // These two for loops create several THICK lines beside each other, to create the 'illusion' that the snowflake is composed of rectangles.
	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.drawLine (165 + i, 24, 165 + i, 69);
	    c.drawLine (145, 43 + i, 192, 43 + i);
	}
	c.setColor (gradient2);
	for (int i = 0 ; i <= 9 ; i++)
	{

	    c.drawLine (154, 29 + i, 182, 56 + i);
	    c.drawLine (182, 29 + i, 154, 56 + i);
	}

	// Snowflake #3
	c.setColor (gradient2);
	int[] xPoints8 = {554, 559, 559};
	int[] yPoints8 = {177, 171, 182};
	int numPoints8 = 3;
	c.fillPolygon (xPoints8, yPoints8, numPoints8); // Each custom shape was utilized to fill in the gaps present on the four rectangles comprising the snowflake.

	c.setColor (gradient2);
	int[] xPoints9 = {554, 559, 559};
	int[] yPoints9 = {213, 207, 218};
	int numPoints9 = 3;
	c.fillPolygon (xPoints9, yPoints9, numPoints9);

	c.setColor (gradient2);
	int[] xPoints10 = {596, 596, 601};
	int[] yPoints10 = {171, 182, 177};
	int numPoints10 = 3;
	c.fillPolygon (xPoints10, yPoints10, numPoints10);

	c.setColor (gradient2);
	int[] xPoints11 = {596, 596, 601};
	int[] yPoints11 = {208, 219, 214};
	int numPoints11 = 3;
	c.fillPolygon (xPoints11, yPoints11, numPoints11);

	c.setColor (gradient2); // These two for loops create several THICK lines beside each other, to create the 'illusion' that the snowflake is composed of rectangles.
	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.drawLine (574 + i, 167, 574 + i, 223);
	    c.drawLine (549, 192 + i, 605, 192 + i);
	}
	for (int i = 0 ; i <= 9 ; i++)
	{

	    c.drawLine (559, 173 + i, 595, 208 + i);
	    c.drawLine (595, 173 + i, 559, 208 + i);
	}

	// Snowflake #4
	c.setColor (gradient1);
	int[] xPoints12 = {512, 517, 517};
	int[] yPoints12 = {43, 37, 48};
	int numPoints12 = 3;
	c.fillPolygon (xPoints12, yPoints12, numPoints12); // Each custom shape was utilized to fill in the gaps present on the four rectangles comprising the snowflake.

	int[] xPoints13 = {512, 517, 517};
	int[] yPoints13 = {71, 65, 76};
	int numPoints13 = 3;
	c.fillPolygon (xPoints13, yPoints13, numPoints13);

	int[] xPoints14 = {545, 545, 550};
	int[] yPoints14 = {38, 49, 44};
	int numPoints14 = 3;
	c.fillPolygon (xPoints14, yPoints14, numPoints14);

	int[] xPoints15 = {546, 546, 551};
	int[] yPoints15 = {66, 77, 72};
	int numPoints15 = 3;
	c.fillPolygon (xPoints15, yPoints15, numPoints15);

	c.setColor (gradient1); // These two for loops create several THICK lines beside each other, to create the 'illusion' that the snowflake is composed of rectangles.
	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.drawLine (528 + i, 34, 528 + i, 79);
	    c.drawLine (508, 53 + i, 555, 53 + i);
	}
	c.setColor (gradient1);
	for (int i = 0 ; i <= 9 ; i++)
	{

	    c.drawLine (517, 39 + i, 545, 66 + i);
	    c.drawLine (545, 39 + i, 517, 66 + i);
	}

	c.getChar (); // Here, we are asking the user to enter any key, and which key they click....
	mainMenu (); // ... will allow them to progress to the main menu.
    } // This is the ending bracket of the private 'instructions' method.


    // Goodbye Color Variables
    Color goodbyeTextBox = new Color (217, 239, 246);
    Color goodbyeTextBox2 = new Color (235, 247, 250);
    Color goodbyeTextBox3 = new Color (245, 253, 255);

    public void goodbye ()  // This is the public 'goodbye' method, which displays the final ending screen of our program, when the user finishes the program.
    {
	c.setColor (gradient1); // This block of code is creating the background gradient of the goodbye screen.
	c.fillRect (0, 0, 640, 100);
	c.setColor (gradient2);
	c.fillRect (0, 100, 640, 100);
	c.setColor (gradient3);
	c.fillRect (0, 200, 640, 100);
	c.setColor (gradient4);
	c.fillRect (0, 300, 640, 100);
	c.setColor (gradient5);
	c.fillRect (0, 400, 640, 100);
	c.setColor (goodbyeTextBox);
	c.fillRect (59, 52, 522, 400);
	c.setColor (goodbyeTextBox2);
	c.fillRect (69, 62, 502, 380);
	c.setColor (goodbyeTextBox3);
	c.fillRect (79, 72, 482, 360);
	c.setColor (Color.white);
	c.fillRect (93, 82, 454, 337);

	c.setColor (gradient1); // This block of code is creating the title text of the goodbye screen.
	c.setFont (new Font ("Segoe Script", Font.PLAIN, 50));
	c.drawString ("thanks", 230, 150);
	c.setFont (new Font ("Brush Script MT", Font.PLAIN, 90));
	c.drawString ("for playing!", 145, 218);

	c.setColor (gradient1); // This block of code is creating the main text on the goodbye screen.
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 16));
	c.drawString ("Thank you for choosing to play through", 160, 273);
	c.drawString ("our winter-themed word puzzles!", 183, 293);
	c.drawString ("We hope you enjoyed our 'winter", 182, 323);
	c.drawString ("wonderland' delight! We can't wait to", 168, 343);
	c.drawString ("see you again soon!", 230, 363);
	c.drawString ("Press any key to exit our program, " + name + "!", 165, 393);

	///////// PRESENTS: /////////

	// Present #1
	c.setColor (new Color (247, 159, 175)); // This block of code is creating the layer of the top portion of the pink present.
	int[] xPoints = {83, 37, 83, 129};
	int[] yPoints = {369, 386, 404, 386};
	int numPoints = 4;
	c.fillPolygon (xPoints, yPoints, numPoints);

	c.setColor (new Color (243, 152, 165)); // This block of code is creating the lighest layer of the main body of the pink present.
	int[] xPoints1 = {37, 83, 83, 37};
	int[] yPoints1 = {386, 404, 461, 444};
	int numPoints1 = 4;
	c.fillPolygon (xPoints1, yPoints1, numPoints1);

	c.setColor (new Color (230, 144, 155)); // This block of code is creating the lightest layer of the main body of the pink present.
	int[] xPoints10 = {83, 129, 129, 83};
	int[] yPoints10 = {404, 386, 444, 461};
	int numPoints10 = 4;
	c.fillPolygon (xPoints10, yPoints10, numPoints10);

	c.setColor (new Color (230, 33, 39)); // This block of code is creating the red strips on the sides of the present.
	int[] xPoints2 = {53, 53, 66, 66};
	int[] yPoints2 = {393, 450, 455, 398};
	int numPoints2 = 4;
	c.fillPolygon (xPoints2, yPoints2, numPoints2);
	int[] xPoints3 = {114, 114, 102, 102};
	int[] yPoints3 = {393, 450, 455, 398};
	int numPoints3 = 4;
	c.fillPolygon (xPoints3, yPoints3, numPoints3);

	c.setColor (new Color (183, 27, 32)); //  // This block of code is creating the red ribbon strips on the TOP of the present.
	int[] xPoints4 = {53, 66, 83, 102, 114, 83};
	int[] yPoints4 = {393, 398, 391, 398, 393, 381};
	int numPoints4 = 6;
	c.fillPolygon (xPoints4, yPoints4, numPoints4);

	c.setColor (new Color (230, 33, 39)); // This block of code is creating the large left curve of the ribbon on the present.
	int[] xPoints6 = {55, 56, 59, 62, 66, 72, 75, 79, 79, 75, 72, 66, 62, 59, 56, 55};
	int[] yPoints6 = {371, 367, 365, 364, 364, 367, 371, 377, 388, 382, 379, 377, 378, 378, 380, 382, 384};
	int numPoints6 = 16;
	c.fillPolygon (xPoints6, yPoints6, numPoints6);

	c.setColor (new Color (143, 5, 8)); // This block of code is creating the small left curve of the ribbon on the present.
	int[] xPoints7 = {49, 56, 57, 58, 59, 62, 66, 72, 75, 79, 75, 72, 66, 62, 59, 56, 55};
	int[] yPoints7 = {383, 382, 378, 378, 378, 378, 377, 379, 382, 388, 388, 388, 387, 385, 383};
	int numPoints7 = 15;
	c.fillPolygon (xPoints7, yPoints7, numPoints7);

	c.setColor (new Color (143, 5, 8)); // This block of code is creating the small right curve of the ribbon of the present.
	int[] xPoints8 = {114, 112, 111, 110, 109, 106, 102, 96, 93, 89, 93, 96, 102, 106, 109, 112, 113};
	int[] yPoints8 = {383, 382, 378, 378, 378, 378, 377, 379, 382, 388, 388, 388, 387, 385, 383};
	int numPoints8 = 15;
	c.fillPolygon (xPoints8, yPoints8, numPoints8);

	c.setColor (new Color (230, 33, 39)); // This block of code is creating the large right curve of the ribbon on the present.
	int[] xPoints9 = {113, 112, 109, 106, 102, 96, 93, 89, 89, 93, 96, 102, 106, 109, 112, 113};
	int[] yPoints9 = {371, 367, 365, 364, 364, 367, 371, 377, 388, 382, 379, 377, 378, 378, 380, 382, 384};
	int numPoints9 = 16;
	c.fillPolygon (xPoints9, yPoints9, numPoints9);

	c.setColor (new Color (248, 72, 72)); // This block of code is creating the 'square' present on the centre of the pink present.
	int[] xPoints5 = {79, 78, 78, 79, 89, 90, 90, 89};
	int[] yPoints5 = {376, 377, 387, 388, 388, 387, 377, 376};
	int numPoints5 = 8;
	c.fillOval (78, 376, 13, 14);

	// Present #2
	c.setColor (new Color (48, 171, 60)); // This block of code is creating the layer located on TOP of the main body of the present.
	int[] xPoints11 = {139, 169, 169, 139};
	int[] yPoints11 = {432, 443, 481, 470};
	int numPoints11 = 4;
	c.fillPolygon (xPoints11, yPoints11, numPoints11);

	c.setColor (new Color (26, 151, 59)); // This block of code is creating the darkest layer on the main body of the present.
	int[] xPoints12 = {169, 199, 199, 169};
	int[] yPoints12 = {443, 432, 470, 481};
	int numPoints12 = 4;
	c.fillPolygon (xPoints12, yPoints12, numPoints12);

	c.setColor (new Color (63, 185, 59)); // This block of code is creating the lightest layer on the left side of the main body of the present.
	int[] xPoints13 = {169, 139, 169, 199};
	int[] yPoints13 = {421, 432, 443, 432};
	int numPoints13 = 4;
	c.fillPolygon (xPoints13, yPoints13, numPoints13);

	c.setColor (new Color (251, 197, 18)); // This block of code is creating the strips present on the MAIN BODY of the green present.
	int[] xPoints14 = {149, 149, 158, 158};
	int[] yPoints14 = {436, 473, 477, 439};
	int numPoints14 = 4;
	c.fillPolygon (xPoints14, yPoints14, numPoints14);
	int[] xPoints15 = {181, 181, 189, 189};
	int[] yPoints15 = {439, 477, 473, 436};
	int numPoints15 = 4;
	c.fillPolygon (xPoints15, yPoints15, numPoints15);

	c.setColor (new Color (248, 167, 22)); // This block of code is creating the strips present on the very TOP of the green present.
	int[] xPoints16 = {149, 158, 169, 181, 189, 169, 149};
	int[] yPoints16 = {436, 439, 434, 439, 436, 428, 436};
	int numPoints16 = 7;
	c.fillPolygon (xPoints16, yPoints16, numPoints16);

	c.setColor (new Color (251, 197, 18)); // This block of code is creating the large left curve on top of the present.
	int[] xPoints18 = {151, 153, 156, 158, 160, 161, 163, 164, 167, 167, 164, 163, 161, 160, 158, 156, 153, 151, 150};
	int[] yPoints18 = {419, 418, 417, 417, 419, 420, 421, 423, 426, 433, 430, 429, 427, 426, 426, 426, 427, 429, 430};
	int numPoints18 = 19;
	c.fillPolygon (xPoints18, yPoints18, numPoints18);

	c.setColor (new Color (247, 154, 24)); // This block of code is creating the small left curve on top of the present.
	int[] xPoints19 = {150, 153, 156, 158, 160, 161, 163, 164, 167, 164, 163, 161, 160, 158, 156, 153, 150};
	int[] yPoints19 = {430, 427, 426, 426, 426, 427, 429, 430, 433, 433, 433, 433, 433, 433, 433, 432, 430};
	int numPoints19 = 17;
	c.fillPolygon (xPoints19, yPoints19, numPoints19);

	c.setColor (new Color (251, 197, 18)); // This block of code is creating the large right curve on the top of the present.
	int[] xPoints20 = {187, 185, 182, 180, 178, 177, 175, 174, 171, 171, 174, 175, 177, 178, 180, 182, 185, 187, 188};
	int[] yPoints20 = {419, 418, 417, 417, 419, 420, 421, 423, 426, 433, 430, 429, 427, 426, 426, 426, 427, 429, 430};
	int numPoints20 = 19;
	c.fillPolygon (xPoints20, yPoints20, numPoints20);

	c.setColor (new Color (247, 154, 24)); // This block of code is creating the small right curve on the top of the present.
	int[] xPoints21 = {188, 185, 182, 180, 178, 177, 175, 174, 171, 174, 175, 177, 178, 180, 182, 185, 188};
	int[] yPoints21 = {430, 427, 426, 426, 426, 427, 429, 430, 433, 433, 433, 433, 433, 433, 433, 432, 430};
	int numPoints21 = 17;
	c.fillPolygon (xPoints21, yPoints21, numPoints21);

	c.setColor (new Color (253, 221, 15)); // This block of code is creating the 'square' present on the centre of the green present.
	c.fillOval (165, 425, 10, 10);

	c.setColor (gradient2); // This block of code creates a series of dark blue, and light blue stars.
	c.fillStar (539, 22, 74, 70);
	c.fillStar (37, 270, 74, 70);
	c.setColor (gradient3);
	c.fillStar (473, 19, 51, 48);
	c.fillStar (62, 207, 51, 48);
	c.setColor (gradient4);
	c.fillStar (418, 46, 39, 36);
	c.fillStar (46, 151, 39, 36);
	c.setColor (gradient5);
	c.fillStar (375, 33, 27, 26);
	c.fillStar (71, 109, 27, 26);

	c.getChar (); // The user then clicks any key to...
	c.close (); // ...to quit the program. Goodbye!
    } // This is the ending bracket of the public 'goodbye' method.


    private void askDifficulty ()  // This is the private 'askDifficulty' method, which will ask our user to choose the difficulty level for their puzzle.
    {
	c.setColor (gradient5); // This block of code will produce the background gradient of the ask difficulty screen.
	c.fillRect (0, 0, 640, 100);
	c.setColor (gradient4);
	c.fillRect (0, 100, 640, 100);
	c.setColor (gradient3);
	c.fillRect (0, 200, 640, 100);
	c.setColor (gradient2);
	c.fillRect (0, 300, 640, 100);
	c.setColor (gradient1);
	c.fillRect (0, 400, 640, 100);

	c.setColor (Color.white); // This block of code adds a white text box to the screen.
	c.fillRect (59, 52, 522, 400);

	c.setColor (gradient1); // This creates the title text of the screen.
	c.setFont (new Font ("Segoe Script", Font.PLAIN, 46));
	c.drawString ("are you up for a", 113, 133);
	c.drawString ("challenge?", 187, 186);

	c.setColor (gradient1); // This creates the main body text of the screen.
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 19)); //bodoni mt
	c.drawString ("This puzzle has ", 245, 264);
	c.drawString ("two levels of difficulty:", 217, 294);
	c.drawString ("  Normal and Hard.", 222, 324);
	c.drawString ("Please type which level of difficulty", 167, 368);
	c.drawString ("you prefer ('N' or 'H'):", 218, 397);

	c.setColor (gradient1); // This creates the blue 'accent' present on the screen.
	c.fillRect (213, 217, 200, 3);

	c.setColor (gradient5); // This block of code creates a series of blue stars!
	c.fillStar (20, 387, 87, 83);
	c.fillStar (81, 337, 53, 50);
	c.fillStar (79, 284, 35, 33);
	c.fillStar (64, 250, 22, 21);

	c.setColor (gradient1); // This block of code also creates a series of blue stars!
	c.fillStar (530, 19, 87, 83);
	c.fillStar (564, 126, 53, 50);
	c.fillStar (547, 200, 35, 33);
	c.fillStar (519, 239, 22, 21);

	difficulty = " "; // The value of difficulty is now set to ' '.

	while (!difficulty.toUpperCase ().equals ("N") || !difficulty.toUpperCase ().equals ("H"))
	{ // While the user does not enter a valid input...
	    difficulty = ("" + c.getChar ()).toUpperCase (); // Here, we are obtaining input from the user to choose their difficulty.

	    wordSearch = wordSearchGenerator (difficulty);

	    if (difficulty.equals ("N")) // If the user chooses the 'normal' difficulty setting...
	    {
		if (wordSearch == 1) // If the random generated number is equivalent to 1, the user will play the first word search.
		{
		    easySearch1 ();
		}
		else if (wordSearch == 2)  // If the random generated number is equal to 2, the user will play the second word search.
		{
		    easySearch2 ();
		}
		else if (wordSearch == 3)
		{
		    easySearch3 ();
		}
	    }
	    else if (difficulty.equals ("H"))  // If the user clicks 'H' for Hard, the following error message will pop up:
	    {
		if (wordSearch == 4) // If the random generated number is equivalent to 1, the user will play the first word search.
		{
		    hardSearch1 ();
		}
		else if (wordSearch == 5)  // If the random generated number is equal to 2, the user will play the second word search.
		{
		    hardSearch2 ();
		}
		else if (wordSearch == 6)
		{
		    hardSearch3 ();
		}
	    }
	    else
	    {
		new Message ("Please press either 'n' or 'h'");
	    }
	}
    } // This is the ending bracket of the private 'askDifficulty' method.


    private int wordSearchGenerator (String difficulty)  // This is the private 'wordSearchGenerator' method, which, as indicated, generates our random word searches.
    {
	if (difficulty.toUpperCase ().equals ("N"))
	{
	    return (int) (Math.random () * 3 + 1);
	}
	else
	{
	    return (int) (Math.random () * 3 + 4);
	}
    } // This is the ending bracket of the private 'wordSearchGenerator' method.


    // Easy Word Search #1 Colour Variables
    Color puzzleBg = new Color (98, 179, 212);
    Color puzzleSnow1 = new Color (212, 241, 244);
    Color puzzleSnow2 = new Color (130, 187, 239);
    Color puzzleSnow3 = new Color (95, 151, 203);
    Color wordsearch = new Color (255, 255, 255, 196);
    Color text = new Color (5, 68, 94);

    // Easy Word Search #1 Movement Variables (Used To Move Snowflakes)
    int fx = -1;
    int fy = 1;
    int f2x = 40;
    int f2y = 55;
    int f3x = -15;
    int f3y = 90;

    //  Easy Word Search #1 Coordinates For Snowflakes (In The Form Of Arrays)
    int[] flake1x = {561 + fx, 569 + fx, 537 + fx, 531 + fx};
    int[] flake1y = {32 + fy, 40 + fy, 72 + fy, 65 + fy};
    int[] flake2x = {537, 531, 561, 569};
    int[] flake2y = {32, 40, 72, 65};

    int[] flake3x = {561 + fx + f2x, 569 + fx + f2x, 537 + fx + f2x, 531 + fx + f2x};
    int[] flake3y = {32 + fy + f2y, 40 + fy + f2y, 72 + fy + f2y, 65 + fy + f2y};
    int[] flake4x = {537 + f2x, 531 + f2x, 561 + f2x, 569 + f2x};
    int[] flake4y = {32 + f2y, 40 + f2y, 72 + f2y, 65 + f2y};

    int[] flake5x = {561 + fx + f3x, 569 + fx + f3x, 537 + fx + f3x, 531 + fx + f3x};
    int[] flake5y = {32 + fy + f3y, 40 + fy + f3y, 72 + fy + f3y, 65 + fy + f3y};
    int[] flake6x = {537 + f3x, 531 + f3x, 561 + f3x, 569 + f3x};
    int[] flake6y = {32 + f3y, 40 + f3y, 72 + f3y, 65 + f3y};

    private void easySearch1 ()  // This is the private 'easySearch1' method, which displays and creates our first easy word search (relating to winter clothing).
    {
	// User Input Variables (Used To Store User Input)
	words = 0;

	temp = ""; // Here, temp is set to null.

	game = true; // Here, game is set to true

	String[] easyWords1 = {"MITTENS", "GLOVES", "BOOTS", "JACKET", "PARKA", "SCARF", "SOCKS", "SWEATER", "HAT", "TUNIC"}; // Within this array, we are storing the words that are present in the word search.
	String[] [] easyLetters1 = {{"R", "M", "Q", "P", "Z", "G", "L", " I", "V", "T"}, {"S", "F", " I", "Z", "A", "Q", "H", "H", "G", "U"}, {"W", "B", "A", "T", "T", "R", "H", "A", "L", "N"}, {"E", "W", "O", " I", "T", "E", "K", "T", "O", " I"}, {"A", "R", "J", "O", "A", "E", "G", "A", "V", "C"}, {"T", " I", "W", "A", "T", " I", "N", "W", "E", "S"}, {"E", "X", "B", "M", "C", "S", "X", "S", "S", "C"}, {"R", "S", "B", "G", "U", "K", "H", "J", "Q", "A"}, {"E", "K", "G", "J", "Z", "S", "E", "V", "W", "R"}, {"S", "O", "C", "K", "S", "F", "K", "T", "R", "F"}}; // Within this array, we are storing the applicable letters used in the word search.

	c.setColor (puzzleBg); // This block of code creates the background of the word search.
	c.fillRect (0, 0, 640, 500);

	c.setColor (puzzleSnow1); // This block of code creates the first layer of background snow.
	c.fillOval (-76, 333, 275, 211);
	c.fillOval (107, 318, 275, 211);
	c.fillOval (282, 357, 275, 211);
	c.fillOval (467, 318, 275, 211);

	c.setColor (puzzleSnow2); // This block of code creates the second layer of background snow.
	c.fillOval (-107, 378, 275, 211);
	c.fillOval (85, 366, 275, 211);
	c.fillOval (268, 397, 275, 211);
	c.fillOval (469, 357, 275, 211);

	c.setColor (puzzleSnow3); // This block of code creates the third layer of background snow.
	c.fillOval (-76, 423, 275, 211);
	c.fillOval (130, 441, 275, 211);
	c.fillOval (315, 441, 275, 211);
	c.fillOval (30, 441, 275, 211);

	c.setColor (wordsearch); // This block of code creates the transparent text bubbles for the word search.
	c.fillRect (30, 141, 285, 331);
	c.fillRect (331, 141, 276, 331);

	///////// SNOWFLAKES: /////////

	// Snowflake #1
	c.setColor (Color.white);
	c.fillRect (544, 34, 11, 40);
	c.fillOval (544, 28, 11, 11);
	c.fillOval (544, 67, 11, 11);

	c.fillRect (529, 47, 40, 11);
	c.fillOval (523, 47, 11, 11);
	c.fillOval (564, 47, 11, 11);

	c.fillPolygon (flake1x, flake1y, 4);
	c.fillOval (560 + fx, 31 + fy, 11, 11);
	c.fillOval (531 + fx, 61 + fy, 11, 11);

	c.fillPolygon (flake2x, flake2y, 4);
	c.fillOval (531 + fx, 31 + fy, 11, 11);
	c.fillOval (560 + fx, 61 + fy, 11, 11);

	// Snowflake #2
	c.fillRect (544 + f2x, 34 + f2y, 11, 40);
	c.fillOval (544 + f2x, 28 + f2y, 11, 11);
	c.fillOval (544 + f2x, 67 + f2y, 11, 11);

	c.fillRect (529 + f2x, 47 + f2y, 40, 11);
	c.fillOval (523 + f2x, 47 + f2y, 11, 11);
	c.fillOval (564 + f2x, 47 + f2y, 11, 11);

	c.fillPolygon (flake3x, flake3y, 4);
	c.fillOval (560 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (531 + fx + f2x, 61 + fy + f2y, 11, 11);

	c.fillPolygon (flake4x, flake4y, 4);
	c.fillOval (531 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (560 + fx + f2x, 61 + fy + f2y, 11, 11);

	// Snowflake #3
	c.fillRect (544 + f3x, 34 + f3y, 11, 40);
	c.fillOval (544 + f3x, 28 + f3y, 11, 11);
	c.fillOval (544 + f3x, 67 + f3y, 11, 11);

	c.fillRect (529 + f3x, 47 + f3y, 40, 11);
	c.fillOval (523 + f3x, 47 + f3y, 11, 11);
	c.fillOval (564 + f3x, 47 + f3y, 11, 11);

	c.fillPolygon (flake5x, flake5y, 4);
	c.fillOval (560 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (531 + fx + f3x, 61 + fy + f3y, 11, 11);

	c.fillPolygon (flake6x, flake6y, 4);
	c.fillOval (531 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (560 + fx + f3x, 61 + fy + f3y, 11, 11);

	c.setColor (wordsearch);
	c.fillRect (6, 6, 120, 15);
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.BOLD, 12));
	c.drawString ("Enter 'q' to quit.", 28, 18);

	c.setColor (Color.white);
	c.setFont (new Font ("Arial Black", Font.BOLD, 40)); // This block of code creates the main title text of the screen.
	c.drawString ("WORD SEARCH", 135, 110);
	c.setFont (new Font ("Calibri Light", Font.ITALIC, 40));
	c.drawString ("Winter Wonderland", 150, 60);

	c.setFont (new Font ("Calibri", Font.ITALIC, 30)); // This block of code creates the word bank present on the screen.
	c.setColor (text);
	c.drawString ("WORD BANK", 390, 190);

	c.setFont (new Font ("Calibri Light", Font.PLAIN, 20)); // This block of code is used to draw out the words present from the word bank.
	for (int i = 0 ; i < 10 ; i++)
	{
	    if (i < 6)
	    {
		c.drawString (easyWords1 [i], 375, 230 + i * 30);
	    }
	    else
	    {
		c.drawString (easyWords1 [i], 485, 50 + i * 30);
	    }
	}


	///////// CROSSWORD PUZZLE (DETAILS + COMPOSITION): /////////

	c.setFont (new Font ("Calibri", Font.BOLD, 14)); // This block of code is being used to specify the rows, and the row numbers.
	for (int i = 1 ; i <= 10 ; i++)
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 43, 170 + i * 28);
	    }
	    else
	    {
		c.drawString ("" + i, 39, 170 + i * 28);
	    }
	}

	for (int i = 1 ; i <= 10 ; i++) // This block of code is being used to specify the columns, and the column numbers.
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 52 + i * 24, 166);
	    }
	    else
	    {
		c.drawString ("" + i, 48 + i * 24, 166);
	    }
	}

	c.drawLine (40, 173, 300, 173); // This block of code creates two lines to seperate the numbers for the rows and columns.
	c.drawLine (60, 153, 60, 453);

	c.setFont (new Font ("Arial", Font.PLAIN, 16)); // This for loop essentially prints the letters to be used in the word bank.
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		c.drawString (easyLetters1 [i] [j], 74 + j * 24, 201 + i * 28);
	    }
	}

	c.setColor (Color.white); // This creates the white textbox where the user enters their input.
	c.fillRect (351, 401, 235, 55);

	Timer t = new Timer (c, time);

	if (timed == 't' || timed == 'T')
	{
	    t.start ();
	}

	c.setColor (text); // This sets the font for the text below:
	c.setFont (new Font ("Calibri", Font.PLAIN, 15));

	///////// STRUCTURE OF WORD SEARCH: /////////

	while (words < 10 && game && t.time () != 0) // While all the words have not yet been found....
	{
	    searchInput (t);

	    // These are the coordinates for the diagonal lines, that pass through the diagonal words.
	    int[] mittensX = {96, 98, 255, 253};
	    int[] mittensY = {188, 186, 368, 370};

	    int[] bootsX = {96, 98, 207, 205};
	    int[] bootsY = {243, 241, 370, 372};

	    int[] jacketX = {120, 122, 253, 251};
	    int[] jacketY = {298, 296, 453, 455};

	    int[] parkaX = {144, 146, 255, 253};
	    int[] parkaY = {186, 184, 313, 315};

	    if (game && t.time () != 0)
	    {
		if (row1 == 1 && row2 == 7 && column1 == 2 && column2 == 8) // This block of code is used to cross out and identify the word 'mittens'.
		{
		    if (!easyWords1 [0].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillPolygon (mittensX, mittensY, 4);

			// This crosses out the word on the word bank.
			c.fillRect (371, 222, 83, 3);

			easyWords1 [0] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"mittens\"!"); // This message pops up if they try to find a word they already found.
		    }
		}
		else if (row1 == 2 && row2 == 7 && column1 == 9 && column2 == 9)  // This block of code is used to cross out and identify the word 'gloves'.
		{
		    if (!easyWords1 [1].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (271, 211, 3, 165);

			// This crosses out the word on the word bank.
			c.fillRect (371, 252, 73, 3);

			easyWords1 [1] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"gloves\"!"); // This pops up if the user tried to find a word they already found.
		    }
		}
		else if (row1 == 3 && row2 == 7 && column1 == 2 && column2 == 6)  // This block of code is used to cross out and identify the word 'boots'.
		{
		    if (!easyWords1 [2].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillPolygon (bootsX, bootsY, 4);

			// This crosses out the word on the word bank.
			c.fillRect (371, 282, 65, 3);

			easyWords1 [2] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"boots\"!"); // This message pops up if the user tries to find a word they already found...
		    }
		}
		else if (row1 == 5 && row2 == 10 && column1 == 3 && column2 == 8)  // This block of code is used to cross out and identify the word 'jacket'.
		{
		    if (!easyWords1 [3].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillPolygon (jacketX, jacketY, 4);

			// This crosses out the word on the word bank.
			c.fillRect (371, 312, 65, 3);

			easyWords1 [3] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"jacket\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 1 && row2 == 5 && column1 == 4 && column2 == 8)  // This block of code is used to cross out and identify the word 'parka'.
		{
		    if (!easyWords1 [4].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillPolygon (parkaX, parkaY, 4);

			// This crosses out the word on the word bank.
			c.fillRect (371, 342, 60, 3);

			easyWords1 [4] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"parka\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 6 && row2 == 10 && column1 == 10 && column2 == 10)  // This block of code is used to cross out and identify the word 'scarf'.
		{
		    if (!easyWords1 [5].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (294, 323, 3, 139);

			// This crosses out the word on the word bank.
			c.fillRect (371, 372, 56, 3);

			easyWords1 [5] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"scarf\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 10 && row2 == 10 && column1 == 1 && column2 == 5)  // This block of code is used to cross out and identify the word 'socks'.
		{
		    if (!easyWords1 [6].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (70, 445, 115, 3);

			// This crosses out the word on the word bank.
			c.fillRect (481, 222, 60, 3);

			easyWords1 [6] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"socks\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 2 && row2 == 8 && column1 == 1 && column2 == 1)  // This block of code is used to cross out and identify the word 'sweater'.
		{
		    if (!easyWords1 [7].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (78, 211, 3, 195);

			// This crosses out the word on the word bank.
			c.fillRect (481, 252, 86, 3);

			easyWords1 [7] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"sweater\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 2 && row2 == 4 && column1 == 8 && column2 == 8)  // This block of code is used to cross out and identify the word 'hat'.
		{
		    if (!easyWords1 [8].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (246, 211, 3, 81);

			// This crosses out the word on the word bank.
			c.fillRect (481, 282, 40, 3);

			easyWords1 [8] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"hat\"!"); // This message pops up if the user tried to find a word they already found.
		    }
		}
		else if (row1 == 1 && row2 == 5 && column1 == 10 && column2 == 10)  // This block of code is used to cross out and identify the word 'tunic'.
		{
		    if (!easyWords1 [9].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (294, 183, 3, 138);

			// This crosses out the word on the word bank.
			c.fillRect (481, 312, 60, 3);

			easyWords1 [9] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"tunic\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else
		{
		    new Message ("That's not one of the words. Try again!"); // This error message pops up if the user tries to enter a word that isn't even in the puzzle...
		}
	    }
	}

	if (timed == 't' || timed == 'T')
	{
	    t.stop ();
	}

	scores (words);
	finalResults (); // After they complete the puzzle, the user progresses to the main menu.
    } // This is the ending bracket of the private 'easySearch1' method.


    // Easy Word Search #2 Colour Variables
    Color puzzleBg2 = new Color (72, 105, 203);
    Color puzzleSnow4 = new Color (130, 159, 248);
    Color puzzleSnow5 = new Color (167, 185, 241);
    Color puzzleSnow6 = new Color (200, 210, 244);

    private void easySearch2 ()  // This is the private 'easySearch2' method, which displays and creates our second easy word puzzle (relating to winter foods!)
    {
	// User Input Variables (For Storing User Input).
	words = 0;

	temp = ""; // Here, the value of temp is set to null.

	game = true;

	String[] easyWords2 = {"CHOCOLATE", "COCO", "HOT", "COOKIE", "CANE", "GINGER", "CINNAMON", "SPICE", "TEA", "COFFEE"};
	// The array above stores the words for the second 'easy' puzzle (involving food).

	String[] [] easyLetters2 = {{" I", "U", "G", "T", "R", "F", "K", "D", "X", "C"}, {"L", "C", " I", "D", "O", "C", "T", "D", "B", "O"}, {"G", "O", "N", "J", "V", "A", "E", "A", "P", "C"}, {"G", "F", "G", "R", "N", "N", "A", "H", "J", "O"}, {"S", "F", "E", "G", "V", "E", "B", "V", "O", "P"}, {"P", "E", "R", "S", "J", "L", "H", "L", "X", "T"}, {" I", "E", "C", " I", "N", "N", "A", "M", "O", "N"}, {"C", "H", "O", "C", "O", "L", "A", "T", "E", "N"}, {"E", "O", "K", "C", "O", "O", "K", " I", "E", "U"}, {"G", "B", "M", "W", "Q", "F", "M", "Q", "F", "K"}};
	// The array above stores the applicable letters of the second 'easy' puzzle.

	c.setColor (puzzleBg2); // This block of code creates the background of the puzzle.
	c.fillRect (0, 0, 640, 500);

	c.setColor (puzzleSnow4); // This block of code creates the background snow (layer 1).
	c.fillOval (-76, 333, 275, 211);
	c.fillOval (107, 318, 275, 211);
	c.fillOval (282, 357, 275, 211);
	c.fillOval (467, 318, 275, 211);

	c.setColor (puzzleSnow5); // This block of code creates the background snow (layer 2).
	c.fillOval (-107, 378, 275, 211);
	c.fillOval (85, 366, 275, 211);
	c.fillOval (268, 397, 275, 211);
	c.fillOval (469, 357, 275, 211);

	c.setColor (puzzleSnow6); // This block of code creates the background snow (layer 3).
	c.fillOval (-76, 423, 275, 211);
	c.fillOval (130, 441, 275, 211);
	c.fillOval (315, 441, 275, 211);
	c.fillOval (30, 441, 275, 211);

	c.setColor (wordsearch); // This block of code creates the background of the word search.
	c.fillRect (30, 141, 285, 331);
	c.fillRect (331, 141, 276, 331);

	///////// SNOWFLAKES: /////////

	// Snowflake #1
	c.setColor (Color.white);
	c.fillRect (544, 34, 11, 40);
	c.fillOval (544, 28, 11, 11);
	c.fillOval (544, 67, 11, 11);

	c.fillRect (529, 47, 40, 11);
	c.fillOval (523, 47, 11, 11);
	c.fillOval (564, 47, 11, 11);

	c.fillPolygon (flake1x, flake1y, 4);
	c.fillOval (560 + fx, 31 + fy, 11, 11);
	c.fillOval (531 + fx, 61 + fy, 11, 11);

	c.fillPolygon (flake2x, flake2y, 4);
	c.fillOval (531 + fx, 31 + fy, 11, 11);
	c.fillOval (560 + fx, 61 + fy, 11, 11);

	// Snowflake #2
	c.fillRect (544 + f2x, 34 + f2y, 11, 40);
	c.fillOval (544 + f2x, 28 + f2y, 11, 11);
	c.fillOval (544 + f2x, 67 + f2y, 11, 11);

	c.fillRect (529 + f2x, 47 + f2y, 40, 11);
	c.fillOval (523 + f2x, 47 + f2y, 11, 11);
	c.fillOval (564 + f2x, 47 + f2y, 11, 11);

	c.fillPolygon (flake3x, flake3y, 4);
	c.fillOval (560 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (531 + fx + f2x, 61 + fy + f2y, 11, 11);

	c.fillPolygon (flake4x, flake4y, 4);
	c.fillOval (531 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (560 + fx + f2x, 61 + fy + f2y, 11, 11);

	// Snowflake #3
	c.fillRect (544 + f3x, 34 + f3y, 11, 40);
	c.fillOval (544 + f3x, 28 + f3y, 11, 11);
	c.fillOval (544 + f3x, 67 + f3y, 11, 11);

	c.fillRect (529 + f3x, 47 + f3y, 40, 11);
	c.fillOval (523 + f3x, 47 + f3y, 11, 11);
	c.fillOval (564 + f3x, 47 + f3y, 11, 11);

	c.fillPolygon (flake5x, flake5y, 4);
	c.fillOval (560 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (531 + fx + f3x, 61 + fy + f3y, 11, 11);

	c.fillPolygon (flake6x, flake6y, 4);
	c.fillOval (531 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (560 + fx + f3x, 61 + fy + f3y, 11, 11);

	c.setColor (wordsearch);
	c.fillRect (6, 6, 120, 15);
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.BOLD, 12));
	c.drawString ("Enter 'q' to quit.", 28, 18);

	c.setColor (Color.white);

	c.setFont (new Font ("Arial Black", Font.BOLD, 40)); // This block of code creates the main title text of the screen.
	c.drawString ("WORD SEARCH", 135, 110);
	c.setFont (new Font ("Calibri Light", Font.ITALIC, 40));
	c.drawString ("Winter Wonderland", 150, 60);

	c.setFont (new Font ("Calibri", Font.ITALIC, 30)); // This block of code creates the text of the word bank.
	c.setColor (text);
	c.drawString ("WORD BANK", 390, 190);

	c.setFont (new Font ("Calibri Light", Font.PLAIN, 20)); // This block of code draws out the word bank of the puzzle.
	for (int i = 0 ; i < 10 ; i++)
	{
	    if (i < 6)
	    {
		c.drawString (easyWords2 [i], 360, 230 + i * 30);
	    }
	    else
	    {
		c.drawString (easyWords2 [i], 485, 50 + i * 30);
	    }
	}

	///////// STRUCTURE OF WORD SEARCH: /////////

	// This block of code specifies the row numbers, and the rows of the puzzle.
	c.setFont (new Font ("Calibri", Font.BOLD, 14));
	for (int i = 1 ; i <= 10 ; i++)
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 43, 170 + i * 28);
	    }
	    else
	    {
		c.drawString ("" + i, 39, 170 + i * 28);
	    }
	}

	// This block of code specifies the column numbers, and the columns of the puzzle.
	for (int i = 1 ; i <= 10 ; i++)
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 52 + i * 24, 166);
	    }
	    else
	    {
		c.drawString ("" + i, 48 + i * 24, 166);
	    }
	}

	// // This block of code draws out the two lines that seperate the numbers from the letters.
	c.drawLine (40, 173, 300, 173);
	c.drawLine (60, 153, 60, 453);

	// This block of code displays the letters of the puzzle.
	c.setFont (new Font ("Arial", Font.PLAIN, 16));
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		c.drawString (easyLetters2 [i] [j], 74 + j * 24, 201 + i * 28);
	    }
	}

	// This block of code draws out the white rectangle where the user enters their input / answer.
	c.setColor (Color.white);
	c.fillRect (351, 401, 235, 55);

	Timer t = new Timer (c, time);

	if (timed == 't' || timed == 'T')
	{
	    t.start ();
	}

	c.setColor (text); // This sets the font type for the text below.
	c.setFont (new Font ("Calibri", Font.PLAIN, 15));

	// The segments of code below create the actual structure and mechanics of the game itself:


	while (words < 10 && game && t.time () != 0) // While all the words have not yet been found...
	{
	    searchInput (t);

	    // Below, are the coordinates for the diagonal lines of the diagonal words in the crossword puzzle.
	    int[] hotX = {238, 240, 307, 305};
	    int[] hotY = {270, 268, 344, 346};

	    if (game && t.time () != 0)
	    {
		if (row1 == 8 && row2 == 8 && column1 == 1 && column2 == 9) // This block of code is used to cross out and identify the word 'chocolate'.
		{
		    if (!easyWords2 [0].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (70, 390, 211, 3);

			// This crosses out the word on the word bank.
			c.fillRect (356, 222, 105, 3);

			easyWords2 [0] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"chocolate\"!"); // This message pops up if the user has already identified the word.
		    }
		}
		else if (row1 == 1 && row2 == 4 && column1 == 10 && column2 == 10)  // This block of code is used to cross out and identify the word 'coco'.
		{
		    if (!easyWords2 [1].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (294, 184, 3, 109);

			// This crosses out the word on the word bank.
			c.fillRect (356, 252, 57, 3);

			easyWords2 [1] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"coco\"!"); // This message pops up if the user has already identified the word.
		    }
		}
		else if (row1 == 4 && row2 == 6 && column1 == 8 && column2 == 10)  // This block of code is used to cross out and identify the word 'hot'.
		{
		    if (!easyWords2 [2].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillPolygon (hotX, hotY, 4);

			// This crosses out the word on the word bank.
			c.fillRect (356, 282, 47, 3);

			easyWords2 [2] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"hot\"!"); // This message pops up if the user has already identified the word.
		    }
		}
		else if (row1 == 9 && row2 == 9 && column1 == 4 && column2 == 9)  // This block of code is used to cross out and identify the word 'cookie'.
		{
		    if (!easyWords2 [3].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (141, 418, 141, 3);

			// This crosses out the word on the word bank.
			c.fillRect (356, 312, 68, 3);

			easyWords2 [3] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"cookie\"!");
		    }
		}
		else if (row1 == 2 && row2 == 5 && column1 == 6 && column2 == 6)  // This block of code is used to cross out and identify the word 'cane'.
		{
		    if (!easyWords2 [4].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (198, 212, 3, 109);

			// This crosses out the word on the word bank.
			c.fillRect (356, 342, 53, 3);

			easyWords2 [4] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"cane\"!"); // This message pops up if the user has already identified the word.
		    }
		}
		else if (row1 == 1 && row2 == 6 && column1 == 3 && column2 == 3)  // This block of code is used to cross out and identify the word 'ginger'.
		{
		    if (!easyWords2 [5].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (126, 184, 3, 162);

			// This crosses out the word on the word bank.
			c.fillRect (356, 372, 73, 3);

			easyWords2 [5] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"ginger\"!"); // This message pops up if the user has already identified the word.
		    }
		}
		else if (row1 == 7 && row2 == 7 && column1 == 3 && column2 == 10)  // This block of code is used to cross out and identify the word 'cinnamon'.
		{
		    if (!easyWords2 [6].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (118, 362, 188, 3);

			// This crosses out the word on the word bank.
			c.fillRect (481, 222, 103, 3);

			easyWords2 [6] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"cinnamon\"!"); // This message pops up if the user has already identified the word.
		    }
		}
		else if (row1 == 5 && row2 == 9 && column1 == 1 && column2 == 1)  // This block of code is used to cross out and identify the word 'spice'.
		{
		    if (!easyWords2 [7].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (78, 296, 3, 136);

			// This crosses out the word on the word bank.
			c.fillRect (479, 252, 56, 3);

			easyWords2 [7] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"spice\"!"); // This message pops up if they have already found the word.
		    }
		}
		else if (row1 == 2 && row2 == 4 && column1 == 7 && column2 == 7)  // This block of code is used to cross out and identify the word 'tea'.
		{
		    if (!easyWords2 [8].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (222, 211, 3, 81);

			// This crosses out the word on the word bank.
			c.fillRect (481, 282, 40, 3);

			easyWords2 [8] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"tea\"!"); // This message pops up if the user has already found the word.
		    }
		}
		else if (row1 == 2 && row2 == 7 && column1 == 2 && column2 == 2)  // This block of code is used to cross out and identify the word 'coffee'.
		{
		    if (!easyWords2 [9].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (102, 211, 3, 165);

			// This crosses out the word on the word bank.
			c.fillRect (481, 312, 70, 3);

			easyWords2 [9] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"coffee\"!"); // This message pops up if the user has already identified the word.
		    }
		}
		else
		{
		    new Message ("That's not one of the words. Try again!"); // This error message pops up if the user tries to identify a word that is not in the puzzle.
		}
	    }
	}

	if (timed == 't' || timed == 'T') // This block of code stops the timer thread, and stops the timer from running.
	{
	    t.stop ();
	}

	scores (words);
	finalResults (); // After the puzzle is completed, the user is transported back to the main menu.
    } // This is the ending bracket of the private 'easySearch2' method.


    // Easy Word Search #2 Colour Variables
    Color puzzleBg3 = new Color (200, 210, 244);
    Color puzzleSnow7 = new Color (181, 192, 230);
    Color puzzleSnow8 = new Color (137, 150, 196);
    Color puzzleSnow9 = new Color (137, 117, 171);


    public void easySearch3 ()  // This is the public 'easySearch3', and contains the various segments of code producing our third easy crossword puzzle.
    {
	// User Input Variables (Used To Store User Input)
	words = 0;

	temp = ""; // Here, temp is set to null.

	game = true; // Here, game is set to true

	String[] easyWords3 = {"SLED", "SKI", "SNOWBOARD", "SNOWSHOE", "FORT", "SNOWMAN", "SKATE", "HOCKEY", "CURLING", "TUBING"};
	// This array contains the words of our puzzle
	String[] [] easyLetters3 = {{"F", "S", " I", "K", "X", "K", "R", "L", "W", "K"}, {"T", "N", "N", "F", "D", "U", "Q", "E", "Y", "Y"}, {"U", "O", "T", "O", "G", "S", "S", "J", "S", "H"}, {"B", "W", "S", "R", "W", "V", "K", "L", "L", "O"}, {" I", "B", "K", "T", "C", "S", " I", "F", "E", "C"}, {"N", "O", "A", "B", "H", "Z", "H", "J", "D", "K"}, {"G", "A", "T", "M", "M", "P", " I", "O", "J", "E"}, {"N", "R", "E", "F", "S", "B", "H", "D", "E", "Y"}, {"R", "D", "C", "U", "R", "L", " I", "N", "G", "M"}, {"S", "N", "O", "W", "M", "A", "N", "C", "J", "D"}};
	// This array contains the letters that comrpise the words of our puzzle

	// This block of code creates the main background colour of our puzzle.
	c.setColor (puzzleBg3);
	c.fillRect (0, 0, 640, 500);

	// This block of code creates the first layer of snow present on the background of our puzzle.
	c.setColor (puzzleSnow7);
	c.fillOval (-76, 333, 275, 211);
	c.fillOval (107, 318, 275, 211);
	c.fillOval (282, 357, 275, 211);
	c.fillOval (467, 318, 275, 211);

	// This block of code creates the second layer of snow present on the background of our puzzle.
	c.setColor (puzzleSnow8);
	c.fillOval (-107, 378, 275, 211);
	c.fillOval (85, 366, 275, 211);
	c.fillOval (268, 397, 275, 211);
	c.fillOval (469, 357, 275, 211);

	// This block of code creates the third layer of snow present on the background of our puzzle.
	c.setColor (puzzleSnow9);
	c.fillOval (-76, 423, 275, 211);
	c.fillOval (130, 441, 275, 211);
	c.fillOval (315, 441, 275, 211);
	c.fillOval (30, 441, 275, 211);

	// This block of code creates the two transparent text bubbles onto which our word search and word bank will be displayed.
	c.setColor (wordsearch);
	c.fillRect (30, 141, 285, 331);
	c.fillRect (331, 141, 276, 331);

	///////// SNOWFLAKES: /////////

	// Snowflake #1
	c.setColor (Color.white);
	c.fillRect (544, 34, 11, 40);
	c.fillOval (544, 28, 11, 11);
	c.fillOval (544, 67, 11, 11);

	c.fillRect (529, 47, 40, 11);
	c.fillOval (523, 47, 11, 11);
	c.fillOval (564, 47, 11, 11);

	c.fillPolygon (flake1x, flake1y, 4);
	c.fillOval (560 + fx, 31 + fy, 11, 11);
	c.fillOval (531 + fx, 61 + fy, 11, 11);

	c.fillPolygon (flake2x, flake2y, 4);
	c.fillOval (531 + fx, 31 + fy, 11, 11);
	c.fillOval (560 + fx, 61 + fy, 11, 11);

	// Snowflake #2
	c.fillRect (544 + f2x, 34 + f2y, 11, 40);
	c.fillOval (544 + f2x, 28 + f2y, 11, 11);
	c.fillOval (544 + f2x, 67 + f2y, 11, 11);

	c.fillRect (529 + f2x, 47 + f2y, 40, 11);
	c.fillOval (523 + f2x, 47 + f2y, 11, 11);
	c.fillOval (564 + f2x, 47 + f2y, 11, 11);

	c.fillPolygon (flake3x, flake3y, 4);
	c.fillOval (560 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (531 + fx + f2x, 61 + fy + f2y, 11, 11);

	c.fillPolygon (flake4x, flake4y, 4);
	c.fillOval (531 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (560 + fx + f2x, 61 + fy + f2y, 11, 11);

	// Snowflake #3
	c.fillRect (544 + f3x, 34 + f3y, 11, 40);
	c.fillOval (544 + f3x, 28 + f3y, 11, 11);
	c.fillOval (544 + f3x, 67 + f3y, 11, 11);

	c.fillRect (529 + f3x, 47 + f3y, 40, 11);
	c.fillOval (523 + f3x, 47 + f3y, 11, 11);
	c.fillOval (564 + f3x, 47 + f3y, 11, 11);

	c.fillPolygon (flake5x, flake5y, 4);
	c.fillOval (560 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (531 + fx + f3x, 61 + fy + f3y, 11, 11);

	c.fillPolygon (flake6x, flake6y, 4);
	c.fillOval (531 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (560 + fx + f3x, 61 + fy + f3y, 11, 11);

	// This block of code displays the 'quit' option on the puzzle.
	c.setColor (wordsearch);
	c.fillRect (6, 6, 120, 15);
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.BOLD, 12));
	c.drawString ("Enter 'q' to quit.", 28, 18);

	// This block of code creates the main text of our puzzle.
	c.setColor (Color.WHITE);
	c.setFont (new Font ("Arial Black", Font.BOLD, 40));
	c.drawString ("WORD SEARCH", 135, 110);
	c.setFont (new Font ("Calibri Light", Font.ITALIC, 40));
	c.drawString ("Winter Wonderland", 150, 60);

	// This block of code sets the font and size for the text that will be displayed in the word bank.
	c.setFont (new Font ("Calibri", Font.ITALIC, 30));
	c.setColor (text);
	c.drawString ("WORD BANK", 390, 190);

	// This block of code essentially creates and generates our puzzle.
	c.setFont (new Font ("Calibri Light", Font.PLAIN, 20));
	for (int i = 0 ; i < 10 ; i++)
	{
	    if (i < 6)
	    {
		c.drawString (easyWords3 [i], 360, 230 + i * 30);
	    }
	    else
	    {
		c.drawString (easyWords3 [i], 485, 50 + i * 30);
	    }
	}

	///////// STRUCTURE OF WORD SEARCH: /////////

	// This block of code creates and establishes the row numbers of our puzzle.
	c.setFont (new Font ("Calibri", Font.BOLD, 14));
	for (int i = 1 ; i <= 10 ; i++)
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 43, 170 + i * 28);
	    }
	    else
	    {
		c.drawString ("" + i, 39, 170 + i * 28);
	    }
	}

	// This block of code creates and establishes the column numbers of our puzzle.
	for (int i = 1 ; i <= 10 ; i++)
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 52 + i * 24, 166);
	    }
	    else
	    {
		c.drawString ("" + i, 48 + i * 24, 166);
	    }
	}

	// This block of code draws the two lines that are seperating the numbers and the letters within our puzzle.
	c.drawLine (40, 173, 300, 173);
	c.drawLine (60, 153, 60, 453);

	// This block of code 'draws' or displays the letters part of our word search puzzle.
	c.setFont (new Font ("Arial", Font.PLAIN, 16));
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		c.drawString (easyLetters3 [i] [j], 74 + j * 24, 201 + i * 28);
	    }
	}

	// This block of code creates the white rectangle where the user will enter their input.
	c.setColor (Color.white);
	c.fillRect (351, 401, 235, 55);

	Timer t = new Timer (c, time);

	if (timed == 't' || timed == 'T') // This block of code starts the timer, if the user chose to play a timed puzzle.
	{
	    t.start ();
	}

	// Here, we are setting the font, and size of the text to be used in the answer area.
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.PLAIN, 15));

	///////// GAMEPLAY: /////////

	while (words < 10 && game && t.time () != 0) // While all the words have not been found...
	{
	    searchInput (t);

	    // Below, are two arrays that contain the coordinates for diagonal lines that cross through the diagonal words in the puzzle.
	    int[] shoeX = {96, 98, 280, 278};
	    int[] shoeY = {188, 186, 398, 400};

	    if (game && t.time () != 0) // If the value of 'game' (which determines whether or not the user wants to quit the game) and the timer thread, are NOT equal to 0, meaning, the puzzle is still running, then we will execute the following code.
	    {
		if (row1 == 3 && row2 == 6 && column1 == 9 && column2 == 9) // This block of code is used to cross out and identify the word 'sled'.
		{
		    if (!easyWords3 [0].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (270, 240, 3, 109);

			// This crosses out the word on the word bank.
			c.fillRect (356, 222, 47, 3);

			easyWords3 [0] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"sled\"!"); // If the user has already found the word, this message will be displayed.
		    }
		}
		else if (row1 == 3 && row2 == 5 && column1 == 7 && column2 == 7)  // This block of code is being used to cross out and identify the word 'ski'.
		{
		    if (!easyWords3 [1].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (222, 240, 3, 80);

			// This crosses out the word on the word bank.
			c.fillRect (356, 252, 34, 3);

			easyWords3 [1] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"ski\"!"); // This error message will be displayed if the user has already FOUND the word 'ski'.
		    }
		}
		else if (row1 == 1 && row2 == 9 && column1 == 2 && column2 == 2)  // This block of code is being used to identify, and cross out the word 'snowboard'.
		{
		    if (!easyWords3 [2].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (102, 185, 3, 248);

			// This crosses out the word on the word bank.
			c.fillRect (356, 282, 119, 3);

			easyWords3 [2] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"snowboard\"!"); // This error message will be displayed if the user has already found the word.
		    }
		}
		else if (row1 == 1 && row2 == 8 && column1 == 2 && column2 == 9)   // This block of code crosses out and identifies the word 'snowshoe'.
		{
		    if (!easyWords3 [3].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillPolygon (shoeX, shoeY, 4);

			// This crosses out the word on the word bank.
			c.fillRect (356, 312, 103, 3);

			easyWords3 [3] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"snowshoe\"!"); // This error message will be displayed if the user has already found this word.
		    }
		}
		else if (row1 == 2 && row2 == 5 && column1 == 4 && column2 == 4)  // This block of code is being used to identify and cross out the word 'fort'.
		{
		    if (!easyWords3 [4].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (150, 211, 3, 109);

			// This crosses out the word on the word bank.
			c.fillRect (356, 342, 50, 3);

			easyWords3 [4] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"fort\"!"); // This error message will be displayed if the user has already found the word.
		    }
		}
		else if (row1 == 10 && row2 == 10 && column1 == 1 && column2 == 7)  // This block of code is being used to cross out and identify the word 'snowman'.
		{
		    if (!easyWords3 [5].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (71, 446, 161, 3);

			// This crosses out the word on the word bank.
			c.fillRect (356, 372, 103, 3);

			easyWords3 [5] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"snowman\"!"); // This error message will be displayed if the user has already found this word.
		    }
		}
		else if (row1 == 4 && row2 == 8 && column1 == 3 && column2 == 3)  // This block of code is being used to cross out and identify the word 'skate'.
		{
		    if (!easyWords3 [6].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (126, 268, 3, 166);

			// This crosses out the word on the word bank.
			c.fillRect (481, 222, 57, 3);

			easyWords3 [6] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"skate\"!"); // This error message will be displayed if the user has already found this word.
		    }
		}
		else if (row1 == 3 && row2 == 8 && column1 == 10 && column2 == 10)  // This block of code is being used to cross out and identify the word 'hockey'.
		{
		    if (!easyWords3 [7].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (294, 240, 3, 164);

			// This crosses out the word on the word bank.
			c.fillRect (479, 252, 76, 3);

			easyWords3 [7] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"hockey\"!"); // This error message will be displayed if the user has already found this word.
		    }
		}
		else if (row1 == 9 && row2 == 9 && column1 == 3 && column2 == 9)  // This block of code is being used to cross out and identify the word 'curling'.
		{
		    if (!easyWords3 [8].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (118, 417, 163, 3);

			// This crosses out the word on the word bank.
			c.fillRect (481, 282, 81, 3);

			easyWords3 [8] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"curling\"!"); // This error message will be displayed if the user has already found this word.
		    }
		}
		else if (row1 == 2 && row2 == 7 && column1 == 1 && column2 == 1)  // This block of code is being used to cross out and identify the word 'tubing'.
		{
		    if (!easyWords3 [9].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (78, 211, 3, 164);

			// This crosses out the word on the word bank.
			c.fillRect (481, 312, 73, 3);

			easyWords3 [9] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"tubing\"!"); // This error message will be displayed if the user has already found this word.
		    }
		}
		else
		{
		    new Message ("That's not one of the words. Try again!"); // This error message will be displayed if the user tries to find a word that isn't a word on the puzzle.
		}
	    }
	}

	if (timed == 't' || timed == 'T') // The timer then stops when the puzzle is over.
	{
	    t.stop ();
	}

	scores (words); // The user's score is accounted for.
	finalResults (); // After they complete the puzzle, the user progresses to the main menu.
    } // This is the ending bracket of the public 'easySearch3' method.


    // Hard Search #1 Color Variables
    Color puzzleBg4 = new Color (31, 110, 141);
    Color puzzleSnow10 = new Color (191, 212, 232);
    Color puzzleSnow11 = new Color (139, 187, 232);
    Color puzzleSnow12 = new Color (91, 163, 230);


    private void hardSearch1 ()  // This is the private 'hardSearch1' method, which displays and creates our first hard word search (relating to winter clothing).
    {
	// User Input Variables (Used To Store User Input)
	words = 0;

	temp = ""; // Here, temp is set to null.

	game = true; // Here, game is set to true

	String[] hardWords1 = {"MITTENS", "GLOVES", "BOOTS", "JACKET", "PARKA", "SCARF", "SOCKS", "SWEATER", "HAT", "TUNIC", "FLUFFY", "MUFFS", "BEANIE", "WARM", "PANTS"}; // Within this array, we are storing the words that are present in the word search.
	// This array contains the words that are a part of the word search puzzle.
	String[] [] hardLetters1 = {{"W", "A", "R", "M", " I", "T", "T", "E", "N", "S"}, {"Z", "L", " R", "F", "F", "L", "U", "F", "F", "Y"}, {"S", "J", "P", "S", "B", "E", "A", "N", " I", "E"}, {"C", "Z", "A", "S", "P", "A", "R", "K", "A", "M"}, {"A", "S", "B", "C", "W", "W", "H", "H", "G", "U"}, {"R", "O", "O", "D", "K", "E", "B", "A", "L", "F"}, {"F", "C", "O", "Z", "G", "E", "A", "T", "O", "F"}, {"Z", "K", "T", "J", "F", "M", "T", "T", "V", "S"}, {"J", "S", "S", "P", "A", "N", "T", "S", "E", "M"}, {" I", "T", "U", "N", " I", "C", "U", "Q", "S", "R"}}; // Within this array, we are storing the applicable letters used in the word search.
	// This array contains the letters that are a part of the word search puzzle.

	c.setColor (puzzleBg4); // This block of code creates the background of the word search.
	c.fillRect (0, 0, 640, 500);

	c.setColor (puzzleSnow10); // This block of code creates the first layer of background snow.
	c.fillOval (-76, 333, 275, 211);
	c.fillOval (107, 318, 275, 211);
	c.fillOval (282, 357, 275, 211);
	c.fillOval (467, 318, 275, 211);

	c.setColor (puzzleSnow11); // This block of code creates the second layer of background snow.
	c.fillOval (-107, 378, 275, 211);
	c.fillOval (85, 366, 275, 211);
	c.fillOval (268, 397, 275, 211);
	c.fillOval (469, 357, 275, 211);

	c.setColor (puzzleSnow12); // This block of code creates the third layer of background snow.
	c.fillOval (-76, 423, 275, 211);
	c.fillOval (130, 441, 275, 211);
	c.fillOval (315, 441, 275, 211);
	c.fillOval (30, 441, 275, 211);

	c.setColor (wordsearch); // This block of code creates the transparent text bubbles for the word search.
	c.fillRect (30, 141, 285, 331);
	c.fillRect (331, 141, 276, 331);

	///////// SNOWFLAKES: /////////

	// Snowflake #1
	c.setColor (Color.white);
	c.fillRect (544, 34, 11, 40);
	c.fillOval (544, 28, 11, 11);
	c.fillOval (544, 67, 11, 11);

	c.fillRect (529, 47, 40, 11);
	c.fillOval (523, 47, 11, 11);
	c.fillOval (564, 47, 11, 11);

	c.fillPolygon (flake1x, flake1y, 4);
	c.fillOval (560 + fx, 31 + fy, 11, 11);
	c.fillOval (531 + fx, 61 + fy, 11, 11);

	c.fillPolygon (flake2x, flake2y, 4);
	c.fillOval (531 + fx, 31 + fy, 11, 11);
	c.fillOval (560 + fx, 61 + fy, 11, 11);

	// Snowflake #2
	c.fillRect (544 + f2x, 34 + f2y, 11, 40);
	c.fillOval (544 + f2x, 28 + f2y, 11, 11);
	c.fillOval (544 + f2x, 67 + f2y, 11, 11);

	c.fillRect (529 + f2x, 47 + f2y, 40, 11);
	c.fillOval (523 + f2x, 47 + f2y, 11, 11);
	c.fillOval (564 + f2x, 47 + f2y, 11, 11);

	c.fillPolygon (flake3x, flake3y, 4);
	c.fillOval (560 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (531 + fx + f2x, 61 + fy + f2y, 11, 11);

	c.fillPolygon (flake4x, flake4y, 4);
	c.fillOval (531 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (560 + fx + f2x, 61 + fy + f2y, 11, 11);

	// Snowflake #3
	c.fillRect (544 + f3x, 34 + f3y, 11, 40);
	c.fillOval (544 + f3x, 28 + f3y, 11, 11);
	c.fillOval (544 + f3x, 67 + f3y, 11, 11);

	c.fillRect (529 + f3x, 47 + f3y, 40, 11);
	c.fillOval (523 + f3x, 47 + f3y, 11, 11);
	c.fillOval (564 + f3x, 47 + f3y, 11, 11);

	c.fillPolygon (flake5x, flake5y, 4);
	c.fillOval (560 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (531 + fx + f3x, 61 + fy + f3y, 11, 11);

	c.fillPolygon (flake6x, flake6y, 4);
	c.fillOval (531 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (560 + fx + f3x, 61 + fy + f3y, 11, 11);

	// This block of code displays the 'quit' option on the puzzle.
	c.setColor (wordsearch);
	c.fillRect (6, 6, 120, 15);
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.BOLD, 12));
	c.drawString ("Enter 'q' to quit.", 28, 18);

	c.setColor (Color.white);
	c.setFont (new Font ("Arial Black", Font.BOLD, 40)); // This block of code creates the main title text of the screen.
	c.drawString ("WORD SEARCH", 135, 110);
	c.setFont (new Font ("Calibri Light", Font.ITALIC, 40));
	c.drawString ("Winter Wonderland", 150, 60);

	c.setFont (new Font ("Calibri", Font.ITALIC, 30)); // This block of code creates the word bank present on the screen.
	c.setColor (text);
	c.drawString ("WORD BANK", 390, 190);

	c.setFont (new Font ("Calibri Light", Font.PLAIN, 17)); // This block of code is used to draw out the words present from the word bank.
	for (int i = 0 ; i < 15 ; i++)
	{
	    if (i < 8)
	    {
		c.drawString (hardWords1 [i], 385, 220 + i * 24);
	    }
	    else
	    {
		c.drawString (hardWords1 [i], 495, 28 + i * 24);
	    }
	}


	///////// CROSSWORD PUZZLE (DETAILS + COMPOSITION): /////////

	c.setFont (new Font ("Calibri", Font.BOLD, 14)); // This block of code is being used to specify the rows, and the row numbers.
	for (int i = 1 ; i <= 10 ; i++)
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 43, 170 + i * 28);
	    }
	    else
	    {
		c.drawString ("" + i, 39, 170 + i * 28);
	    }
	}

	for (int i = 1 ; i <= 10 ; i++) // This block of code is being used to specify the columns, and the column numbers.
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 52 + i * 24, 166);
	    }
	    else
	    {
		c.drawString ("" + i, 48 + i * 24, 166);
	    }
	}

	c.drawLine (40, 173, 300, 173); // This block of code creates two lines to seperate the numbers for the rows and columns.
	c.drawLine (60, 153, 60, 453);

	c.setFont (new Font ("Arial", Font.PLAIN, 16)); // This for loop essentially prints the letters to be used in the word bank.
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		c.drawString (hardLetters1 [i] [j], 74 + j * 24, 201 + i * 28);
	    }
	}

	c.setColor (Color.white); // This creates the white textbox where the user enters their input.
	c.fillRect (351, 401, 235, 55);

	Timer t = new Timer (c, time);

	if (timed == 't' || timed == 'T')
	{
	    t.start ();
	}

	c.setColor (text); // This sets the font for the text below:
	c.setFont (new Font ("Calibri", Font.PLAIN, 15));

	///////// STRUCTURE OF WORD SEARCH: /////////

	while (words < 15 && game && t.time () != 0) // While all the words have not yet been found....
	{
	    searchInput (t);

	    // These are the coordinates for the diagonal lines, that pass through the diagonal words.
	    int h = 47;
	    int l = 84;

	    int[] sweaterX = {96 + h, 98 + h, 255 + h, 253 + h};
	    int[] sweaterY = {188 + l, 186 + l, 368 + l, 370 + l};

	    int[] bootsX = {96, 98, 207, 205};
	    int[] bootsY = {243, 241, 370, 372};

	    int[] jacketX = {98, 100, 231, 229};
	    int[] jacketY = {246, 244, 401, 403};

	    if (game && t.time () != 0) // While the user does NOT quit the game, and the timer is still running....
	    {
		if (row1 == 1 && row2 == 1 && column1 == 4 && column2 == 10) // This block of code is used to cross out and identify the word 'mittens'.
		{
		    if (!hardWords1 [0].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (141, 194, 165, 3);

			// This crosses out the word on the word bank.
			c.fillRect (379, 213, 72, 3);

			hardWords1 [0] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"mittens\"!"); // This message pops up if they try to find a word they already found.
		    }
		}
		else if (row1 == 5 && row2 == 10 && column1 == 9 && column2 == 9)  // This block of code is used to cross out and identify the word 'gloves'.
		{
		    if (!hardWords1 [1].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (271, 296, 3, 165);

			// This crosses out the word on the word bank.
			c.fillRect (379, 237, 66, 3);

			hardWords1 [1] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"gloves\"!"); // This pops up if the user tried to find a word they already found.
		    }
		}
		else if (row1 == 5 && row2 == 9 && column1 == 3 && column2 == 3)  // This block of code is used to cross out and identify the word 'boots'.
		{
		    if (!hardWords1 [2].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (126, 294, 3, 140);

			// This crosses out the word on the word bank.
			c.fillRect (379, 261, 59, 3);

			hardWords1 [2] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"boots\"!"); // This message pops up if the user tries to find a word they already found...
		    }
		}
		else if (row1 == 3 && row2 == 8 && column1 == 2 && column2 == 7)  // This block of code is used to cross out and identify the word 'jacket'.
		{
		    if (!hardWords1 [3].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillPolygon (jacketX, jacketY, 4);

			// This crosses out the word on the word bank.
			c.fillRect (379, 285, 62, 3);

			hardWords1 [3] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"jacket\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 4 && row2 == 4 && column1 == 5 && column2 == 9)  // This block of code is used to cross out and identify the word 'parka'.
		{
		    if (!hardWords1 [4].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (166, 278, 113, 3);

			// This crosses out the word on the word bank.
			c.fillRect (379, 309, 59, 3);

			hardWords1 [4] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"parka\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 3 && row2 == 7 && column1 == 1 && column2 == 1)  // This block of code is used to cross out and identify the word 'scarf'.
		{
		    if (!hardWords1 [5].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (78, 239, 3, 139);

			// This crosses out the word on the word bank.
			c.fillRect (379, 333, 55, 3);
			hardWords1 [5] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"scarf\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 5 && row2 == 9 && column1 == 2 && column2 == 2)  // This block of code is used to cross out and identify the word 'socks'.
		{
		    if (!hardWords1 [6].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (102, 295, 3, 139);

			// This crosses out the word on the word bank.
			c.fillRect (379, 358, 56, 3);

			hardWords1 [6] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"socks\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 4 && row2 == 10 && column1 == 4 && column2 == 10)  // This block of code is used to cross out and identify the word 'sweater'.
		{
		    if (!hardWords1 [7].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillPolygon (sweaterX, sweaterY, 4);

			// This crosses out the word on the word bank.
			c.fillRect (379, 382, 78, 3);

			hardWords1 [7] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"sweater\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 5 && row2 == 7 && column1 == 8 && column2 == 8)  // This block of code is used to cross out and identify the word 'hat'.
		{
		    if (!hardWords1 [8].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (246, 296, 3, 81);

			// This crosses out the word on the word bank.
			c.fillRect (492, 213, 36, 3);

			hardWords1 [8] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"hat\"!"); // This message pops up if the user tried to find a word they already found.
		    }
		}
		else if (row1 == 10 && row2 == 10 && column1 == 2 && column2 == 6)  // This block of code is used to cross out and identify the word 'tunic'.
		{
		    if (!hardWords1 [9].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (94, 446, 115, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 237, 50, 3);

			hardWords1 [9] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"tunic\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 2 && row2 == 2 && column1 == 5 && column2 == 10)  // This block of code is used to cross out and identify the word 'fluffy'.
		{
		    if (!hardWords1 [10].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (166, 221, 137, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 261, 55, 3);

			hardWords1 [10] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"fluffy\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 4 && row2 == 8 && column1 == 10 && column2 == 10)  // This block of code is used to cross out and identify the word 'muffs'.
		{
		    if (!hardWords1 [11].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (295, 268, 3, 136);

			// This crosses out the word on the word bank.
			c.fillRect (492, 285, 55, 3);

			hardWords1 [11] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"muffs\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 3 && row2 == 3 && column1 == 5 && column2 == 10)  // This block of code is used to cross out and identify the word 'beanie'.
		{
		    if (!hardWords1 [12].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (166, 249, 138, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 309, 57, 3);

			hardWords1 [12] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"beanie\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 1 && row2 == 1 && column1 == 1 && column2 == 4)  // This block of code is used to cross out and identify the word 'warm'.
		{
		    if (!hardWords1 [13].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (71, 194, 92, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 333, 55, 3);

			hardWords1 [13] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"warm\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 9 && row2 == 9 && column1 == 4 && column2 == 8)  // This block of code is used to cross out and identify the word 'pants'.
		{
		    if (!hardWords1 [14].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (142, 417, 115, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 357, 52, 3);

			hardWords1 [14] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"pants\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else
		{
		    new Message ("That's not one of the words. Try again!"); // This error message pops up if the user tries to enter a word that isn't even in the puzzle...
		}
	    }
	}

	if (timed == 't' || timed == 'T') // The timer then stops running when the puzzle has been completed.
	{
	    t.stop ();
	}

	scores (words); // The user's score is accounted for.
	finalResults (); // After they complete the puzzle, the user progresses to the main menu.
    } // This is the ending bracket of the private 'hardSearch1' method.


    // Hard Search #2 Color Variables
    Color puzzleBg5 = new Color (83, 179, 182);
    Color puzzleSnow13 = new Color (186, 233, 235);
    Color puzzleSnow14 = new Color (168, 219, 221);
    Color puzzleSnow15 = new Color (148, 203, 205);


    private void hardSearch2 ()  // This is the private 'hardSearch2' method, which displays and creates our second hard word puzzle.
    {
	// User Input Variables (Used To Store User Input)
	words = 0;

	temp = ""; // Here, temp is set to null.

	game = true; // Here, game is set to true

	String[] hardWords2 = {"SLED", "SKI", "SNOWBOARD", "SNOWSHOE", "FORT", "SNOWMAN", "SKATE", "HOCKEY", "CURLING", "TUBING", "THROW", "RACE", "CLIMB", "SKID", "SLIDE"}; // Within this array, we are storing the words that are present in the word search.
	// This array contains the words that are a part of our word search.
	String[] [] hardLetters2 = {{"L", "N", "F", "X", "E", "S", "K", " I", "D", "S"}, {"S", "N", "O", "W", "B", "O", "A", "R", "D", "K"}, {"C", "U", "R", "L", " I", "N", "G", "J", "T", " I"}, {"L", "X", "T", "A", "H", "O", "C", "K", "E", "Y"}, {"T", "Y", "T", "R", "A", "C", "E", "O", "S", "S"}, {"H", "U", "L", "C", "L", " I", "M", "B", "L", "L"}, {"R", "S", "K", "A", "T", "E", "V", "E", "E", " I"}, {"O", "S", "N", "O", "W", "M", "A", "N", "D", "D"}, {"W", "H", "S", "N", "O", "W", "S", "H", "O", "E"}, {"L", "B", " I", "T", "U", "B", " I", "N", "G", "K"}}; // Within this array, we are storing the applicable letters used in the word search.
	// This array contains the letters that are a part of the word search.

	c.setColor (puzzleBg5); // This block of code creates the background of the word search.
	c.fillRect (0, 0, 640, 500);

	c.setColor (puzzleSnow13); // This block of code creates the first layer of background snow.
	c.fillOval (-76, 333, 275, 211);
	c.fillOval (107, 318, 275, 211);
	c.fillOval (282, 357, 275, 211);
	c.fillOval (467, 318, 275, 211);

	c.setColor (puzzleSnow14); // This block of code creates the second layer of background snow.
	c.fillOval (-107, 378, 275, 211);
	c.fillOval (85, 366, 275, 211);
	c.fillOval (268, 397, 275, 211);
	c.fillOval (469, 357, 275, 211);

	c.setColor (puzzleSnow15); // This block of code creates the third layer of background snow.
	c.fillOval (-76, 423, 275, 211);
	c.fillOval (130, 441, 275, 211);
	c.fillOval (315, 441, 275, 211);
	c.fillOval (30, 441, 275, 211);

	c.setColor (wordsearch); // This block of code creates the transparent text bubbles for the word search.
	c.fillRect (30, 141, 285, 331);
	c.fillRect (331, 141, 276, 331);

	///////// SNOWFLAKES: /////////

	// Snowflake #1
	c.setColor (Color.white);
	c.fillRect (544, 34, 11, 40);
	c.fillOval (544, 28, 11, 11);
	c.fillOval (544, 67, 11, 11);

	c.fillRect (529, 47, 40, 11);
	c.fillOval (523, 47, 11, 11);
	c.fillOval (564, 47, 11, 11);

	c.fillPolygon (flake1x, flake1y, 4);
	c.fillOval (560 + fx, 31 + fy, 11, 11);
	c.fillOval (531 + fx, 61 + fy, 11, 11);

	c.fillPolygon (flake2x, flake2y, 4);
	c.fillOval (531 + fx, 31 + fy, 11, 11);
	c.fillOval (560 + fx, 61 + fy, 11, 11);

	// Snowflake #2
	c.fillRect (544 + f2x, 34 + f2y, 11, 40);
	c.fillOval (544 + f2x, 28 + f2y, 11, 11);
	c.fillOval (544 + f2x, 67 + f2y, 11, 11);

	c.fillRect (529 + f2x, 47 + f2y, 40, 11);
	c.fillOval (523 + f2x, 47 + f2y, 11, 11);
	c.fillOval (564 + f2x, 47 + f2y, 11, 11);

	c.fillPolygon (flake3x, flake3y, 4);
	c.fillOval (560 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (531 + fx + f2x, 61 + fy + f2y, 11, 11);

	c.fillPolygon (flake4x, flake4y, 4);
	c.fillOval (531 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (560 + fx + f2x, 61 + fy + f2y, 11, 11);

	// Snowflake #3
	c.fillRect (544 + f3x, 34 + f3y, 11, 40);
	c.fillOval (544 + f3x, 28 + f3y, 11, 11);
	c.fillOval (544 + f3x, 67 + f3y, 11, 11);

	c.fillRect (529 + f3x, 47 + f3y, 40, 11);
	c.fillOval (523 + f3x, 47 + f3y, 11, 11);
	c.fillOval (564 + f3x, 47 + f3y, 11, 11);

	c.fillPolygon (flake5x, flake5y, 4);
	c.fillOval (560 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (531 + fx + f3x, 61 + fy + f3y, 11, 11);

	c.fillPolygon (flake6x, flake6y, 4);
	c.fillOval (531 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (560 + fx + f3x, 61 + fy + f3y, 11, 11);

	// This tells the user how they can quit the game.
	c.setColor (wordsearch);
	c.fillRect (6, 6, 120, 15);
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.BOLD, 12));
	c.drawString ("Enter 'q' to quit.", 28, 18);

	c.setColor (Color.white);
	c.setFont (new Font ("Arial Black", Font.BOLD, 40)); // This block of code creates the main title text of the screen.
	c.drawString ("WORD SEARCH", 135, 110);
	c.setFont (new Font ("Calibri Light", Font.ITALIC, 40));
	c.drawString ("Winter Wonderland", 150, 60);

	c.setFont (new Font ("Calibri", Font.ITALIC, 30)); // This block of code creates the word bank present on the screen.
	c.setColor (text);
	c.drawString ("WORD BANK", 390, 190);

	c.setFont (new Font ("Calibri Light", Font.PLAIN, 17)); // This block of code is used to draw out the words present from the word bank.
	for (int i = 0 ; i < 15 ; i++)
	{
	    if (i < 8)
	    {
		c.drawString (hardWords2 [i], 385, 220 + i * 24);
	    }
	    else
	    {
		c.drawString (hardWords2 [i], 495, 28 + i * 24);
	    }
	}


	///////// CROSSWORD PUZZLE (DETAILS + COMPOSITION): /////////

	c.setFont (new Font ("Calibri", Font.BOLD, 14)); // This block of code is being used to specify the rows, and the row numbers.
	for (int i = 1 ; i <= 10 ; i++)
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 43, 170 + i * 28);
	    }
	    else
	    {
		c.drawString ("" + i, 39, 170 + i * 28);
	    }
	}

	for (int i = 1 ; i <= 10 ; i++) // This block of code is being used to specify the columns, and the column numbers.
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 52 + i * 24, 166);
	    }
	    else
	    {
		c.drawString ("" + i, 48 + i * 24, 166);
	    }
	}

	c.drawLine (40, 173, 300, 173); // This block of code creates two lines to seperate the numbers for the rows and columns.
	c.drawLine (60, 153, 60, 453);

	c.setFont (new Font ("Arial", Font.PLAIN, 16)); // This for loop essentially prints the letters to be used in the word bank.
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		c.drawString (hardLetters2 [i] [j], 74 + j * 24, 201 + i * 28);
	    }
	}

	c.setColor (Color.white); // This creates the white textbox where the user enters their input.
	c.fillRect (351, 401, 235, 55);

	Timer t = new Timer (c, time);

	if (timed == 't' || timed == 'T') // This starts the timer.
	{
	    t.start ();
	}

	c.setColor (text); // This sets the font for the text below:
	c.setFont (new Font ("Calibri", Font.PLAIN, 15));

	///////// STRUCTURE OF WORD SEARCH: /////////

	while (words < 15 && game && t.time () != 0) // While all the words have not yet been found....
	{
	    searchInput (t);

	    // These are the coordinates for the diagonal lines, that pass through the diagonal words.
	    int h = 47;
	    int l = 84;

	    int[] sweaterX = {96 + h, 98 + h, 255 + h, 253 + h};
	    int[] sweaterY = {188 + l, 186 + l, 368 + l, 370 + l};

	    int[] bootsX = {96, 98, 207, 205};
	    int[] bootsY = {243, 241, 370, 372};

	    int[] jacketX = {98, 100, 231, 229};
	    int[] jacketY = {246, 244, 401, 403};

	    if (game && t.time () != 0) // While the user has NOT quit the game, and the time is still running....
	    {
		if (row1 == 5 && row2 == 8 && column1 == 9 && column2 == 9) // This block of code is used to cross out and identify the word 'sled'.
		{
		    if (!hardWords2 [0].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (294, 296, 3, 106);

			// This crosses out the word on the word bank.
			c.fillRect (379, 213, 46, 3);

			hardWords2 [0] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"sled\"!"); // This message pops up if they try to find a word they already found.
		    }
		}
		else if (row1 == 1 && row2 == 3 && column1 == 10 && column2 == 10)  // This block of code is used to cross out and identify the word 'ski'.
		{
		    if (!hardWords2 [1].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (294, 185, 3, 79);

			// This crosses out the word on the word bank.
			c.fillRect (379, 237, 35, 3);

			hardWords2 [1] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"ski\"!"); // This pops up if the user tried to find a word they already found.
		    }
		}
		else if (row1 == 2 && row2 == 2 && column1 == 1 && column2 == 9)  // This block of code is used to cross out and identify the word 'snowboard'.
		{
		    if (!hardWords2 [2].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (70, 221, 212, 3);

			// This crosses out the word on the word bank.
			c.fillRect (379, 261, 106, 3);

			hardWords2 [2] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"snowboard\"!"); // This message pops up if the user tries to find a word they already found...
		    }
		}
		else if (row1 == 9 && row2 == 9 && column1 == 3 && column2 == 10)  // This block of code is used to cross out and identify the word 'snowshoe'.
		{
		    if (!hardWords2 [3].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (118, 417, 188, 3);

			// This crosses out the word on the word bank.
			c.fillRect (379, 285, 94, 3);

			hardWords2 [3] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"snowshoe\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 1 && row2 == 4 && column1 == 3 && column2 == 3)  // This block of code is used to cross out and identify the word 'fort'.
		{
		    if (!hardWords2 [4].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (125, 185, 3, 105);

			// This crosses out the word on the word bank.
			c.fillRect (379, 309, 48, 3);

			hardWords2 [4] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"fort\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 8 && row2 == 8 && column1 == 2 && column2 == 8)  // This block of code is used to cross out and identify the word 'snowman'.
		{
		    if (!hardWords2 [5].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (94, 389, 163, 3);

			// This crosses out the word on the word bank.
			c.fillRect (379, 333, 92, 3);
			hardWords2 [5] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"snowman\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 7 && row2 == 7 && column1 == 2 && column2 == 6)  // This block of code is used to cross out and identify the word 'skate'.
		{
		    if (!hardWords2 [6].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (94, 362, 115, 3);

			// This crosses out the word on the word bank.
			c.fillRect (379, 358, 56, 3);

			hardWords2 [6] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"skate\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 4 && row2 == 4 && column1 == 5 && column2 == 10)  // This block of code is used to cross out and identify the word 'hockey'.
		{
		    if (!hardWords2 [7].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (167, 278, 135, 3);

			// This crosses out the word on the word bank.
			c.fillRect (379, 382, 67, 3);

			hardWords2 [7] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"hockey\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 3 && row2 == 3 && column1 == 1 && column2 == 7)  // This block of code is used to cross out and identify the word 'curling'.
		{
		    if (!hardWords2 [8].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (70, 250, 163, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 213, 67, 3);

			hardWords2 [8] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"curling\"!"); // This message pops up if the user tried to find a word they already found.
		    }
		}
		else if (row1 == 10 && row2 == 10 && column1 == 4 && column2 == 9)  // This block of code is used to cross out and identify the word 'tubing'.
		{
		    if (!hardWords2 [9].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (144, 446, 136, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 237, 60, 3);

			hardWords2 [9] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"tubing\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 5 && row2 == 9 && column1 == 1 && column2 == 1)  // This block of code is used to cross out and identify the word 'throw'.
		{
		    if (!hardWords2 [10].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (78, 296, 3, 134);

			// This crosses out the word on the word bank.
			c.fillRect (492, 261, 61, 3);

			hardWords2 [10] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"throw\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 5 && row2 == 5 && column1 == 4 && column2 == 7)  // This block of code is used to cross out and identify the word 'race'.
		{
		    if (!hardWords2 [11].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (143, 307, 87, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 285, 43, 3);

			hardWords2 [11] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"race\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 6 && row2 == 6 && column1 == 4 && column2 == 8)  // This block of code is used to cross out and identify the word 'climb'.
		{
		    if (!hardWords2 [12].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (143, 334, 112, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 309, 50, 3);

			hardWords2 [12] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"climb\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 1 && row2 == 1 && column1 == 6 && column2 == 9)  // This block of code is used to cross out and identify the word 'skid'.
		{
		    if (!hardWords2 [13].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (191, 193, 90, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 333, 38, 3);

			hardWords2 [13] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"skid\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 5 && row2 == 9 && column1 == 10 && column2 == 10)  // This block of code is used to cross out and identify the word 'slide'.
		{
		    if (!hardWords2 [14].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (294, 295, 3, 139);

			// This crosses out the word on the word bank.
			c.fillRect (492, 357, 44, 3);

			hardWords2 [14] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"slide\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else
		{
		    new Message ("That's not one of the words. Try again!"); // This error message pops up if the user tries to enter a word that isn't even in the puzzle...
		}
	    }
	}

	if (timed == 't' || timed == 'T') // The timer then stops.
	{
	    t.stop ();
	}

	scores (words); // We are accounting for the user's score.
	finalResults (); // After they complete the puzzle, the user progresses to the main menu.
    } // This is the ending bracket of the private 'hardSearch2' method.


    // Hard Search #3 Color Variables
    Color puzzleBg6 = new Color (241, 189, 222);
    Color puzzleSnow16 = new Color (232, 168, 209);
    Color puzzleSnow17 = new Color (207, 132, 180);
    Color puzzleSnow18 = new Color (175, 101, 148);

    int row1 = 1;
    int column1 = 1;
    int row2 = 1;
    int column2 = 1;

    private void hardSearch3 ()  // This is the private 'hardSearch3' method, which displays and creates our first easy word search (relating to winter clothing).
    {
	// User Input Variables (Used To Store User Input)
	words = 0;

	temp = ""; // Here, temp is set to null.

	game = true; // Here, game is set to true

	String[] hardWords3 = {"SPICE", "COFFEE", "GINGER", "CANE", "TEA", "COCO", "HOT", "CINNAMON", "CHOCOLATE", "COOKIE", "MINT", "NUTMEG", "SWEET", "COZY", "MILKY"}; // Within this array, we are storing the words that are present in the word search.
	String[] [] hardLetters3 = {{"C", "G", "W", "C", "O", "F", "F", "E", "E", "C"}, {"X", "V", "M", " I", "N", "T", "H", "Q", "G", " I"}, {"C", "H", "O", "C", "O", "L", "A", "T", "E", "N"}, {"P", "C", "T", "X", "E", "Z", "H", "M", "M", "N"}, {"C", "O", "C", "O", "O", "T", "O", "S", " I", "A"}, {"C", "Z", "S", "W", "E", "E", "T", "P", "L", "M"}, {"A", "Y", "H", "X", "B", "A", "M", " I", "K", "O"}, {"N", "U", "T", "M", "E", "G", "M", "C", "Y", "N"}, {"E", "K", "W", "G", " I", "N", "G", "E", "R", "Y"}, {"C", "O", "O", "K", " I", "E", "N", "P", " I", "Q"}}; // Within this array, we are storing the applicable letters used in the word search.

	c.setColor (puzzleBg6); // This block of code creates the background of the word search.
	c.fillRect (0, 0, 640, 500);

	c.setColor (puzzleSnow16); // This block of code creates the first layer of background snow.
	c.fillOval (-76, 333, 275, 211);
	c.fillOval (107, 318, 275, 211);
	c.fillOval (282, 357, 275, 211);
	c.fillOval (467, 318, 275, 211);

	c.setColor (puzzleSnow17); // This block of code creates the second layer of background snow.
	c.fillOval (-107, 378, 275, 211);
	c.fillOval (85, 366, 275, 211);
	c.fillOval (268, 397, 275, 211);
	c.fillOval (469, 357, 275, 211);

	c.setColor (puzzleSnow18); // This block of code creates the third layer of background snow.
	c.fillOval (-76, 423, 275, 211);
	c.fillOval (130, 441, 275, 211);
	c.fillOval (315, 441, 275, 211);
	c.fillOval (30, 441, 275, 211);

	c.setColor (wordsearch); // This block of code creates the transparent text bubbles for the word search.
	c.fillRect (30, 141, 285, 331);
	c.fillRect (331, 141, 276, 331);

	///////// SNOWFLAKES: /////////

	// Snowflake #1
	c.setColor (Color.white);
	c.fillRect (544, 34, 11, 40);
	c.fillOval (544, 28, 11, 11);
	c.fillOval (544, 67, 11, 11);

	c.fillRect (529, 47, 40, 11);
	c.fillOval (523, 47, 11, 11);
	c.fillOval (564, 47, 11, 11);

	c.fillPolygon (flake1x, flake1y, 4);
	c.fillOval (560 + fx, 31 + fy, 11, 11);
	c.fillOval (531 + fx, 61 + fy, 11, 11);

	c.fillPolygon (flake2x, flake2y, 4);
	c.fillOval (531 + fx, 31 + fy, 11, 11);
	c.fillOval (560 + fx, 61 + fy, 11, 11);

	// Snowflake #2
	c.fillRect (544 + f2x, 34 + f2y, 11, 40);
	c.fillOval (544 + f2x, 28 + f2y, 11, 11);
	c.fillOval (544 + f2x, 67 + f2y, 11, 11);

	c.fillRect (529 + f2x, 47 + f2y, 40, 11);
	c.fillOval (523 + f2x, 47 + f2y, 11, 11);
	c.fillOval (564 + f2x, 47 + f2y, 11, 11);

	c.fillPolygon (flake3x, flake3y, 4);
	c.fillOval (560 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (531 + fx + f2x, 61 + fy + f2y, 11, 11);

	c.fillPolygon (flake4x, flake4y, 4);
	c.fillOval (531 + fx + f2x, 31 + fy + f2y, 11, 11);
	c.fillOval (560 + fx + f2x, 61 + fy + f2y, 11, 11);

	// Snowflake #3
	c.fillRect (544 + f3x, 34 + f3y, 11, 40);
	c.fillOval (544 + f3x, 28 + f3y, 11, 11);
	c.fillOval (544 + f3x, 67 + f3y, 11, 11);

	c.fillRect (529 + f3x, 47 + f3y, 40, 11);
	c.fillOval (523 + f3x, 47 + f3y, 11, 11);
	c.fillOval (564 + f3x, 47 + f3y, 11, 11);

	c.fillPolygon (flake5x, flake5y, 4);
	c.fillOval (560 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (531 + fx + f3x, 61 + fy + f3y, 11, 11);

	c.fillPolygon (flake6x, flake6y, 4);
	c.fillOval (531 + fx + f3x, 31 + fy + f3y, 11, 11);
	c.fillOval (560 + fx + f3x, 61 + fy + f3y, 11, 11);

	c.setColor (wordsearch);
	c.fillRect (6, 6, 120, 15);
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.BOLD, 12));
	c.drawString ("Enter 'q' to quit.", 28, 18);

	c.setColor (Color.white);
	c.setFont (new Font ("Arial Black", Font.BOLD, 40)); // This block of code creates the main title text of the screen.
	c.drawString ("WORD SEARCH", 135, 110);
	c.setFont (new Font ("Calibri Light", Font.ITALIC, 40));
	c.drawString ("Winter Wonderland", 150, 60);

	c.setFont (new Font ("Calibri", Font.ITALIC, 30)); // This block of code creates the word bank present on the screen.
	c.setColor (text);
	c.drawString ("WORD BANK", 390, 190);

	c.setFont (new Font ("Calibri Light", Font.PLAIN, 17)); // This block of code is used to draw out the words present from the word bank.
	for (int i = 0 ; i < 15 ; i++)
	{
	    if (i < 8)
	    {
		c.drawString (hardWords3 [i], 385, 220 + i * 24);
	    }
	    else
	    {
		c.drawString (hardWords3 [i], 495, 28 + i * 24);
	    }
	}


	///////// CROSSWORD PUZZLE (DETAILS + COMPOSITION): /////////

	c.setFont (new Font ("Calibri", Font.BOLD, 14)); // This block of code is being used to specify the rows, and the row numbers.
	for (int i = 1 ; i <= 10 ; i++)
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 43, 170 + i * 28);
	    }
	    else
	    {
		c.drawString ("" + i, 39, 170 + i * 28);
	    }
	}

	for (int i = 1 ; i <= 10 ; i++) // This block of code is being used to specify the columns, and the column numbers.
	{
	    if (i < 10)
	    {
		c.drawString ("" + i, 52 + i * 24, 166);
	    }
	    else
	    {
		c.drawString ("" + i, 48 + i * 24, 166);
	    }
	}

	c.drawLine (40, 173, 300, 173); // This block of code creates two lines to seperate the numbers for the rows and columns.
	c.drawLine (60, 153, 60, 453);

	c.setFont (new Font ("Arial", Font.PLAIN, 16)); // This for loop essentially prints the letters to be used in the word bank.
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		c.drawString (hardLetters3 [i] [j], 74 + j * 24, 201 + i * 28);
	    }
	}

	c.setColor (Color.white); // This creates the white textbox where the user enters their input.
	c.fillRect (351, 401, 235, 55);

	Timer t = new Timer (c, time);

	if (timed == 't' || timed == 'T')
	{
	    t.start ();
	}

	c.setColor (text); // This sets the font for the text below:
	c.setFont (new Font ("Calibri", Font.PLAIN, 15));

	///////// STRUCTURE OF WORD SEARCH: /////////

	while (words < 15 && game && t.time () != 0) // While all the words have not yet been found....
	{
	    searchInput (t);

	    // These are the coordinates for the diagonal lines, that pass through the diagonal words.
	    int h = 47;
	    int l = 84;

	    int[] sweaterX = {96 + h, 98 + h, 255 + h, 253 + h};
	    int[] sweaterY = {188 + l, 186 + l, 368 + l, 370 + l};

	    int[] bootsX = {96, 98, 207, 205};
	    int[] bootsY = {243, 241, 370, 372};

	    int[] jacketX = {98, 100, 231, 229};
	    int[] jacketY = {246, 244, 401, 403};

	    if (game && t.time () != 0)
	    {
		if (row1 == 5 && row2 == 9 && column1 == 8 && column2 == 8) // This block of code is used to cross out and identify the word 'spice'.
		{
		    if (!hardWords3 [0].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (246, 296, 3, 136);

			// This crosses out the word on the word bank.
			c.fillRect (379, 213, 50, 3);

			hardWords3 [0] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"spice\"!"); // This message pops up if they try to find a word they already found.
		    }
		}
		else if (row1 == 1 && row2 == 1 && column1 == 4 && column2 == 9)  // This block of code is used to cross out and identify the word 'coffee'.
		{
		    if (!hardWords3 [1].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (144, 193, 135, 3);

			// This crosses out the word on the word bank.
			c.fillRect (379, 237, 65, 3);

			hardWords3 [1] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"coffee\"!"); // This pops up if the user tried to find a word they already found.
		    }
		}
		else if (row1 == 9 && row2 == 9 && column1 == 4 && column2 == 9)  // This block of code is used to cross out and identify the word 'ginger'.
		{
		    if (!hardWords3 [2].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (143, 417, 137, 3);

			// This crosses out the word on the word bank.
			c.fillRect (379, 261, 67, 3);

			hardWords3 [2] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"ginger\"!"); // This message pops up if the user tries to find a word they already found...
		    }
		}
		else if (row1 == 6 && row2 == 9 && column1 == 1 && column2 == 1)  // This block of code is used to cross out and identify the word 'cane'.
		{
		    if (!hardWords3 [3].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (78, 325, 3, 107);

			// This crosses out the word on the word bank.
			c.fillRect (379, 285, 50, 3);

			hardWords3 [3] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"cane\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 5 && row2 == 7 && column1 == 6 && column2 == 6)  // This block of code is used to cross out and identify the word 'tea'.
		{
		    if (!hardWords3 [4].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (198, 295, 3, 79);

			// This crosses out the word on the word bank.
			c.fillRect (379, 309, 40, 3);

			hardWords3 [4] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"tea\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 5 && row2 == 5 && column1 == 1 && column2 == 4)  // This block of code is used to cross out and identify the word 'coco'.
		{
		    if (!hardWords3 [5].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (71, 306, 90, 3);

			// This crosses out the word on the word bank.
			c.fillRect (379, 333, 52, 3);
			hardWords3 [5] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"coco\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 4 && row2 == 6 && column1 == 7 && column2 == 7)  // This block of code is used to cross out and identify the word 'hot'.
		{
		    if (!hardWords3 [6].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (222, 269, 3, 76);

			// This crosses out the word on the word bank.
			c.fillRect (379, 358, 45, 3);

			hardWords3 [6] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"hot\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 1 && row2 == 8 && column1 == 10 && column2 == 10)  // This block of code is used to cross out and identify the word 'cinnamon'.
		{
		    if (!hardWords3 [7].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (295, 185, 3, 220);

			// This crosses out the word on the word bank.
			c.fillRect (378, 382, 95, 3);

			hardWords3 [7] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"cinnamon\"!"); // This message pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 3 && row2 == 3 && column1 == 1 && column2 == 9)  // This block of code is used to cross out and identify the word 'chocolate'.
		{
		    if (!hardWords3 [8].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (70, 250, 210, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 213, 90, 3);

			hardWords3 [8] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"chocolate\"!"); // This message pops up if the user tried to find a word they already found.
		    }
		}
		else if (row1 == 10 && row2 == 10 && column1 == 1 && column2 == 6)  // This block of code is used to cross out and identify the word 'cookie'.
		{
		    if (!hardWords3 [9].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (71, 446, 135, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 237, 58, 3);

			hardWords3 [9] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"cookie\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 2 && row2 == 2 && column1 == 3 && column2 == 6)  // This block of code is used to cross out and identify the word 'mint'.
		{
		    if (!hardWords3 [10].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (119, 221, 86, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 261, 43, 3);

			hardWords3 [10] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"mint\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 8 && row2 == 8 && column1 == 1 && column2 == 6)  // This block of code is used to cross out and identify the word 'nutmeg'.
		{
		    if (!hardWords3 [11].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (71, 389, 137, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 285, 67, 3);

			hardWords3 [11] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"nutmeg\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 6 && row2 == 6 && column1 == 3 && column2 == 7)  // This block of code is used to cross out and identify the word 'sweet'.
		{
		    if (!hardWords3 [12].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (119, 333, 111, 3);

			// This crosses out the word on the word bank.
			c.fillRect (492, 309, 52, 3);

			hardWords3 [12] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"sweet\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 4 && row2 == 7 && column1 == 2 && column2 == 2)  // This block of code is used to cross out and identify the word 'cozy'.
		{
		    if (!hardWords3 [13].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (102, 267, 3, 106);

			// This crosses out the word on the word bank.
			c.fillRect (492, 333, 40, 3);

			hardWords3 [13] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"cozy\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else if (row1 == 4 && row2 == 8 && column1 == 9 && column2 == 9)  // This block of code is used to cross out and identify the word 'milky'.
		{
		    if (!hardWords3 [14].equals ("x"))
		    {
			// This crosses out the word on the puzzle.
			c.setColor (text);
			c.fillRect (270, 268, 3, 134);

			// This crosses out the word on the word bank.
			c.fillRect (492, 357, 46, 3);

			hardWords3 [14] = "x";
			if (t.time () != 0)
			{
			    words++;
			}
		    }
		    else
		    {
			new Message ("You have already found \"milky\"!"); // This pops up if the user tries to find a word they already found.
		    }
		}
		else
		{
		    new Message ("That's not one of the words. Try again!"); // This error message pops up if the user tries to enter a word that isn't even in the puzzle...
		}
	    }
	}

	if (timed == 't' || timed == 'T')
	{
	    t.stop ();
	}

	scores (words);
	finalResults (); // After they complete the puzzle, the user progresses to the main menu.
    } // This is the ending bracket of the private 'hardSearch3' method.


    private void askName ()  // This is the private 'askName' method, which, as indicated by the name, simply asks the user for their username.
    {
	c.setColor (gradient1); // The blocks of code below form the various shades of blue for the gradient background.
	c.fillRect (0, 0, 640, 100);

	c.setColor (gradient2);
	c.fillRect (0, 100, 640, 100);

	c.setColor (gradient3);
	c.fillRect (0, 200, 640, 100);

	c.setColor (gradient4);
	c.fillRect (0, 300, 640, 100);

	c.setColor (gradient5);
	c.fillRect (0, 400, 640, 100);

	c.setColor (Color.white); // This block of code forms the main white text box, featuring our written text.
	c.fillRect (59, 52, 522, 400);

	c.setColor (gradient1); // This block of code displays our the title text.
	c.setFont (new Font ("Segoe Script", Font.PLAIN, 45));
	c.drawString ("what shall we", 144, 130);
	c.drawString ("call you?", 209, 180);

	c.setColor (Color.white); // This block of code is being utilized to add additional white accents or pieces onto our screen.
	c.fillRect (92, 241, 457, 179);

	c.setColor (gradient1); // This block of code displays the body text.
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 17));
	c.drawString ("Before we officially begin,", 222, 260);
	c.setFont (new Font ("Malgun Gothic", Font.BOLD, 17));
	c.drawString ("please enter your name below.", 196, 285);
	c.drawString ("scoreboard", 316, 348);
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 17));
	c.drawString ("Whatever name you choose to enter, will", 162, 323);
	c.drawString ("be displayed on our ", 157, 348);
	c.drawString (", so please", 407, 348);
	c.drawString ("keep it user-friendly!", 235, 373);

	c.setColor (gradient1); // This block of code adds a blue 'accent' to our screen.
	c.fillRect (240, 214, 161, 3);

	c.setColor (gradient1); // This block of code features many blue stars, of the lightest shade of blue, near the top right of the screen.
	c.fillStar (35, 319, 48, 45);
	c.fillStar (73, 291, 27, 25);
	c.fillStar (67, 266, 16, 14);

	c.setColor (gradient3); // This block of code displays 3 blue stars, of a purplish-blue shade, near the bottom right of the screen.
	c.fillStar (509, 390, 48, 45);
	c.fillStar (491, 357, 27, 25);
	c.fillStar (510, 328, 16, 14);

	c.setColor (gradient5); // This block of code displays 3 beautiful dark blue stars, near the bottom left of the screen.
	c.fillStar (551, 27, 48, 45);
	c.fillStar (499, 35, 27, 25);
	c.fillStar (464, 15, 16, 14);

	c.setCursor (20, 37);
	c.setTextBackgroundColor (new Color (0, 0, 0, 0));

	name = c.readLine (); // Here, we ask for the user's name.

	while (name.length () > 16)
	{
	    new Message ("Your username is too long! Maximum name length is 16 characters.");

	    c.setCursor (20, 37);
	    c.setColor (Color.white);
	    c.fillRect (250, 385, 270, 20);
	    name = c.readLine (); // Here, we ask for the user's name again.
	}

	askTimer (); // We progress to the askTime method.
    } // This is the ending bracket of the method.


    private void askTimer ()  // This is the private 'askTimer' method, which asks the user to enter which time limit they prefer.
    {
	time = -1;

	c.setColor (gradient1); // The blocks of code below form the various shades of blue of the gradient background.
	c.fillRect (0, 0, 640, 100);

	c.setColor (gradient2);
	c.fillRect (0, 100, 640, 100);

	c.setColor (gradient3);
	c.fillRect (0, 200, 640, 100);

	c.setColor (gradient4);
	c.fillRect (0, 300, 640, 100);

	c.setColor (gradient5);
	c.fillRect (0, 400, 640, 100);

	c.setColor (Color.white); // This block of code forms the main white textbox on the screen, onto which our text is projected.
	c.fillRect (59, 52, 522, 400);

	c.setColor (gradient1); // This block of code produces the title text.
	c.setFont (new Font ("Segoe Script", Font.PLAIN, 50));
	c.drawString ("time's up!", 195, 143);

	c.setColor (gradient1); // This block of code forms the body text.
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 17));
	c.drawString ("This puzzle can be played two ways:", 172, 224);
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 19));
	c.drawString ("and", 287, 249);
	c.setFont (new Font ("Malgun Gothic", Font.BOLD, 19));
	c.drawString ("Timed       Untimed.", 221, 249);
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 17));
	c.drawString ("Enter 'u' to play an untimed puzzle, and 't'", 155, 287);
	c.drawString ("for a timed puzzle:", 240, 312);

	c.setColor (gradient1); // This block of code adds a blue 'accent' onto our screen.
	c.fillRect (214, 170, 210, 3);

	c.setColor (gradient4); // This block of code forms the main body of the clock (including the white 'body' of the block, the light blue outline, and the dark blue inner surface).
	c.fillOval (35, 24, 127, 127);
	c.setColor (Color.white);
	c.fillOval (44, 33, 108, 108);
	c.setColor (gradient1);
	c.fillOval (90, 79, 16, 16);

	for (int i = 0 ; i <= 3 ; i++) // This block of code creates the 'lines' on the clock.
	{
	    c.drawLine (96 + i, 43, 96 + i, 57);
	    c.drawLine (96 + i, 116, 96 + i, 130);
	    c.drawLine (52, 85 + i, 66, 85 + i);
	    c.drawLine (130, 85 + i, 144, 85 + i);
	}

	timed = ' '; // 'timed' is set to ' '.

	while (timed != 'u' && timed != 'U' && timed != 't' && timed != 'T') // While the input is not valid...
	{
	    timed = c.getChar (); // We obtain input from the user in the form of a character (more specifically, an integer), imploring them as to what time limit they prefer (between 1 min and 30 min).

	    if (timed == 't' || timed == 'T') // If the user chooses a timed puzzle, we display the following options.
	    {
		c.drawString ("Please enter your preferred time limit in", 163, 350);
		c.drawString ("minutes (min. 1 minute, max. 30 minutes):", 154, 375);

		while (true)
		{
		    c.setCursor (20, 40); // This block of code simply sets the position of the cursor, in addition to the background color of the cursor, as well as other graphics pertinent for user input.
		    c.setColor (Color.white);
		    c.setTextBackgroundColor (new Color (0, 0, 0, 0));
		    c.fillRect (300, 415, 100, 30);

		    c.setColor (gradient1); // This is setting the color for the graphics and text below.
		    try
		    {
			temp = c.readLine ();
			time = Integer.parseInt (temp); // Here, we are obtaining input from the user in the form of a string, and converting it into an integer.

			if (time > 30 || time < 1) // If the integer entered by the user is greater than 30, or less than 1, then a 'NumberFormatException' error will be thrown.
			{
			    throw new NumberFormatException ();
			}

			break;
		    }
		    catch (NumberFormatException e)  // This distinct block of code is being used in order to catch an error (in the case the user does not enter an applicable integer or value).
		    {
			new Message ("Please enter an integer between 1 and 30 inclusive. E.g: For 5 minutes, type the number '5'"); // This block of code is error-trapping the user's input, ensuring that the user stays within the limit.
			c.setColor (Color.white); // The blocks of code below are drawing rectangles of the same colour(s) as the background, to cover up previously incorrect input.
			c.fillRect (59, 380, 522, 100);
			c.setColor (gradient5);
			c.fillRect (0, 400, 59, 100);
			c.fillRect (581, 400, 59, 100);
			c.fillRect (59, 452, 522, 50);
			c.setColor (gradient4);
			c.fillRect (0, 300, 59, 100);
			c.fillRect (581, 300, 59, 100);
		    }
		}
	    }
	    else if (timed != 'u' && timed != 'U')
	    {
		new Message ("Please press either 'u' or 't'");
	    }
	}

	askDifficulty (); // We then progress to askDifficulty();
    } // This is the ending bracket of the private 'askTimer' method.


    private void scores (int words)  // This method creates the file that we are going to store the scores within.
    {
	try
	{
	    FileWriter d = new FileWriter ("scoreboard.txt", true); // We are writing and storing information within our 'scoreboard' file.

	    d.write (name + "\n" + words + "\n" + difficulty + "\n"); // We are displaying the name in of the user in row 1, their score in row 2, and their mode in row 3.

	    d.close (); // We then close the file.
	}
	catch (IOException e)
	{
	    new Message ("The file scoreboard.txt could not be opened"); // This message pops up if the file cannot be opened.
	}
    } // This is the ending bracket of the method.


    private void searchInput (Timer t)  // This method takes the user input for each word search puzzle
    {
	// This block of code asks for the first letter's row.
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.PLAIN, 15));
	c.drawString ("Enter the first letter's row: ", 370, 434);
	c.setTextColor (text);
	c.setTextBackgroundColor (new Color (0, 0, 0, 0));
	c.setColor (Color.white);

	// Here, we are error-trapping the input, to make sure the user enters a number from 1 to 10.
	while (true && game && t.time () != 0)
	{
	    c.setCursor (22, 68);
	    try
	    {
		temp = c.readLine ();
		if (temp.toLowerCase ().equals ("q"))
		{
		    game = false;
		    break;
		}
		else
		{
		    row1 = Integer.parseInt (temp);
		    if (row1 < 1 || row1 > 10)
		    {
			throw new NumberFormatException ();
		    }
		    break;
		}
	    }
	    catch (NumberFormatException e)
	    {
		new Message ("Please enter a number from 1 to 10, or q to quit.");
		c.setColor (Color.white);
		c.fillRect (535, 425, 50, 20);
	    }
	}
	c.setColor (Color.white);
	c.fillRect (435, 425, 150, 20); // This draws a rectangle over the previous input.

	// This block of code asks for the first letter's column.
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.PLAIN, 15));
	c.drawString ("Enter the first letter's column: ", 370, 434);
	c.setColor (Color.white);

	// Here, we are error-trapping the input, to make sure the user enters a number from 1 to 10.
	while (true && game && t.time () != 0)
	{
	    c.setCursor (22, 71);
	    try
	    {
		temp = c.readLine ();
		if (temp.toLowerCase ().equals ("q"))
		{
		    game = false;
		    break;
		}
		else
		{
		    column1 = Integer.parseInt (temp);
		    if (column1 < 1 || column1 > 10)
		    {
			throw new NumberFormatException ();
		    }
		    break;
		}
	    }
	    catch (NumberFormatException e)
	    {
		new Message ("Please enter a number from 1 to 10, or q to quit.");
	    }
	    c.setColor (Color.white);
	    c.fillRect (555, 425, 30, 20);
	}
	c.fillRect (351, 401, 235, 55); // This draws a rectangle over the user's previous input.

	// This block of code asks for the second letter's row.
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.PLAIN, 15));
	c.drawString ("Enter the last letter's row: ", 370, 434);
	c.setTextColor (text);
	c.setTextBackgroundColor (new Color (0, 0, 0, 0));
	c.setColor (Color.white);

	// Here, we are error-trapping the input, to make sure the user enters a number from 1 to 10.
	while (true && game && t.time () != 0)
	{
	    c.setCursor (22, 68);
	    try
	    {
		temp = c.readLine ();
		if (temp.toLowerCase ().equals ("q"))
		{
		    game = false;
		    break;
		}
		else
		{
		    row2 = Integer.parseInt (temp);
		    if (row2 < 1 || row2 > 10)
		    {
			throw new NumberFormatException ();
		    }
		    break;
		}
	    }
	    catch (NumberFormatException e)
	    {
		new Message ("Please enter a number from 1 to 10, or q to quit.");
		c.setColor (Color.white);
		c.fillRect (535, 420, 50, 25);
	    }
	}
	c.setColor (Color.white);
	c.fillRect (351, 401, 235, 55); // This draws a rectangle over the previous input.

	// This block of code asks for the second letter's column.
	c.setColor (text);
	c.setFont (new Font ("Calibri", Font.PLAIN, 15));
	c.drawString ("Enter the last letter's column: ", 360, 434);
	c.setColor (Color.white);

	// Here, we are error-trapping the input, to make sure the user enters a number from 1 to 10.
	while (true && game && t.time () != 0)
	{
	    c.setCursor (22, 69);
	    try
	    {
		temp = c.readLine ();
		if (temp.toLowerCase ().equals ("q"))
		{
		    game = false;
		    break;
		}
		else
		{
		    column2 = Integer.parseInt (temp);
		    if (column2 < 1 || column2 > 10)
		    {
			throw new NumberFormatException ();
		    }
		    break;
		}
	    }
	    catch (NumberFormatException e)
	    {
		new Message ("Please enter a number from 1 to 10, or q to quit.");
	    }
	    c.setColor (Color.white);
	    c.fillRect (540, 420, 45, 25);
	}
	c.setColor (Color.white);
	c.fillRect (351, 401, 235, 55); // This draws a rectangle over the previous input.
    }


    public void finalResults ()  // This is the public 'finalResults' method, which displays the final score of the user.
    {
	// This block of code creates the background gradient.
	c.setColor (gradient5);
	c.fillRect (0, 0, 640, 100);

	c.setColor (gradient4);
	c.fillRect (0, 100, 640, 100);

	c.setColor (gradient3);
	c.fillRect (0, 200, 640, 100);

	c.setColor (gradient2);
	c.fillRect (0, 300, 640, 100);

	c.setColor (gradient1);
	c.fillRect (0, 400, 640, 100);

	// This creates the white textbox onto which our body text is displayed.
	c.setColor (Color.white);
	c.fillRect (59, 52, 522, 400);

	// This creates the title text.
	c.setColor (gradient1);
	c.setFont (new Font ("Segoe Script", Font.PLAIN, 50));
	c.drawString ("final results!", 155, 130);

	// This block of code creates the textbox gradient.
	c.setColor (new Color (217, 239, 246));
	c.fillRect (92, 200, 456, 220);

	c.setColor (new Color (235, 247, 250));
	c.fillRect (105, 211, 433, 197);

	c.setColor (new Color (245, 253, 255));
	c.fillRect (118, 222, 410, 175);

	c.setColor (Color.WHITE);
	c.fillRect (128, 231, 389, 156);

	// This block of code displays a message to the user.
	c.setColor (gradient1);
	c.setFont (new Font ("Malgun Gothic", Font.PLAIN, 22));
	c.drawString ("Hello, and welcome back!", 192, 269);
	c.drawString ("Your final score is:", 227, 304);
	c.drawString ("" + words, 312, 329);
	c.drawString ("Click any key to continue!", 187, 364);

	// This block of code creates the rectangular borders of the text box.
	c.setColor (gradient1);
	c.fillRect (197, 157, 250, 3);
	c.fillRect (517, 189, 43, 3);
	c.fillRect (557, 189, 3, 44);
	c.fillRect (82, 387, 3, 44);
	c.fillRect (82, 428, 43, 3);

	// This block of code creates several stars.
	c.setColor (gradient1);
	c.fillStar (73, 175, 52, 50);
	c.fillStar (516, 386, 52, 50);
	c.setColor (gradient2);
	c.fillStar (133, 205, 31, 30);
	c.fillStar (477, 376, 31, 30);
	c.setColor (gradient3);
	c.fillStar (169, 180, 42, 40);
	c.fillStar (430, 391, 42, 40);
	c.setColor (gradient4);
	c.fillStar (220, 203, 32, 30);
	c.fillStar (389, 378, 32, 30);

	c.getChar (); // Here, we are asking the user to enter any key, and which key they click....
	mainMenu (); // ... will allow them to progress to the main menu.

    } // This is the ending bracket of the public 'finalResults' method.


    public WordSearch ()  // This is the 'WordSearch' class constructor.
    {
	c = new Console ("Naumana & Fatma's Winter-Themed Word Searches!"); // This line of code creates a new Console object window, and renames the console as well.
    } // This is the ending bracket of the class constructor.


    public static void main (String[] args)  // This is the main method of the program.
    {
	WordSearch w = new WordSearch (); // This creates an instance variable of the class, and creates a new 'WordSearch' object.
	w.splashScreen (); // This is calling the 'splashScreen' method.
	try
	{
	    Thread.sleep (14000); // This distinct try-catch statement is delaying the overall splashScreen animation, ensuring that it runs for a grand total of 14 seconds.
	}
	catch (Exception e)
	{
	}
	w.mainMenu (); // This is calling the 'mainMenu' method.
    } // This is the ending bracket of the main method.
} // This is the ending bracket of the WordSearch class.


