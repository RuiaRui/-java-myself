import java.io.*;
import java.util.*;

public class SecondsCalculator {
	private static BufferedReader stdIn =
		new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter stdOut =
		new PrintWriter(System.out , true);
	private static PrintWriter stdErr =
		new PrintWriter(System.err , true);
		
	public static void main(String[] args)  throws IOException {
		//TODO write your own code here.

		do{
			try{
				int hour=0;
				int minute=0;
				int second=0;
				stdOut.print("time [hours:minutes:seconds]>");
				stdOut.flush();

				 final String colon =":";
				StringTokenizer tokenizer = new StringTokenizer(stdIn.readLine(),colon) ;

				if(tokenizer.countTokens()!=3){
					stdOut.println("Invalid input");
				}else{
					hour = Integer.parseInt(tokenizer.nextToken());
					minute = Integer.parseInt(tokenizer.nextToken());
					second = Integer.parseInt(tokenizer.nextToken());

					if(hour<0| hour>23){
						stdOut.println("Invalid input");
					}else if(minute<0| minute>59){
						stdOut.println("Invalid input");
					}else if(second<0| second>59){
						stdOut.println("Invalid input");
					}else{
						int result = hour*3600+minute*60+second;
						stdOut.println("The number of seconds is: "+result);

					}
				}

			}catch(NumberFormatException nfe){
				stdErr.println(nfe);
			}

		}while(true);
	}
}
