package mypkg;
import java.util.Scanner;
public class MyClass {
	public int areaReactangle(int l, int b) {
		return(l*b);
	}
	public int square(int s) {
		return(s*s);
	}
	public double triangle(double r) {
		return (3.14 * r * r);
	}
	public int circle(int d) {
		return(2*d);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass ob=new MyClass();
		int l;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length :");
		l=sc.nextInt();
		System.out.println("Enter breath :");
		b=sc.nextInt();
		System.out.println("Area of Reactangle is :"+ ob.areaReactangle(l, b));
		
		System.out.println("Area of Square is :"+ ob.square(10));		
		System.out.println("Area of Triangle is :"+ ob.triangle(10));	
		System.out.println("Area of circle is :"+ ob.circle(100));	

	}

}
