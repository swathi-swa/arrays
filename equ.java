//equals
import java.util.Arrays;
class test
{
public static void main(String args[])
{
	int arr[][]=new int[2][3];
	arr[0][0]=22;
	arr[0][1]=11;
	arr[0][2]=35;

	arr[1][0]=42;
	arr[1][1]=20;
	arr[1][2]=5;
	
	//int arr1[][]=new int[2][3];
	System.out.println(Arrays.equals(arr[0],arr[1]));
}
}

