import sys
input=sys.stdin.readline
n = int(input())

dp = [0 for _ in range(1001)]
dp[1] = 1
dp[2] = 0
dp[3] = 1
dp[4] = 1
for i in range(5, 1002):
    if dp[i-1] + dp[i-3] + dp[i-4] == 3:
        dp[i] = 0
    else:
        dp[i] = 1
if dp[n] == 1:
    print("SK")
else:
    print("CY")