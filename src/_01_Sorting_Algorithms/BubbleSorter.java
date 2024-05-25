package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] arr, SortingVisualizer display) {
    	boolean allSorted=false;
    	while(allSorted==false) {
    		allSorted=true;
    	for(int i = 0;i<arr.length-1;i++) {
    		if(arr[i]>arr[i+1]) {
    			int temp = arr[i];
    	    	arr[i]=arr[i+1];
    	    	arr[i+1]=temp;
    	    	allSorted=false;
    		}
    	}
    	display.updateDisplay();
    	}
    }
}
