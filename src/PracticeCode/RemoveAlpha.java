package PracticeCode;

public class RemoveAlpha {
	
	
	public static void main(String[] args) {
		
	
	String text="wefeqf878979797fewfewrf879797efds&^&^*^*^\"";
	
	int length=text.length();
	String clean=text.replaceAll( "[A-za-z0-9]", "");
	int cl= clean.length();
	String cleanA=text.replaceAll( "[^A-za-z0-9]", "");	
	System.out.println(clean +"   = L "+cl);
	
	System.out.println(cleanA + " lenngth is = "+ length);
	

}}
