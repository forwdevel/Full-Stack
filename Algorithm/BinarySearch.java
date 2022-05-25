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
// 1. 현재 데이터 셋의 중앙값 선택 (홀수일 때, 2로 나눈 몫의 +1)
// 2. 중앙값 > 타깃 데이터일 때 중앙값 기준으로 왼쪽 데이터 셋 선택
// 3. 중앙값 < 타깃 데이터일 때 중앙값 기준으로 오른쪽 데이터셋 선택
// 4. 과정 1~3을 반복하다가, 중앙값 == 타깃 데이터일 때 탐색 종료


