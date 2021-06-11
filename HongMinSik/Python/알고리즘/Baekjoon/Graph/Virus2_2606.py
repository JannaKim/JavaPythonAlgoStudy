N = int(input())
M = int(input())

nets = [[0]*N for i in range(N)]

for i in range(M):
    a, b = map(int, input().split())
    nets[a-1][b-1] = nets[b-1][a-1] = 1

check = [False for i in range(N)]

def DFS(start):
    check[start] = True # 방문하지 않았으면 방문처리
    print(start) # 방문한 곳 출력
    for i in range(N):
        if check[i] == False and nets[start][i] == 1: # 인접행렬에 연결이 되어있고, 방문하지 않은 노드라면...
            DFS(i)
    return 

