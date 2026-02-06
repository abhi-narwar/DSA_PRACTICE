class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        s = list(s)
        i = 0

        while i < len(s):
            left = i
            right = min(i + k - 1, len(s) - 1)

            
            while left < right:
                s[left], s[right] = s[right], s[left]
                left += 1
                right -= 1

            i += 2 * k   

        return "".join(s)
