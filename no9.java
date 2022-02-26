class Solution {
    public boolean isPalindrome(int x) {
        String c = Integer.toString(x);
        String r = "";
        for(int i = c.length()-1; i >=0 ;i--){
            r = r+ c.charAt(i);
        }
        if(c.equals(r)) return true;
        else return false;
    }
}