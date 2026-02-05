class Solution:
    def balancedStringSplit(self, s: str) -> int:
        balance = 0
        result = 0

        for ch in s:
            if ch == 'R':
                balance += 1
            else:   # 'L'
                balance -= 1

            if balance == 0:
                result += 1

        return result
