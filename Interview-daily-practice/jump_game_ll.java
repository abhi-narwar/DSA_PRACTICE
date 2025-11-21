class jump_game_ll {
    public int jump(int[] nums) {
        int jumps = 0;
        int current_end = 0;
        int reach = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            reach = Math.max(reach, i + nums[i]);

            
            if (i == current_end) {
                jumps++;
                current_end = reach;
            }
        }

        return jumps;
    }
}
