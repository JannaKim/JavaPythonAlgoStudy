N, K = map(int, input().split())
member = [i for i in range(N)]
adj = [[0]*N for i in range(N)]
check = [False for i in range(N)]
result = []

cnt = 0

def DFS(start):
    if(check[start] == True): 
        return
    check[start] = True
    for i in range(len(adj)):
        if(check[i] == False and adj[i][start] == 1):
            result.append(start)
            DFS(i)
    return

for i in range(N):
    member[i] = int(input())
    adj[i][member[i]] = adj[member[i]][i] = 1

DFS(0)
print(result)
if K in result:
    print(result.index(K))
else:
    print(-1)

#
