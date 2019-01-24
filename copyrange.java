//copyofrange
import java.util.Arrays;
class test
{
public static void main(String args[])
{
	int arr[][]=new int[2][3];
	arr[0][0]=12;
	arr[0][1]=13;
	arr[0][2]=14;

	arr[1][0]=16;
	arr[1][1]=17;
	arr[1][2]=19;
	
	int arr1[][]=new int[2][3];
	arr1[1]=Arrays.copyOfRange(arr[0],0,3);
	//System.out.println(Arrays.toString(arr[0]));
	System.out.println(Arrays.toString(arr1[1]));
}
}

