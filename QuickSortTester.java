//Zoom Zoom Zucchini - Kayli Matsuyoshi, Kevin Lin, Victor Lin
//APCS2 --  pd1
//Lab01 --  What Does the Data Say?
//2018-03-15 R

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
		for(int j=0;j<n;j+=(n/(int)(Math.log(n) / Math.log(2))-3))
			arr[j] = (int)(Math.random() * 20) + 1;
		for(int i=0;i<n;i++)
			if(arr[i] == 0){arr[i]=(int)(Math.random() * 10000) + 11;}
	}

    //---------------------------------------------------------------//

    public static void printArr( int[] a ) {
    	for ( int o : a )
    		System.out.print( o + " " );
    	System.out.println();
  	}

    public static void addTime() {
		//generateArray(size);
		//generateSortedArray(size);
		worstCaseGen(size);
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
	
		generateArray(100);

		//Warmup
		for (int i = 0; i < 100; i++) {
		    QuickSort.qsort(arr);
		}
		
		System.out.println("size,time,timePerSize");
		for( size = 1000; size <= 10000; size += 100){
		     write();
		}
	
    } // end of main method

} // end of class QuickSortTester
