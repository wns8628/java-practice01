package practice01;


public class Prob5 {
	public static void main(String[] args) {
		
		for(int i=1; i<100; i++){
			String stri = String.valueOf( i );
			
			int clap = 0;
	
			for(int i1 =0 ; i1< stri.length(); i1++){
				if(stri.charAt(i1) == '3' || stri.charAt(i1) == '6' || stri.charAt(i1) == '9'){
					clap++;
				};
			}
			
			if(clap==0) continue ; 
			
			System.out.print( stri+ " ");
			for(int i2=0; i2<clap; i2++){
				System.out.print("짝");
			}
			System.out.println();
		}		
	}
}
