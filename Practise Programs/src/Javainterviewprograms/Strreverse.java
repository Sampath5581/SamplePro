package Javainterviewprograms;

public class Strreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Sampath";
int p=s.length();
String rev="";
//using for loop

for(int i=p-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
}
System.out.println(rev);

// 2. using String Buffer class
StringBuffer sb=new StringBuffer(s);

System.out.println(sb.reverse());

		

}	

}		
		
		
		
		
		
		
		

