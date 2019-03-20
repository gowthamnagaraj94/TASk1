package task1;

public class T1 {
	public static void main(String[] args) {
		int a=10;
	if(a%2==0) {
		System.out.println("even");
	}

		{
	for (int i=0;i<10;i++) {
		if(a%2==0) {
			System.out.println(i);
		}
	}
	}
		int b=10; int i=0; int j=0;
		while(a>0) {
			i=b%10;
			j=j+(i*i*i);
			b=b/10;
		}
		{
			System.out.println("amastrong");
		}
		
	
}
		