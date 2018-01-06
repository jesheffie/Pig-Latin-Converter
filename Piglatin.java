public class Piglatin{
	String p;
	String [] words;
	public Piglatin() {
		words = null;
		p = "";
	}
public void pigConvert(String phrase){
	
	
	if(phrase.length() != 0){	
		words = phrase.split("[ ,.!?;:]");	
		for(int i = 0; i < words.length; i++){
			if(words[i].length() > 0){
				if(isVowel(words[i].charAt(0))){
					words[i] = words[i] + "ay";
					p = p + words[i] + " ";
		} else {
			char first = words[i].charAt(0);
			words[i] = words[i].substring(1) + first + "ay";
			p = p + words[i] + " ";
				}
			}
		}
		p = p + "\n";
	}
}

public void pigReport(){
	System.out.print(p);
	
}



public boolean isVowel(char let){
		char i = let;
		if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){ 
			return true;
		}else{
			return false;
		}
}
	}

