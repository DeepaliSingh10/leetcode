class Solution:
    def minimumPushes(self, s: str) -> int:
        d={}
        for i in s:
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        dii=sorted(d.values(),reverse=True)
        ans=0
        for i in range(len(dii)):
            c=(i//8)+1
            ans+=c*dii[i]
        return ans


