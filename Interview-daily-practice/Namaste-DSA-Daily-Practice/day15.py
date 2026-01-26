class Solution:
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
        max_count = 0
        current_count = 0
        
        for n in nums:
            if n == 1:
                current_count += 1
            else:
                max_count = max(max_count, current_count)
                current_count = 0
        
        # final check at end of array
        max_count = max(max_count, current_count)
        return max_count

#O(n)  ---time complexity
#O(1)  ---space complexity