from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs):
        mp = defaultdict(list)

        for s in strs:
            key = ''.join(sorted(s))
            mp[key].append(s)

        return list(mp.values())
