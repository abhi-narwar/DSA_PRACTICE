class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        new_index=1

        for i in range(1,len(nums)):
            if nums[i]!=nums[i-1]:
                nums[new_index]=nums[i]
                new_index+=1
        return new_index
    
#O(n)  ---time complexity
#O(1)  ---space complexity