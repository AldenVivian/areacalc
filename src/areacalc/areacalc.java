package areacalc;




import java.io.*;
class areacalc
{
	static float side,l,b,rad;
	static int cho;
	
	void get()throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("choose 1 - square,choose 2 - rectangle , choose 3 - circle and choose 4 for exit");
		String x = br.readLine();
		 cho = Integer.parseInt(x);
		if(cho == 1)
		{
			System.out.println("Square:please give the side");
			String y = br.readLine();
			 side = Float.parseFloat(y);
			
		}
		else if(cho==2)
		{
			System.out.println("rectangle:please give length and breadth");
			String y = br.readLine();
			 l = Float.parseFloat(y);
			
			String a = br.readLine();
			 b = Float.parseFloat(a);
		}
		else if(cho==3)
		{
			System.out.println("circle:please give the radius");
			String y = br.readLine();
			 rad = Float.parseFloat(y);
			
		}
		
	}
	void area(float a)throws Exception
	{
		double area = a * a;
		double peri = 4 * a;
		System.out.println("square area = "+area+" perimeter = 	"+peri);
		
	}
	 void area(float b,float c)throws Exception
	{
		double area = b*c;
		double peri = 2*(l+b);
		System.out.println("rectangle area ="+area+" perimeter  =  "+peri);
		
	}
	 void area(double d)throws Exception
	{
		double area = 3.14*d*d;
		double peri = 2*3.14*d;
		System.out.println("circle area = "+area+" perimeter = 	"+peri);
		
	}
	void close()
	{
		System.out.println("THANK YOU FOR USING THE APPLICATION ,NOW THE APPLICATION WILL EXIT");
		System.exit(0);
	}
	public static void main(String[]args)throws Exception	
	{
		areacalc o1 = new areacalc ();
		do
		{
			
			o1.get();
			if (cho==1)
			{
			o1.area(side);
			}
			else if(cho==2)
			{
			o1.area(l,b);
			}
			else if(cho==3)
			{
			o1.area(rad);
			}
			else
			{
			o1.close();
			}
		}while(cho<=4);
		
	}
}

