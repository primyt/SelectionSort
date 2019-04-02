/*@author Mrinal Pandey
  @date: 2nd April, 2019
  @day_time Tuesday 20:38
*/

//Selection sort in Java
//Declaration of class SelectionSort

class SelectionSort{

	public static void main(String[] args){
		//Creating an object of class SelectionSort to call routines or methods
		SelectionSort obj = new SelectionSort();
		//Initializing an array of 10 elements
		int[] a = {10, 80, 60, 50, 20, 90, 30, 70, 40, 100};
		System.out.println("\nBefore Sorting:");
		//calling a routine to display elements of the array before sorting
		obj.display(a, 10);
		//calling the routine to sort the elements using selection sort algorithm
		obj.selectionSort(a, 10);//In Java, we always pass a reference to an array
		System.out.println("\nAfter Sorting:");
		//calling a routine to display elements of the array after sorting
		obj.display(a, 10);
	}
	
	//Routine to display elements of an array
	void display(int[] a, int n){
		for(int i = 0; i < n; ++i){
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n");
	}//end of display routine
	
	//Routine to sort the array using selection sort algorithm
	//Sorting the elements in non-decreasing order
	void selectionSort(int[] arr, int n)
	{
		int i, j, temp, minPos;
		//Outer loop
		for(i = 0; i < n - 1; ++i)
		{
			minPos = i;
			//Inner loop to find smallest element
			for(j = i + 1; j < n; ++j)
			{
				//Compare two adjacent elements
				if(arr[minPos] > arr[j])
				{
					// To assign min with the smallest element
					minPos = j;
				}//end if		
			}//end Inner loop
		
			//swap a[i] and a[min] 
			temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;	
	
		}//end Outer loop
	}//end selectionSort routine
}//end class SelectionSort
