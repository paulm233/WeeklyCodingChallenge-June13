# WeeklyCodingChallenge-June13

1) Median of Two Sorted Arrays </br>
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.</br>
The overall run time complexity should be O(log (m+n)).</br> </br>

Example1: </br>
Input:nums1 = [1,3], nums2 = [2]</br>
Output:2.00000 </br>
Explanation: merged array = [1,2,3] and median is 2.</br></br>

Example2:</br>
Input:nums1 = [1,2], nums2 = [3,4]</br>
Output:2.50000</br>
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.</br> </br>

Constraints:
- nums1.length == m </br>
- nums2.length == n </br>
- 0 <= m <= 1000 </br>
- 0 <= n <= 1000 </br>
- 1 <= m + n <= 2000 </br>
- 106 <= nums1[i], nums2[i] <= 106</br></br>

2) Mergek Sorted Lists</br>
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order. </br>
Merge all the linked-lists into one sorted linked-list and return it. </br> </br>

Example1: </br>
Input: lists = [[1,4,5],[1,3,4],[2,6]] </br>
Output:[1,1,2,3,4,4,5,6]</br>
Explanation: The linked-lists are:</br>
[
1->4->5,
1->3->4,
2->6
] </br>
merging them into one sorted list: </br>
1->1->2->3->4->4->5->6 </br>  </br>

Example2: </br>
Input: lists= [] </br>
Output: [] </br> </br>

Example3: </br>
Input: lists = [[]] </br>
Output: [] </br> </br>

Constraints: </br>
- k == lists.length </br>
- 0 <= k <= 104 </br>
- 0 <= lists[i].length <= 500 </br>
- 104 <= lists[i][j] <= 104 </br>
- lists[i] is sorted in ascending order. </br>
- The sum of lists[i].length will not exceed 104.
