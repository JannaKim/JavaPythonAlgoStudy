import sys
input=sys.stdin.readline
n = int(input())

dp = [0 for _ in range(1001)]
dp[0] = 1
dp[1] =1
def dfs(n):
    if dp[n]>0:
        return dp[n]
    print(n)
    if n<= 1: return 1
    else:
        dp[n]=dfs(n-1)+2*dfs(n-2)
        return dp[n]

print(dfs(n))

dp = [0 for _ in range(1001)]
dp[0] = 1
dp[1] = 1
print(dp)
if n<=1: print(dp[n])
elif dp[n]>0: print(dp[n])
else:
    for i in range(2, n+1):
        dp[i] = dp[i-1]+2*dp[i-2]
    print(dp[n])

# 세로*가로
# n-1까지: 2*1 남음: dfs(n-1)
# n-2까지: 2*2 남음: 1*2짜리 두 개/ 2*2짜리 하나/ 2*1짜리 두 개는 dfs(n-1)과 겹침 => 2*dfs(n-2)
