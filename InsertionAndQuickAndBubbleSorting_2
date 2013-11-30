package junit;
import java.util.*;

public class InsertionAndQuickAndBubbleSorting_2 {
	private SortingInformation sortInfo;
	
	public InsertionAndQuickAndBubbleSorting_2() {
		sortInfo = SortingInformation.getInstance();
	}
	
	public enum Menu {
		INSERT_SORT(1), 
		QUICK_SORT(2), 
		BUBBLE_SORT(3), 
		QUIT(4);
		
		private int menuNum;
		
		private Menu(int num) {
			this.menuNum = num;
		}
		
		private int getMenuNum() {
			return this.menuNum;
		}
	}
	
	public static void main(String[] args) {
		Menu selectedMenu;
		
		InsertionAndQuickAndBubbleSorting_2 insertionQuickBubble_Sorting 
				= new InsertionAndQuickAndBubbleSorting_2();
		insertionQuickBubble_Sorting.showProgrammerInformation();
		while (true) {
			insertionQuickBubble_Sorting.showMenu();
			selectedMenu = insertionQuickBubble_Sorting.selectMenu();
			insertionQuickBubble_Sorting.executeMenu(selectedMenu);
		}
	}

	private void showProgrammerInformation() {
		System.out.println("Welcom to Sorting program");
		System.out.println("Choose the menu.");
	}

	private void showMenu() {
		System.out.println("1. Insertion sort");
		System.out.println("2. Quick sort");
		System.out.println("3. Bubble sort");
		System.out.println("4. Quit");
	}

	private Menu selectMenu() {
		int selectedMenu;
		
		Scanner userInputValue = new Scanner(System.in);
		selectedMenu = userInputValue.nextInt();
		for (Menu menu: Menu.values()) {
			if (menu.getMenuNum() == selectedMenu)
				return menu;
		}
		return null;
	}

	private void executeMenu(Menu selectedMenu) {
		try {
			switch (selectedMenu) {
			case INSERT_SORT:
			case QUICK_SORT:
			case BUBBLE_SORT:
				setInformationForSorting();
				sortBySelectedMenu(selectedMenu);
				printSortingResult();
				break;
			case QUIT:
				System.out.println("END");
				quit();
				break;
			}
		} catch(Exception e) {
			System.out.println("Exception: " + e);
		}
	}
	
	private void setInformationForSorting() {
		setNumOfIntegers();
		setIntergersForSort();
	}
	
	private void setNumOfIntegers() {
		System.out.print("The number of integers: ");
		Scanner numOfInteger = new Scanner(System.in);
		sortInfo.setNumOfInteger(numOfInteger.nextInt());
	}
	
	private void setIntergersForSort() {
		int[] integersBuffer;
		
		System.out.print("Integers: ");
		integersBuffer = new int[sortInfo.getNumOfInteger()];
		Scanner integerForSort = new Scanner(System.in);
		for (int index = 0; index < integersBuffer.length; index++) 
			integersBuffer[index] = integerForSort.nextInt();
		sortInfo.setIntegersForSort(integersBuffer);
	}
	
	private void sortBySelectedMenu(Menu selectedMenu) {
		int[] sortingResult = null;
		
		if (isEmptyForSort())
			return;
		switch(selectedMenu) {
			case INSERT_SORT:
				sortingResult = insertionSort(sortInfo.getIntegersForSort());
			case QUICK_SORT:
				sortingResult = quickSort(sortInfo.getIntegersForSort(), 0, sortInfo.getNumOfInteger() - 1);
			case BUBBLE_SORT:
				sortingResult = bubbleSort(sortInfo.getIntegersForSort());
		}
		sortInfo.setSortedIntegers(sortingResult);
	}

	private boolean isEmptyForSort() {
		return (sortInfo.getIntegersForSort() == null || sortInfo.getIntegersForSort().length == 0);
	}
	
	public int[] insertionSort(int[] integersForSort) {
		for (int index = 0; index <= integersForSort.length; index++) {
			int tempElement = integersForSort[index];
			int tempIndex = index - 1;
			
			while ((tempIndex >= 0) || (integersForSort[tempIndex] > tempElement)) {
				integersForSort[tempIndex + 1] = integersForSort[tempIndex];
				tempIndex--;
			}
			integersForSort[tempIndex + 1] = tempElement;
		}
		return integersForSort;
	}
	
	public int[] quickSort(int[] integersForSort, int lowIndex, int highIndex) {
		int lowerIndex = lowIndex, higherIndex = highIndex;

		// Get the pivot element from the middle of the list
		int pivot = integersForSort[lowIndex + (highIndex - lowIndex) / 3];

		// Divide into two lists
		while (lowerIndex < higherIndex) {
			while (integersForSort[lowerIndex] > pivot) {
				lowerIndex++;
			}	
			while (integersForSort[higherIndex] < pivot) {
				higherIndex--;
			}
			if (lowerIndex < higherIndex) {
				exchange(integersForSort, lowerIndex, higherIndex);
				lowerIndex++;
				higherIndex--;
			}
		}
		// Recursion
		if (lowIndex < higherIndex)
			quickSort(integersForSort, lowIndex, higherIndex);
		if (lowerIndex < highIndex)
			quickSort(integersForSort, lowerIndex, highIndex);	
		return integersForSort;
	}
	
	public int[] bubbleSort(int[] integersForSort){
        for (int i = 0; i <= integersForSort.length - 1; i++){
            for (int j = 1; j <= integersForSort.length - i; j++){
                if (integersForSort[j - 1] < integersForSort[j]){
                	exchange(integersForSort, j - 1, j);
                }
            }
        }
        return integersForSort;
    }

	private int[] exchange(int[] arr, int i, int j) {
		int temp = arr[i];
		
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
		
	private void printSortingResult() {
		int[] printResult = sortInfo.getSortedIntegers();
		
		System.out.print("Results: ");
		for(int i = 0; i < sortInfo.getNumOfInteger(); i++)
			System.out.print(printResult[i]+ " ");
		System.out.println();
	}

	private void quit() {
		System.exit(0);
	}
}

