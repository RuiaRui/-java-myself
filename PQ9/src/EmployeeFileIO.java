import java.util.*;
import java.io.*;

/**
 * This class provides two file I/O methods for handling employee data.
 *
 * @author  author name
 * @version  1.0.0
 * @see  Employee
 */
public class  EmployeeFileIO {

	/**
	 * Creates an <code>ArrayList</code> of <code>Employee</code> objects
	 * from a file that contains employee data.
	 * <p>
	 * Every line in the specified file should contain three fields: ID, name,
	 * and salary of an employee in the following format: ID_name_salary
	 * </p>
	 *
	 * @param filename  the name of a file containing employee data.
	 * @return  an <code>ArrayList</code> of <code>Employee</code> objects.
	 * @throws FileNotFoundException  if the specified file does not exist.
	 * @throws IOException  if an I/O error occurs.
	 * @throws NoSuchElementException  if the data in the file is incomplete.
	 * @throws NumberFormatException  if the file contains invalid numbers.
	 */
	public static ArrayList<Employee> read(String filename)
		throws FileNotFoundException,
			IOException,
			NoSuchElementException,
			NumberFormatException  {

		BufferedReader br=new BufferedReader(new FileReader(filename));
		ArrayList<Employee> result=new  ArrayList<Employee>();
		String s=null;
		while((s=br.readLine())!=null){
			String[] tmp=s.split("_");
			int a=Integer.parseInt(tmp[0]);
			double b=Double.parseDouble(tmp[2]);
			Employee e= new Employee(a,tmp[1],b);
			result.add(e);
		}
		return result;

	}

	/**
	 * Creates a file of employee data from an <code>ArrayList</code> of
	 * <code>Employee</code> objects.
	 * <p>
	 * Every line in the file should contain the ID, name, and salary of an
	 * employee separated by an underscore: ID_name_salary
	 * </p>
	 *
	 * @param filename  the name of the file that will store the employee data.
	 * @param arrayList  an <code>ArrayList</code> of <code>Employee</code>
	 *                   objects.
	 * @throws IOException  if an I/O error occurs.
	 */
	public static void write(String filename, ArrayList<Employee> arrayList)
		throws IOException  {
	    File file=new File(filename);
        file.createNewFile();
	    BufferedWriter bw=new BufferedWriter((new FileWriter(file)));
        for (Employee e:arrayList) {
            bw.write(e.toString());
            bw.write("\n");
        }
		bw.flush();
		bw.close();
	}

}