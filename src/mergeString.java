	public class mergeString{
	
		public static void main (String [] args){
			
			String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbccccddddefg";
			int num = 0;
			char alphabet = input.charAt(0);
			System.out.print(alphabet);
			for(int i = 0; i<input.length(); i++){
				if(input.charAt(i) == alphabet)
					num++;
				
				else{
					if (num > 1){
					System.out.print(num);
					}
					
					num = 1;
					alphabet = input.charAt(i);
					System.out.print(alphabet);
				}
			}
		}
	}

	   
	


	   
	
		

