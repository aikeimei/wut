import java.util.ArrayList;

public class q9 {

	
//		char[] encodealpha= new char[27];
//		int [] encodenum=new int[27];
//		int i=1;
//		char j='A';
//		for(i=1;i<27;i++,j++) {
//			encodealpha[i]=j;
//			encodenum[i]=i;
//			
//			
//		}
//		System.out.println("enter aplha");
//		
		  public static ArrayList<String> encodedLiterals = new ArrayList<String>();
		    public static int encodednum[] = new int[27];
		    public static char encodedStr[] = new char[27];
		    char c;

		    public static void encodeLiterals(){
		        int i = 1;
		        char j = 'A';
		        for(i = 1; i < 27; i++, j++){
		            // encodedLiterals.add(j + "-" + i);
		            encodednum[i] = i;
		            encodedStr[i] = j; 
		        }
		    }

		    public static int getEncode(String str){
		        // for(int i = 1; i < 27; i++){
		        //     System.out.print(encodednum[i] + "-" + encodedStr[i] + " ");
		        // }
		        while(str.length() != 0){
		            char c = str.charAt(1);
		        }
		        return 0;
		    }

		    public static void main(String[] args) {
		        encodeLiterals();
		        getEncode("1");
		    }
	

}
