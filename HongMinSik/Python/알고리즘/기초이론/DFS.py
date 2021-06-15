# DFS구현을 위한 재료 : 방문확인 리스트, 인접행렬.
# DFS는 스택을 이용하여 구현하나, 컴퓨터는 기본적으로 스택 자료구조를 이용하기때문에 재귀로도 가능하다

N = int(input())
M = int(input())

nets = [[0]*N for i in range(N)]

for i in range(M):
    a, b = map(int, input().split())
    if(nets[a][b] == 0):
        nets[a][b] = b
        nets[b][a] = a
    
check = [False for i in range(N)]

def DFS(start):
    if check[start] == True: return #방문했으면 리턴
    check[start] = True
    print(start+1)
    for i in range(len(nets)):
        DFS(nets[start][i])

for i in nets:
    print(i)

DFS(0)