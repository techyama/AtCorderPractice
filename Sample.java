import java.util.Scanner;

public class Sample {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++) {
		    int temp = i;
		    int sum = 0;
		    for(int j = 1; j <= 10000; j *= 10) sum += (temp%(10*j))/j;
		    if(a<=sum&&sum<=b)count+=i;
		}
		System.out.println(count);
	}
}