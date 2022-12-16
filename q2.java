
public class q2 {

	public static void main(String[] args) {
		 int s=4;
		 int r;
		 String n="";
		 while(s>0) {
			 r=s%2;
			 n=n+r;
			 s=s/2; 
		 }
	      int count=0;
	      for(int i=n.length()-1;i>=0;i--){
	        if(n.charAt(i)=='1'){
	            count++;
	        }
	      }
	     
	      if(count%2==0){
	        System.out.println("0");
	      }
	      else{
	        System.out.println("1");
	      }

	}

}
