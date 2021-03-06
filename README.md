# ZoomZoomZucchini
Members: Kevin Lin, Victor Lin, Kayli Matsuyoshi

Roster: 00

## The Quickest of the Zucchinis
   
### Hypothesis
   If we pivot around the median for every increase in size of the array, then  the runtime for QuickSort will be O(nlogn). If we pivot around either the maximum or minimum for every increase in size of the array, then the runtime for QuickSort will be O(n^2). If we pivot indiscriminately, then the runtime will also be O(nlogn).
    
### Background
   In class we recently developed a QuickSort algortihm that sorts an array of ints in ascending order. In this lab we aim to measure the runtime of the QuickSort method in the best and worst case scenarios, increasing the size of the array to generate data.

### Experiment Methodology
   The program performs 10 trials for every 100 increment in array size, starting at size 1000 all the way to size 10000. For each trial, the program adds the runtime to a variable which will be averaged out (sum/10) at the end. This number is the recorded datum. For the best case, the program will run on a sorted array; for the worst case, the program will run on an array with either the minimum or maximum at the points of pivot. There will also be a control trial in which all the values are randomized.
    
### Results

#### Best Case
![dataGraphBest](data/best.png)

#### Worst Case
![dataGraphWorst](data/worst.png)

#### Control/Average Case
![dataGraphAverage](data/average.png)

### Conclusions
From the data we are able to conclude that the runtime of QuickSort for the best case scenario is O(n), or linear. When running QuickSort for the worst case scenario, the runtime was O(nlogn). And for our included control case, where the values were randomized, the runtime appeared to be more linear. Hence, the location of the pivot point in the array and the nature of the array affects the runtime of the QuickSort method. 
