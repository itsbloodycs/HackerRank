package DataStructures;

import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}
class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getCgpa()<s2.getCgpa()) return 1;
		else if(s1.getCgpa()>s2.getCgpa()) return -1;
		else{
			int aux=s1.getFname().compareTo(s2.getFname());
			if(aux==0){
				return (s1.getId()-s2.getId());
			}
			else return aux;
		}
	}
     
}

//Complete the code
public class SortProblem
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList, new StudentComparator());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



