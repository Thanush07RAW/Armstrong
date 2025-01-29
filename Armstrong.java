import java.util.*;
public class Armstrong {
static void armstrong(int n) {
	int r,n1,count=0;
	for(int j=n;j>0;j=j/10) {
			count++;
	}
	for(int i=1;i<=n;i++) {
		int sum=0;
		for(n1=i;n1>0;n1=n1/10) {
			r=n1%10;
			sum+=Math.pow(r,count);
		}
		if(sum==i) {
			System.out.println("Given Number "+i+ " is Armstrong");
		}
		else {
			continue;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
armstrong(n);
	}

}