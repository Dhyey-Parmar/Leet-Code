class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode pre = head;
        ListNode curr = head.next;
        ListNode post = head.next.next;

        int i = 1;

        int first = -1;
        int last = -1;
        int cri = -1;

        int min = Integer.MAX_VALUE;

        while (post != null) {

            boolean critical =
                (curr.val > pre.val && curr.val > post.val) ||
                (curr.val < pre.val && curr.val < post.val);

            if (critical) {

                if (first == -1) {
                    first = i;
                }

                if (cri != -1) {
                    min = Math.min(min, i - cri);
                }

                cri = i;
                last = i;
            }

            pre = curr;
            curr = post;
            post = post.next;

            i++;
        }

        if (first == last) {
            return new int[]{-1, -1};
        }

        return new int[]{min, last - first};
    }
}