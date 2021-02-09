import sys
input=sys.stdin.readline
N, S = map(int, input().split())
seq = list(map(int, input().split()))
cnt = 0
def dfs(i, sum):
    global cnt
    if i==N:
        return
    if sum+seq[i]==S:
        cnt+=1
    dfs(i+1, sum) # seq[i] 더하지 않는 경우
    dfs(i+1, sum+seq[i])
dfs(0, 0)
print(cnt)