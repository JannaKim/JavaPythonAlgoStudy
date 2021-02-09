import sys
input=sys.stdin.readline
N = int(input())
net = {}
for i in range(N):
    net[i+1] = set()
M = int(input())
for i in range(M):
    a, b = map(int, input().split())
    net[a].add(b)
    net[b].add(a)

def dfs(n):
    global net
    for i in net[n]: # for i in {2, 5}
        if i not in visited:
            visited.append(i)
            dfs(i)
visited = []
dfs(1)
print(len(visited)-1)