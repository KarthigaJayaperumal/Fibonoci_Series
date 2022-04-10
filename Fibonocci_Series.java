import java.util.Scanner;

//To Find Fibonocci_Series

public class Fibonocci_Series {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		
		System.out.print("Enter Any Number ");
		int Number=Sc.nextInt();
int a=0, b=1, c=0;

while(c<Number) {
	c=a+b;

System.out.println(c);
	a=b;
	b=c;
}}}
