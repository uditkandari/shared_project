package lambdathread;

//import com.java8.good;

interface good
{
	public void display(int...num);
}
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		good g=(num)->{
			int sum=0;
			for(int  i:num)
			{
				sum=sum+i;
				
			}
			System.out.println(sum);
		};
		g.display(22,34,65,23,87,45,6,98,6,6,8);
		g.display(23,545,6734,2,56,87,9,0,9);
	}
	}

