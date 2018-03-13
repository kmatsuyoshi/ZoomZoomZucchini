//Zoom Zoom Zucchini - Kayli Matsuyoshi, Kevin Lin, Victor Lin
//APCS2 --  pd1
//Lab01 --  What Does the Data Say?
//2018-03-14W

public class QuickSortTester{

    public static int[] generateArray(int n) {
	int[] output = new int[n];
	for (int i = 0; i < n; i++) {
	    output[i] = (int) (Math.random() * 10000);
	}
	return output;
    }
    
    public static void main(String []args){
	int[] arr = generateArray(100);
	//Warmup
	for (int i = 0; i < 100; i++) {
	    QuickSort.qsort(arr);
	}
    }




}
