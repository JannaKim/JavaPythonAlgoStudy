import sys
dp ={}
dp[1]= '-'
def rec(k):
    if k in dp:
        return dp[k]
    tmp=0
    if k//3 in dp:
        tmp=dp[k//3]
    else:
        tmp= rec(k//3)
        dp[k//3]=tmp
    return tmp+' '*(k//3)+tmp

for ln in sys.stdin:
    a= int(ln)
    print(rec(3**a))