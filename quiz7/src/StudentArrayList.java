import java.util.*;

/**
 * This class contains methods to process array lists of {@link Student}
 * objects.
 *
 * @author  autor name
 * @version  1.0.0
 * @see  Student
 * @see  ArrayList
 */
public class  StudentArrayList  {

    /**
     * Returns an array list with three elements.
     *
     * @param first  a <code>Student</code> object.
     * @param second  a <code>Student</code> object.
     * @param third  a <code>Student</code> object.
     * @return an array list with the objects <code>first</code>,
     *           <code>second</code>, and <code>third</code>
     */
    public static ArrayList<Student> makeArrayList(
            Student  first,
            Student  second,
            Student  third)  {

        ArrayList<Student> students=new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(third);

        return students; // REMOVE; USED SO THIS FILE COMPILES
    }

    /**
     * Returns an array list with the same elements of the specified array
     * arranged in the same order.
     *
     * @param array  an array with <code>Student</code> objects .
     * @return an array list with the same elements of the specified array
     *         arranged in the same order
     */
    public static ArrayList<Student> makeArrayListFromArray(Student[] array) {

        ArrayList<Student> students=new ArrayList<>();
        for (Student student:array) {
            students.add(student);

        }
        return students; // REMOVE; USED SO THIS FILE COMPILES
    }

    /**
     * Returns <code>true</code> if the specified array list contains a
     * student whose id matches the specified ID.
     *
     * @param arrayList  an array list of <code>Student</code> objects.
     * @param id  a student ID.
     * @return  <code>true</code> if the specified array list contains a
     *          student whose ID matches the specified ID;
     *          <code>false</code> otherwise.
     */
    public static boolean hasStudent(
            ArrayList<Student>  arrayList,
            int  id)  {

        for(Student student:arrayList){
            if(student.getId()==id){
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the number of students in the specified array list whose
     * grade is greater than or equal to the specified grade.
     *
     * @param arrayList  an array list of <code>Student</code> objects.
     * @param grade  a grade.
     * @return  the number of students in the specified array list whose
     *          grade is greater than or equal to the specified grade.
     */
    public static int countGradeGreaterOrEqual(
            ArrayList<Student> arrayList,
            int grade)  {
        int i=0;
        for(Student student:arrayList){
            if(student.getGrade()>=grade){
                i++;
            }
        }
        return i; // REMOVE; USED SO THIS FILE COMPILES
    }

    /**
     * Returns the smallest grade of the students in the specified array list.
     * <p>
     * This method assumes that the array list is not empty.
     *
     * @param arrayList  an array list of <code>Student</code> objects.
     * @return  the smallest grade of the students in the specified array list.
     */
    public static int getMinGrade(ArrayList<Student> arrayList)  {

        int minGrade=100;
        Iterator<Student> students=arrayList.iterator();
        while (students.hasNext()){
            int temp=students.next().getGrade();
            if(minGrade>temp){
                minGrade=temp;
                ;
            }
        }
        return minGrade;
    }

    /**
     * Returns the average grade of the students in the specified array list.
     *
     * @param arrayList  an array list of <code>Student</code> objects.
     * @return  the average grade of the students in the specified array list.
     */
    public static double getGradeAverage(ArrayList<Student>  arrayList)  {

        double average=0;
        Iterator<Student> students=arrayList.iterator();
        while (students.hasNext()){

            average+=students.next().getGrade();
        }
        average=average/arrayList.size();

        return average; // REMOVE; USED SO THIS FILE COMPILES
    }

    /**
     * Removes all students in the specified array list whose grade
     * is less than the specified grade.
     *
     * @param arrayList  an array list of <code>Student</code> objects.
     * @param grade  a grade.
     */
    public static void removeGradeLess(
            ArrayList<Student>  arrayList,
            int  grade)  {

        Iterator<Student> students=arrayList.iterator();
        while (students.hasNext()){
            if(grade>students.next().getGrade()){
                students.remove();
            }
        }
    }

    /**
     * Returns the string representation of the objects in the specified
     * array list.
     * <p>
     * A new line character ( \n ) should separate the string
     * representations of the objects. For example:
     * </p>
     * <pre>
     * Student[328,Galileo Galilei,80]\nStudent[123,Albert Einstein,100]
     * </pre>
     * <p>
     * Note that the string does <i>not</i> end with a new line character ( \n )
     * </p>
     *
     * @param arrayList  an array list of <code>Student</code> objects.
     * @return  the string representation of the objects in the specified
     *          array list.
     */
    public static String displayAll(ArrayList<Student>  arrayList)  {

        Iterator<Student> students = arrayList.iterator();
        String display = "";
        while(students.hasNext()){
            display += students.next().toString();
            if(students.hasNext()){
                display += "\n";
            }
        }
        return display; // REMOVE; USED SO THIS FILE COMPILES
    }
}

