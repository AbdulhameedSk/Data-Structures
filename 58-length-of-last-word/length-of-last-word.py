class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        stripping = s.strip();
        a=stripping.split(" ")
        return len(a[-1])