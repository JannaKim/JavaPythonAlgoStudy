import sys
input=sys.stdin.readline

n,m = map(int, input().split())
adj = [[] for _ in range(n+1)]
visited = [[False] * (n+1)]
cnt = 0

def dfs(node):
    visited[node] = True
    for i in adj[node]:
        if not visited[i]:
            dfs(i)

for _ in range(m):
    u, v = map(int, input().split())
    adj[u].append(v)
    adj[v].append(u)

for i in range(1, n):
    if not visited[i]:
        cnt += 1
        dfs(i)

print(cnt)

print(adj)
print(visited)
'''
dic = {}
u, v = map(int, input().split())
dic[u] = [v]
for i in range(1, m):
    u, v = map(int, input().split())
    if u not in dic:
        if v in dic:
            dic[v].append(u)
        elif v in dic.values():
            dic[u] = [v]
    #dic[u] = v
print(dic)
'''