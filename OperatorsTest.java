package tw.aaa.myproject.OperatorsTest;

public abstract class OperatorsTest {

	public static void main(String[] args) {
		int i=1,j=1,k=1,a,b,x=1,y=2,z;
		i=i+1;
		a=j++;
		b=++k;
		System.out.println("i="+i);
		System.out.println("a="+a+"j="+j);
		System.out.println("b="+b+"k="+k);
		z=(x++)+(++y);
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}

}
