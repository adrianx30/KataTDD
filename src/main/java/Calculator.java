
public class Calculator {

	public int Add(String numbers){
		if (numbers.equals("")) {
			return 0;	
		} else {
			String comma = ",";
			String newLines = "\n";
			String delimiters = new String();
			int beginFor = 0;
			if(numbers.charAt(0) == '/' && numbers.charAt(1)=='/') {
				delimiters = "["+newLines+"\\"+numbers.substring(2, 3)+"\\"+comma+"]";
				beginFor = 2;
			}else{
				delimiters = "["+newLines+"\\"+comma+"]";
			}
			if(numbers.contains(comma) || numbers.contains(newLines)){
				
				String[] params = numbers.split((delimiters));
				int total = 0;
				for (int i = beginFor; i < params.length; i++) {
					total += Integer.parseInt(params[i]);					
				}
				return total;
			}
			return Integer.parseInt(numbers);
		}
		
	}
}
