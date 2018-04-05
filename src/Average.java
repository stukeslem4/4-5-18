import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[]nums=new int[5];
	
	Scanner T=new Scanner(System.in);
	System.out.println("Type in five numbers");
		nums[0]=T.nextInt();
		nums[1]=T.nextInt();
		nums[2]=T.nextInt();
		nums[3]=T.nextInt();
		nums[4]=T.nextInt();
		
	int sum =0;
	for(int i=0;i<nums.length;i++){
		
	sum = sum + nums[i];	
		
	}
		
	System.out.println(sum/5);	
		
		
	}

}
