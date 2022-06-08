// Binary Search

//------------------------------------------------------------------------------

// Algorithm to find the desired value in the state that the data is sorted.

//------------------------------------------------------------------------------

// The most commonly used.
// Area required by many coding tests.
// Simple implementation and principle.
// Compare the median value of the target data with the value you want to find
// and find the target while reducing it by half.

//------------------------------------------------------------------------------


// Function: Explore target data
// Features: Target reduction method through median comparison
// Time Complexity: logN

//------------------------------------------------------------------------------

// Search Process
// 1. Select the median value of the current dataset. (If odd, quotient devided by 2, +1)
// 2. In case of median > target data, select left data set as the median.
// 3. In case of median < target data, select right data set as the median.
// 4. Repeat steps 1 to 3, and search ends when median == target data.