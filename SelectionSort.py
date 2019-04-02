"""
@author Mrinal Pandey
  @date: 2nd April, 2019
  @day_time Tuesday 22:31
"""

def displayData(a, n):
    #Loop to print data
    for i in range(n):
        print (a[i], end = '\t')
    print() #To change line

#Sub-routine to sort elements in the array using Selection Sort
def selectionSort(a, n):
    #Outer loop
    for i in range(n - 1):
        #Inner loop
        minPos = i #Initialize minPos with i
        for j in range(i+1, n):
            #Compare elements of array with current minimum element starting from i till n
            if a[j] < a[minPos]:
                minPos = j #update minPos to j if for any j, a[j] < a[minPos]
        a[i], a[minPos] = a[minPos], a[i] #Swap a[i] and a[minPos]

#Driver code to test above code
a = [8, 6, 9, 4, 2] #Array of elements
print ("\nArray before sorting:")
n = len(a) #Calculate length of array
displayData(a, n) #To Display data
selectionSort(a, n) #To sort the data
print ("\nArray after sorting")
displayData(a, n) #To Display data
print() #To change line
