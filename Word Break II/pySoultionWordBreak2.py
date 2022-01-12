class Solution:
    def wordBreak(self, s: str, words: List[str]) -> List[str]:
        def bt(s, i, ans=[]):
            if i==len(s):
                return [ ans ] 

            toReturn = [] 
            for word in words:
                if s.startswith(word,i):
                    toReturn += bt(s, i+len(word), ans+[word])
            return toReturn
        return [ " ".join(line) for line in bt(s, 0) ]
