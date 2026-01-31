class Solution:
    def mergeTwoLists(self, list1, list2):
        dummy = ListNode(0)
        curr = dummy

        while list1 and list2:
            if list1.val <= list2.val:
                curr.next = list1
                list1 = list1.next
            else:
                curr.next = list2
                list2 = list2.next
            curr = curr.next

        
        if list1:
            curr.next = list1
        else:
            curr.next = list2

        return dummy.next
        
# The time complexity of this approach is O(n + m), where n and m are the lengths of list1 and list2 respectively.
# The space complexity is O(1) since we are not using any additional data structures that