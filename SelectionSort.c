/*@author Priti Chattopadhyay
  @date: 17th March, 2019
  @day_time Sunday 14:29
*/

//Preprocessor directive
#include<stdio.h>

//Selection Sort in C
void selectionSort(int*, int);
void display(int*, int);

int main()
{
	// Take an array of n integers 
	int a[10] = {10, 80, 60, 50, 20, 90, 30, 70, 40, 100};
	printf("\nBefore Sorting:\n");
	display(a, 10);
	//calling a routine to sort the elements
	selectionSort(a, 10);
	return 0;
}

//Routine to sort the elements of the array
//Sorting in non - decreasing order
//
void selectionSort(int *arr, int n)
{
	int i, j, temp, minPos;
	//Outer loop
	for(i = 0; i < n - 1; i++)
	{
		minPos = i;
		//Inner loop to find smallest element
		for(j = i + 1; j < n; j++)
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

	//calling a routine to display the elements of the array after sort
	printf("After Sorting:\n");
	display(arr, n);
}

// Routine to display elements of an array 
void display(int *a, int n)
{
	int i;
	for(i = 0; i < n; i++)
	{
		printf("%d\t", a[i]);
	}
	printf("\n\n");
}
