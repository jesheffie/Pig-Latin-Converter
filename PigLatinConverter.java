import java.util.*;
public class PigLatinConverter{
	
  public static void main(String[] args){
	String begin = "Please Type a Phrase to turn into PigLatin:";
	System.out.println(begin);
	Scanner scan = new Scanner(System.in);
	String t = " ";
	Piglatin p = new Piglatin();
	while(t.length() > 0){
		t = scan.nextLine();
		t = t.toLowerCase();
		p.pigConvert(t);
	}
	p.pigReport();
  }
} 