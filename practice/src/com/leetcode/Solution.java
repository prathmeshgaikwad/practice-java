package com.leetcode;

// LeetCode Solution





















// Easy Collection

// Array

// Remove Duplicates from Sorted Array
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
// The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
// Input: nums = [0,0,1,1,1,2,2,3,3,4] Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]


//public class Solution {
//public int removeDuplicates(int[] nums) {
//	if (nums.length == 0)
//		return 0;
//
//	int k = 1; // k points to the first unique element
//	for (int i = 1; i < nums.length; i++) {
//		if (nums[i] != nums[i - 1]) {
//			nums[k++] = nums[i]; // Update the next unique element
//		}
//	}
//	return k; // k represents the number of unique elements
//}
//
//public static void main(String[] args) {
//	Solution solution = new Solution();
//
//	int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
//	int k2 = solution.removeDuplicates(nums2);
//	System.out.println("Output: " + k2 + ", nums = " + java.util.Arrays.toString(nums2));
//}
//}

//TC: O(n)
//SC: O(1)


//  Best Time to Buy and Sell Stock II

// You are given an integer array prices where prices[i] is the price of a given stock on the ith day. 
// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. 
// However, you can buy it then immediately sell it on the same day. Find and return the maximum profit you can achieve.
// Input: nums = [1,1,2] Output: 2, nums = [1,2,_]

//public class Solution {
// public int maxProfit(int[] prices) {
//     int maxProfit = 0;
//     
//     for (int i = 1; i < prices.length; i++) {
//         // If the current price is higher than the previous day, add the profit
//         if (prices[i] > prices[i - 1]) {
//             maxProfit += prices[i] - prices[i - 1];
//         }
//     }
//     
//     return maxProfit;
// }
//
// public static void main(String[] args) {
// 	Solution solution = new Solution();
//
//     int[] prices1 = {7, 1, 5, 3, 6, 4};
//     int profit1 = solution.maxProfit(prices1);
//     System.out.println("Output: " + profit1);
//
// }
//}

//TC: O(n)
//SC: O(1) 

//  Rotate Array
//  Contains Duplicate
//  Single Number
//  Intersection of Two Arrays II
//  Plus One
//  Move Zeroes
//  Two Sum
//  Valid Sudoku
//  Rotate Image

//Strings
//  Reverse String
//  Reverse Integer
//  First Unique Character in a String
//  Valid Anagram
//  Valid Palindrome
//  String to Integer (atoi)
//  Implement strStr()
//  Longest Common Prefix
//
//Linked List
//  Delete Node in a Linked List
//  Remove Nth Node From End of List
//  Reverse Linked List
//  Merge Two Sorted Lists
//  Palindrome Linked List
//  Linked List Cycle
//
//Trees
//  Maximum Depth of Binary Tree
//  Validate Binary Search Tree
//  Symmetric Tree
//  Binary Tree Level Order Traversal
//  Convert Sorted Array to Binary Search Tree
//
//Sorting and Searching
//  Merge Sorted Array
//  First Bad Version
//
//Dynamic Programming
//  Climbing Stairs
//  Best Time to Buy and Sell Stock
//  Maximum Subarray
//  House Robber

//Design
//  Shuffle an Array
//  Min Stack

//Math
//  Fizz Buzz
//  Count Primes
//  Power of Three
//  Roman to Integer

//Others
//  Number of 1 Bits
//  Hamming Distance
//  Reverse Bits
//  Pascal's Triangle
//  Valid Parentheses
//  Missing Number


//Medium Collection

//Array and Strings
//  3Sum
//  Set Matrix Zeroes
//  Group Anagrams
//  Longest Substring Without Repeating Characters
//  Longest Palindromic Substring
//  Increasing Triplet Subsequence
//  Missing Ranges
//  Count and Say

//Linked List
//  Add Two Numbers
//  Odd Even Linked List
//  Intersection of Two Linked Lists

//Trees and Graphs
//  Binary Tree Inorder Traversal
//  Binary Tree Zigzag Level Order Traversal
//  Construct Binary Tree from Preorder and Inorder Traversal
//  Populating Next Right Pointers in Each Node
//  Kth Smallest Element in a BST
//  Inorder Successor in BST
//  Number of Islands

//Backtracking
//  Letter Combinations of a Phone Number
//  Generate Parentheses
//  Permutations
//  Subsets
//  Word Search

//Sorting and Searching
//  Sort Colors
//  Top K Frequent Elements
//  Kth Largest Element in an Array
//  Find Peak Element
//  Search for a Range
//  Merge Intervals
//  Search in Rotated Sorted Array
//  Meeting Rooms II
//  Search a 2D Matrix II

//Dynamic Programming
//  Jump Game
//  Unique Paths
//  Coin Change
//  Longest Increasing Subsequence

//Design
//  Flatten 2D Vector
//  Serialize and Deserialize Binary Tree
//  Insert Delete GetRandom O(1)
//  Design Tic-Tac-Toe

//Math
//  Happy Number
//  Factorial Trailing Zeroes
//  Excel Sheet Column Number
//  Pow(x, n)
//  Sqrt(x)
//  Divide Two Integers
//  Fraction to Recurring Decimal

//Others
//  Sum of Two Integers
//  Evaluate Reverse Polish Notation
//  Majority Element
//  Find the Celebrity
//  Task Scheduler


//Hard Collection

//Array and Strings
//  Product of Array Except Self
//  Spiral Matrix
//  4Sum II
//  Container With Most Water
//  Game of Life
//  First Missing Positive
//  Longest Consecutive Sequence
//  Find the Duplicate Number
//  Longest Substring with At Most K Distinct Characters
//  Basic Calculator II
//  Sliding Window Maximum
//  Minimum Window Substring

//Linked List
//  Merge k Sorted Lists
//  Sort List
//  Copy List with Random Pointer

//Trees and Graphs
//  Word Ladder
//  Surrounded Regions
//  Lowest Common Ancestor of a Binary Tree
//  Binary Tree Maximum Path Sum
//  Friend Circles
//  Course Schedule
//  Course Schedule II
//  Longest Increasing Path in a Matrix
//  Alien Dictionary
//  Count of Smaller Numbers After Self

//Backtracking
//  Palindrome Partitioning
//  Word Search II
//  Remove Invalid Parentheses
//  Wildcard Matching
//  Regular Expression Matching

//Sorting and Searching
//  Wiggle Sort II
//  Kth Smallest Element in a Sorted Matrix
//  Median of Two Sorted Arrays

//Dynamic Programming
//  Maximum Product Subarray
//  Decode Ways
//  Best Time to Buy and Sell Stock with Cooldown
//  Perfect Squares
//  Word Break
//  Word Break II
//  Burst Balloons

//Design
//  LRU Cache
//  Implement Trie (Prefix Tree)
//  Flatten Nested List Iterator
//  Find Median from Data Stream
//  Range Sum Query 2D - Mutable

//Math
//  Largest Number
//  Max Points on a Line

//Others
//  Queue Reconstruction by Height
//  Trapping Rain Water
//  The Skyline Problem
//  Largest Rectangle in Histogram

