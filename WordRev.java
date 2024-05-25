public class WordRev{
	public static void main (String args[]){
		String s="I.love.this.progam.very.much";
		String R="";
		
		String w[]= s.split("[//.]+");
		for(int i=0;i<w.length;i++){
			String RW="";
			for (int j = w[i].length() - 1; j >= 0; j--) {
                RW += w[i].charAt(j);
			}
			  R += RW + ".";
		}
		R = R.substring(0, R.length() - 1);
		System.out.println(R);
	}
}



		
		
		
		
		

			
			
			