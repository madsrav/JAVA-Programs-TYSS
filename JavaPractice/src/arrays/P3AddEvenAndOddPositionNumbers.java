package arrays;

public class P3AddEvenAndOddPositionNumbers {

	public static void main(String[] args)

	{
		int[]a= {0,1,2,3,4};
		int evensum=0;
		int oddsum=0;

		for(int i =0;i<a.length;i++)
		{
           if(i%2==0)
           {
        	   evensum=evensum+a[i];
           }
           else
           {
        	   oddsum=oddsum+a[i];
           }
		}
		
		System.out.println(evensum+"\n"+oddsum);

	}

}
