class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:

        # base case
        if len(nums) <= 1:
            return nums

        # divide
        mid = len(nums) // 2
        left = self.sortArray(nums[:mid])
        right = self.sortArray(nums[mid:])

        # merge
        i = j = 0
        result = []

        while i < len(left) and j < len(right):
            if left[i] <= right[j]:
                result.append(left[i])
                i += 1
            else:
                result.append(right[j])
                j += 1

        # add remaining elements
        result.extend(left[i:])
        result.extend(right[j:])

        return result
    
#O(n log n)  ---time complexity
#O(n)        ---space complexity