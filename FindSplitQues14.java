package StringMethods;

public class FindSplitQues14 {
	public static void main(String[]args) {
		String name="world wide wonder";
		String[] newname=name.split(" ");
		System.out.println(newname[0]+" "+newname[1]+" "+newname[2]);
		
		System.out.println(newname[0].concat("programs"));
		
		System.out.println(newname[0].toUpperCase());
		
		
	}

}
