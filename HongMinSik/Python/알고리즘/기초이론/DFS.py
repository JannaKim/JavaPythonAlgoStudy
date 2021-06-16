# DFS구현을 위한 재료 : 방문확인 리스트, 인접행렬.
# DFS는 스택을 이용하여 구현하나, 컴퓨터는 기본적으로 스택 자료구조를 이용하기때문에 재귀로도 가능하다

N = int(input())

nets = [[0]*N for i in range(N)]
check = [False] * N

for i in range(N):
    nets[i] = map(int, input().split())

def DFS(start):
    check[start] = True
    print(start)
    for i in nets[start]:
        if not check[i]:
            DFS(start)

DFS(0)
