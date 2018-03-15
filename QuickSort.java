//Kayli Matsuyoshi, Kevin Lin, Victor Lin
//APCS2 pd1
//HW18 -- QuickSort
//2018-03-15 R

/*****************************************************
* class QuickSort
* Implements quicksort algo to sort an array of ints in place
*
* 1. Summary of QuickSort algorithm:
* QSort(arr): Partition the partitions formed by parition until the array is sorted
*
* 2a. Worst pivot choice and associated runtime: Min/Max of the array O(n^2)
*
* 2b. Best pivot choice and associated runtime: Median of the array O(nlogn)
*
* 3. Approach to handling duplicate values in array: Because the pivot value is
*    eliminated from the next partitions, and duplicates will eventually be
*    chosen as the pivot, no special treatment for duplicates is necessary.
*****************************************************/

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o ) {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  public static int partition( int arr[], int a, int b, int c)
  {
    int v = arr[c];

    swap( c, b, arr);
    int s = a;

    for( int i = a; i < b; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
      }
      swap(s,b,arr);

      return s;
    }//end partition

    //--------------^  HELPER METHODS  ^--------------

    /*****************************************************
    * void qsort(int[])
    * @param d -- array of ints to be sorted in place
    *****************************************************/
    public static void qsort( int[] d )
    {
      qsortH(d,0,d.length-1);
    }

    private static void qsortH(int[] arr, int low, int high) {
      if (low > high) return;
      int save = partition(arr,low,high,(low+high)/2);
      qsortH(arr,low,save-1);
      qsortH(arr,save+1,high);
    }
  }//end class QuickSort
