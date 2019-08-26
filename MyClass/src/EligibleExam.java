
public class EligibleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cat = "SC";
		int age = 34;
		
		if((age>=20) && (age <=30) && cat=="Gen") {
			
			System.out.println(cat+", " +"Eligible for all the categories");
		}
		
		else if ((age>=20) && (age<=33) && (cat=="OBC")) {
			
			System.out.println(cat+ ", " + "Eligble for OBC category");
		}
		
		else if((age>=20) && (age<=35) && ((cat=="SC") || (cat=="ST"))) {
			
			System.out.println(cat+ ", " + "Eligible for SC and ST category");
		}
		
		else {
			
			System.out.println("Not Eligible for any category");
		}

	}

}
