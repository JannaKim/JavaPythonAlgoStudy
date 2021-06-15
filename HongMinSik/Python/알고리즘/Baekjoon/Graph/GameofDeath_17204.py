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
    result.append(start)
    for i in range(len(adj)):
        if(check[i] == False and adj[i][start] == 1 and adj[i][i] != 1):
            DFS(i)
    return

for i in range(N):
    member[i] = int(input())
    adj[i][member[i]] = adj[member[i]][i] = 1

DFS(0)
for i in adj:
    print(i)
print(result)
if K in result:
    print(result.index(K))
else:
    print(-1)

# 네트워크 내에서 연결된 노드들을 모두 한번씩 방문하였고, K가 네트워크 상에 존재하지 않는다면 -1을 출력해야한다
