//TLE recursive solution
//this is because say if a substring "leet" in "leetcode" doesn't exist our recursive soultion will still compute c, co,cod,code which isn't necessary and is a huge overhead
//we need a more efficient solution we can use DP
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s == null || s.length() == 0) return true;
        HashSet<String> set = new HashSet<>(wordDict);
        return helper(s, set);
    }
    private boolean helper(String s, HashSet<String> set) {
        //base
        if(s.length() == 0) return true;
        //logic
        for(int i = 0; i < s.length(); i++) {
            if(set.contains(s.substring(0, i + 1)) && helper(s.substring(i + 1), set)) {
                return true;
            }
        }
        return false;
    }
}