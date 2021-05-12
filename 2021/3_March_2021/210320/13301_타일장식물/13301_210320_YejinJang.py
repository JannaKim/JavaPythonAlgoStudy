import sys
input=sys.stdin.readline
n = int(input())
dp = [1 for _ in range(n)]
ans = 4

if n>1:
    for i in range(2, n):
        dp[i]=dp[i-1]+dp[i-2]
    ans = dp[n-1]*4+dp[n-2]*2

print(ans)

# 1 1 2 3 5 8
# n=3(i=2): 가로=dp[1]+dp[2], 세로=dp[2]
# n=4(i=3): 가로=dp[3], 세로=dp[2]+dp[3]
# n=5(i=4): 가로=dp[3]+dp[4], 세로=dp[4]