public class SortingInformation {
	private int numOfIntegers;
	private int[] integersForSort;
	private int[] sortedIntegers;
	
	public void setNumOfInteger(int numOfIntegers) {
		this.numOfIntegers = numOfIntegers;
	}

	public void setIntegersForSort(int[] integersForSort) {
		this.integersForSort = integersForSort;
	}

	public void setSortedIntegers(int[] sortedIntegers) {
		this.sortedIntegers = sortedIntegers;
	}
	
	public int getNumOfInteger() {
		return numOfIntegers;
	}

	public int[] getIntegersForSort() {
		return integersForSort;
	}
	
	public int[] getSortedIntegers() {
		return sortedIntegers;
	}
	
	public static SortingInformation getInstance() {
		return new SortingInformation();
	}
}

