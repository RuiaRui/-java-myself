import  java.io.*;

/**
 * Test driver for class <code>AthleteScores</code>.
 *
 * @author  author name
 * @version  1.0.0
 */
public class TestAthleteScores  {

	/* Standard output stream */
	private static PrintWriter  stdOut = new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr = new  PrintWriter(System.err, true);

	/**
	 * Test driver for class <code>AthleteScores</code>.
	 *
	 * @param args  not used.
	 */
	public static void  main(String[] args)  {


		/* PLACE YOUR CODE HERE */
        stdOut.println("");
        stdOut.println("Testing class AthleteScores...");

       String name="Alex";
       double scoreOne=1.0;
       double scoreTwo=2.0;
       double scoreThree=3.0;

       AthleteScores athleteScores=new AthleteScores(name,scoreOne,scoreTwo,scoreThree);

        // Test accessors
        assertTrue("1: testing method getName",
                name.equals(athleteScores.getName()));

        assertTrue("2: testing method getScoreOne",
                scoreOne==athleteScores.getScoreOne());

        assertTrue("3: testing method getScoreTwo",
                scoreTwo==athleteScores.getScoreTwo());

        assertTrue("4: testing method getScoreThree",
                scoreThree==athleteScores.getScoreThree());


        // Test mutator
        double newScoreOne=10.0;
        double newScoreTwo=9.0;
        double newScoreThree=8.0;

        athleteScores.setScoreOne(newScoreOne);
        athleteScores.setScoreTwo(newScoreTwo);
        athleteScores.setScoreThree(newScoreThree);

        assertTrue("5: testing method setScoreOne",
                newScoreOne == athleteScores.getScoreOne());

        assertTrue("6: testing method setScoreTwo",
                newScoreTwo == athleteScores.getScoreTwo());

        assertTrue("7: testing method setScoreThree",
                newScoreThree == athleteScores.getScoreThree());

        //test  method getMinimum.
        AthleteScores athleteScores1=new AthleteScores("John",1.0,
                3.0,3.0);
        AthleteScores athleteScores2=new AthleteScores("John",3.0,
                1.0,3.0);
        AthleteScores athleteScores3=new AthleteScores("Jack",3.0,
                3.0,1.0);

        double min=1.0;

        assertTrue("8: testing method getMinimum",
                min== athleteScores1.getMinimum());

        assertTrue("9: testing method getMinimum",
                min== athleteScores2.getMinimum());

        assertTrue("10: testing method getMinimum",
                min== athleteScores3.getMinimum());

        //test the method equals.
        assertTrue("11: testing method equals",
                athleteScores1.equals(athleteScores2));

        assertTrue("12:testing method equsals",
                !athleteScores1.equals(athleteScores3));

        assertTrue("13:testing method equals",
                !athleteScores1.equals("AthleteScore"));


//test the method toString.
        String result=name + "," + scoreOne + "," + scoreTwo
                + "," + scoreThree;
        AthleteScores athleteScores4=new AthleteScores(name,scoreOne,scoreTwo,scoreThree);
        assertTrue("14:testing method toSting",
                result.equals(athleteScores4.toString()));


        stdOut.println("done");
	}

	/**
	 * Displays a message in the standard error stream if the value specified
	 * by parameter <code>condition<code> is <code>false</code>.
	 *
	 * @param message  the error message.
	 * @param condition  the test condition.
	 */
	public static void assertTrue(String message, boolean condition) {

		if (! condition) {
			stdErr.print("** Test failure ");
			stdErr.println(message);
		}
	}
}
