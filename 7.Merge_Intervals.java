Approach 1: TC = O(n2) SC = O(n)

//Iterate over all pairs of intervals and check if they overlap. 
//If two intervals overlap, we merge them into a single interval, 
//and the merged interval replaces the two original intervals in the list. 
//We continue this process until no more overlapping intervals exist.

code:

public int[][] merge(int[][] intervals) {
    List<int[]> mergedIntervals = new ArrayList<>();
    for (int i = 0; i < intervals.length; i++) {
        int[] currentInterval = intervals[i];
        for (int j = i+1; j < intervals.length; j++) {
            int[] nextInterval = intervals[j];
            if (isOverlap(currentInterval, nextInterval)) {
                currentInterval = mergeInterval(currentInterval, nextInterval);
                intervals[j] = null; // remove the merged interval from the list
            }
        }
        if (currentInterval != null) {
            mergedIntervals.add(currentInterval);
        }
    }
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
}

private boolean isOverlap(int[] interval1, int[] interval2) {
    int start1 = interval1[0];
    int end1 = interval1[1];
    int start2 = interval2[0];
    int end2 = interval2[1];
    return (start1 <= end2 && start2 <= end1);
}

private int[] mergeInterval(int[] interval1, int[] interval2) {
    int start = Math.min(interval1[0], interval2[0]);
    int end = Math.max(interval1[1], interval2[1]);
    return new int[]{start, end};
}

.......................................................................................................................................................................
  
Approach 2:

//Is approach mein hume intervals ke start time ke basis par sort karna hoga. 
//Fir, hume overlapping intervals ko merge karna hoga aur non-overlapping intervals ko ek list mein add karna hoga.
//Ant mein, hume ek array mein result list ko convert karke use return karna hoga.


code:


public int[][] merge(int[][] intervals) {
    // Sort the intervals based on their start times
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    
    // Create a list to store the merged intervals
    List<int[]> mergedIntervals = new ArrayList<>();
    
    // Initialize the current interval to be the first interval in the array
    int[] currentInterval = intervals[0];
    
    // Loop through the intervals
    for (int i = 1; i < intervals.length; i++) {
        int[] nextInterval = intervals[i];
        
        // Check if the current interval overlaps with the next interval
        if (currentInterval[1] >= nextInterval[0]) {
            // The intervals overlap, so we merge them by updating the end time of the current interval
            currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
        } else {
            // The intervals do not overlap, so we add the current interval to the list of merged intervals
            mergedIntervals.add(currentInterval);
            // Update the current interval to be the next interval
            currentInterval = nextInterval;
        }
    }
    
    // Add the last current interval to the list of merged intervals
    mergedIntervals.add(currentInterval);
    
    // Convert the list of merged intervals to an array and return it
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
}

.......................................................................................................................................................................

Dry Run:

i	  currentInterval      nextInterval	   Overlapping?	Merged Interval?	      Result List
0	  [1,3]	                     [2,6]	        Yes	             [1,6]	              -
1	  [1,6]	                     [8,10]	        No	             [1,6]	           [[1,6]]
2	  [8,10]	                   [15,18]	      No	             [8,10]	          [[1,6], [8,10]]
3	  [15,18]	                     -            -	               [15,18]	        [[1,6], [8,10], [15,18]]
