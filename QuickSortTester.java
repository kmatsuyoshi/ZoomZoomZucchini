//Zoom Zoom Zucchini - Kayli Matsuyoshi, Kevin Lin, Victor Lin
//APCS2 --  pd1
//Lab01 --  What Does the Data Say?
//2018-03-15 R

/***
	QuickSortTester runs 10 trials for each size(start = 1000, end = 10000, inc = 100)
	and averages those times. The user must manually change between worst, average, and
	best cases; each selection will produce its own type of array. A warm-up iteration
	is conducted prior to true testing.
***/

public class QuickSortTester{

    public static int[] arr;
    public static int size;
    public static double totalTime;

    //-----------------------Array generators-----------------------//
    
    public static void generateArray(int n) {
    	arr = new int[n];
		for (int i = 0; i < n; i++) 
		    arr[i] = (int) (Math.random() * 10000);
    }
    
    public static void generateSortedArray(int n) {
    	arr = new int[n];
		for (int i = 0; i < n; i++) 
		    arr[i] = i;
    }

    public static void worstCaseGen(int n) {
    	arr = new int[n];
	int dist = 1;
	int i = n-2;
	int mid = (n-1)/2;
	arr[mid] = n-1;
        while ( i > -1 && mid >= dist) {
	    arr[mid - dist] = i;
	    i--;
	    if (i < 0) {break;}
	    arr[mid + dist] = i;
	    i--;
	    dist++;
	}
	if (n % 2 == 0) {arr[n-1] = arr[0] - 2;}
	}

    //---------------------------------------------------------------//

    public static void printArr( int[] a ) {
    	for ( int o : a )
    		System.out.print( o + " " );
    	System.out.println();
  	}

    public static void addTime() {
		generateArray(size);
		//generateSortedArray(size);
		//worstCaseGen(size);
		for(int i = 0; i < 10; i++ ){ // 10 trials
		    double before = System.nanoTime();
		    QuickSort.qsort(arr);
		    totalTime += System.nanoTime()-before;
		}
    }

    public static void write() {	// displays time
		totalTime = 0;		
		addTime();
		double time = totalTime / 10;
		System.out.println(size + "," + time + "," + ( time / size ));
    }

    public static void main(String []args){
	
		generateArray(10000);

		//Warmup
		for (int i = 0; i < 1000; i++) {
		    QuickSort.qsort(arr);
		}
		
		System.out.println("size,time,timePerSize");
		for( size = 10000; size <= 100000; size += 1000){
		     write();
		}
	
    } // end of main method

} // end of class QuickSortTester
