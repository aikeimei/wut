import java.util.*;
public class q7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		String s=sc.nextLine();
		System.out.println("enter dob"); 
		String dob=sc.nextLine();
		String pass=" ";
		if(s==null || dob.length()!=10 ) {
			System.out.println("no password");
		}
		else {
			pass=pass+s.toUpperCase().substring(0,2)+ dob.substring(3,5);
			
		}
		System.out.println(pass);
		
		
		
		
		

	}

}
