package sas.java.practice.ds;

public class SortingExamples {

	public static <T extends Comparable<T>> void bubbleSort (T[] list, int size) 
	{
		int swapOccurred = 1, outCounter, inCounter; 
		T temp;
		// swapOccurred helps to stop iterating if the array gets sorted before 
		// outCounter reaches to size
		for (outCounter = size - 1; outCounter > 0 && swapOccurred == 1; outCounter--)
		{
			swapOccurred = 0;
			for (inCounter = 0; inCounter < outCounter; inCounter++)
			{
				if (list[inCounter].compareTo(list[inCounter+1]) > 0)
				{
					temp = list[inCounter];
					list[inCounter] = list[inCounter+1];
					list[inCounter+1] = temp;
					swapOccurred = 1;
				}
			}
		}
	}

	public static <T extends Comparable<T>> void selectionSort (T[] list, int size) 
	{
		int outCounter, inCounter, minIndex; 
		T temp;
		// swapOccurred helps to stop iterating if the array gets sorted before 
		// outCounter reaches to size
		for (outCounter = 0; outCounter < size - 1; outCounter++)
		{
			minIndex = outCounter;
			for (inCounter = outCounter + 1; inCounter < size; inCounter++)
			{
				if (list[minIndex].compareTo(list[inCounter]) > 0)
					minIndex = inCounter;
			}

			//swap items
			if (minIndex != outCounter)
			{
				temp = list[minIndex];
				list[minIndex] = list[outCounter];
				list[outCounter] = temp;
			}
		}
	}

	public static <T extends Comparable<T>> void insertionSort (T[] list, int size) 
	{
		int outCounter, inCounter;
		T temp;
		// Sort list[] into increasing order.
		for (outCounter = 1; outCounter < size; outCounter++)
		{
			temp = list[outCounter];
			for (inCounter = outCounter; inCounter > 0 && list[inCounter - 1].compareTo(temp) > 0; inCounter--)
			{
				list[inCounter] = list[inCounter - 1];
			}
			list[inCounter] = temp;
		}
	}



}
