# BFS구현을 위한 재료 : 방문확인 리스트, 큐

from collections import deque

N, M = map(int, input().split())

a = [[0] * N for i in range(N)]
check = [False for i in range(N)]

queue = deque()

def BFS(start):
    q = deque()
    q.append(start)
    check[start] = True
    for i in q:
        x = q.popleft()
        print(x)
        for i in range(len(a)):
            y = a[x][i]
            if(check[y] == False):
                q.append(y)
                check[y] = True

for i in range(M):
    x, y = map(int, input().split())
    a[x][y] = a[y][x] = 1

for i in a:
    print(i)

BFS(0)
