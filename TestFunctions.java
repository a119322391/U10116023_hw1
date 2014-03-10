import java.awt.*;
import javax.swing.*;
public abstract class AbstractDrawFunction extends JPanel{
	//private Poilgon p = new Poilgon();
	protected AbstractDrawFunction(){
		drawFunction();
	
	}
	abstract double f(double x);
	public void drawFunction(){
	for(int x = -100; x <= 100; x++){
		//p.addPoint(x + 200, 200 - (int)f(x));
		
		}
	}
	//@Override
	//protected void paintComponent(Granphics g){
	//}
}

import java.util.Scanner;

public class TestFunctions{
	public static void main (String[] args){
		Scanner x = new Scanner(System.in);
		Function1 f1 = new Function1();
		double num1 = x.nextDouble();
		System.out.println(f1.f(num1));
		Function2 f2 = new Function2();
		double num2 = x.nextDouble();
		System.out.println(f2.f(num2));
		Function3 f3 = new Function3();
		double num3 = x.nextDouble();
		System.out.println(f3.f(num3));
		Function4 f4 = new Function4();
		double num4 = x.nextDouble();
		System.out.println(f4.f(num4));
		Function5 f5 = new Function5();
		double num5 = x.nextDouble();
		System.out.println(f5.f(num5));
		Function6 f6 = new Function6();
		double num6 = x.nextDouble();
		System.out.println(f6.f(num6));
		Function7 f7 = new Function7();
		double num7 = x.nextDouble();
		System.out.println(f7.f(num7));
	}
}

public class Function1 extends AbstractDrawFunction{	
	@Override
	double f(double x){
		return x*x;
	}
}

public class Function2 extends AbstractDrawFunction{	
	@Override
	double f(double x){
		return Math.sin(x);
	}
}

public class Function3 extends AbstractDrawFunction{	
	@Override
	double f(double x){
		return Math.cos(x);
	}
}

public class Function4 extends AbstractDrawFunction{	
	@Override
	double f(double x){
		return Math.tan(x);
	}
}

public class Function5 extends AbstractDrawFunction{	
	@Override
	double f(double x){
		return Math.cos(x) + 5*Math.sin(x);
	}
}

public class Function6 extends AbstractDrawFunction{	
	@Override
	double f(double x){
		return 5*Math.cos(x) + Math.sin(x);
	}
}

public class Function7 extends AbstractDrawFunction{	
	@Override
	double f(double x){
		return Math.log(x)/Math.log(10) + x*x;
	}
}
