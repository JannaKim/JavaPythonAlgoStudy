import sys
input=sys.stdin.readline
n = int(input())
nums = list(map(int, input().split()))
dp = [-1000 for _ in range(n)]
dp[0] = nums[0]
ans = max(-1000,dp[0])
for i in range(1, n):
    dp[i] = dp[i-1] + nums[i]
    if dp[i] < nums[i]:
        dp[i] = nums[i]
    ans = max(dp[i],ans)
print(ans)