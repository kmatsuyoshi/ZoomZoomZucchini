# ZoomZoomZucchini
Members: Kevin Lin, Victor Lin, Kayli Matsuyoshi

Roster: 00

## The Quickest of the Zucchinis
   
### Hypothesis
   If we pivot around the median for every increase in size of the array,then  the runtime for QuickSort will be O(nlogn). If we pivot around either the maximum or minimum for every increase in size of the array, then the runtime for QuickSort will be O(n^2).
    
### Background

### Experiment Methodology
   The program performs 10 trials for every 100 increment in array size, starting at size 1000 all the way to size 10000. For each trial, the program adds the runtime to a variable which will be averaged out (sum/10) at the end. This number is the recorded datum. For the best case, the program will run on a sorted array; for the worst case, the program will run on an array with either the minimum or maximum at the points of pivot.
    
### Results
![dataGraphBest]()

![dataGraphWorst]()

### Conclusions
