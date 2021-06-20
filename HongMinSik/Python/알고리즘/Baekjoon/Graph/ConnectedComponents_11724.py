N, M = map(int, input().split())
adj = [[0] * (N + 1) for i in range(N + 1)]

for i in range(M):
    a, b = map(int, input().split())
    adj[a][b] = adj[b][a] = 1

def solution(N, adj):
    answer = 0
    check = [False for i in range(N + 1)]
    for i in range(len(check)):
        if check[i] == False:
            DFS(N, adj, i, check)
            answer += 1
    return answer

def DFS(N, adj, start, check):
    if check[start] == True: return
    check[start] = True
    for i in range(len(check)):
        if check[i] == False and adj[i][start] == 1:
            DFS(N, adj, i, check)

print(solution(N, adj) - 1)
