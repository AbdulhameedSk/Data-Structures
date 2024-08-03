class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.replace(" ","")
        s=re.sub(r'[^a-zA-Z0-9]',"",s).lower()
        return (s==s[::-1])