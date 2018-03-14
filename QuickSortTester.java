//Zoom Zoom Zucchini - Kayli Matsuyoshi, Kevin Lin, Victor Lin
//APCS2 --  pd1
//Lab01 --  What Does the Data Say?
//2018-03-14W

public class QuickSortTester{

    public static int[] arr;
    public static int size;
    public static double totalTime;
    
    public static int[] generateArray(int n) {
	int[] output = new int[n];
	for (int i = 0; i < n; i++) {
	    output[i] = (int) (Math.random() * 10000);
	}
	return output;
    }

    public static int[] generateSortedArray(int n) {
	int output[] = new int[n];
	for (int i = 0; i < n; i++) {
	    output[i] = i;
	}
	return output;
    }

    public static int[] worstCaseGen(int n) {
	int output[] = new int[n];
	int dist = 1;
	int i = n-2;
	int mid = (n-1)/2;
	output[mid] = n-1;
        while ( i > -1 ) {
	    output[mid - dist] = i;
	    i--;
	    if (i < 0) {break;}
	    output[mid + dist] = i;
	    dist++;
	}
	return output;
    }

    public static void printArray( int[] array ) {
	System.out.print("[");
	for( int i = 0; i < array.length - 1; i++ )
	System.out.print( array[i] + ",");
	System.out.println( array[(array.length - 1)] + "]");
    }
    
    public static void addTime() {
	arr = generateArray(size);
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
	
	int[] arr = generateArray(100);

	//Warmup
	for (int i = 0; i < 100; i++) {
	    QuickSort.qsort(arr);
	}
	
	System.out.println("size,time,timePerSize");
	for( size = 1000; size <= 10000; size += 100 ){
	    write();
	}
	
    } // end of main method

} // end of class QuickSortTester
