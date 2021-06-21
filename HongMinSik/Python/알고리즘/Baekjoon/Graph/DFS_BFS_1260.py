from collections import deque

N, M, V = map(int, input().split())

adj = [[0]*(N+1) for i in range(N+1)]
check = [False] * (N + 1)

for i in range(M):
    a, b = map(int, input().split())
    adj[a][b] = adj[b][a] = 1

def DFS(adj, start, check):
    if check[start] == True: return
    check[start] = True
    print(start, end = ' ')
    for i in range(len(check)):
        if check[i] == False and adj[i][start] == 1:
            DFS(adj, i, check)

def BFS(adj, start, check):
    queue = deque([start])
    check[start] = True
    while queue:
        v = queue.popleft()
        print(v, end = ' ')
        for i in range(len(check)):
            if not check[i] and adj[i][v] == 1:
                queue.append(i)
                check[i] = True
    

DFS(adj, V, check)
print()
for i in range(len(check)):
    check[i] = False
BFS(adj, V, check)