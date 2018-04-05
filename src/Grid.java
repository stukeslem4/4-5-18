import java.util.Scanner;
public class Grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[]time=new int[6];

Scanner X=new Scanner(System.in);
System.out.println("Type in six numbers");
time[0]=X.nextInt();
time[1]=X.nextInt();
time[2]=X.nextInt();
time[3]=X.nextInt();
time[4]=X.nextInt();
time[5]=X.nextInt();
				
int count=0;
for(int i=0;i<time.length;i++){

	if(time[i]%2==1){
	count++;
	

}
}
		System.out.println("Odd numbers = " + count);
	System.out.println("Even numbers = " + (time.length-count));	
		
		
	}

}
