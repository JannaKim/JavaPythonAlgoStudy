N, M = map(int, input().split())
arr = [[0] * (N + 1) for i in range(N + 1)]

for i in range(M):
    x, y = map(int, input().split())
    arr[x][y] = arr[y][x] = 1

for i in arr:
    print(i)

check = [False for i in range(N + 1)]

cnt = 0
def DFS(start):
    if check[start] == True: return
    check[start] = True
    print(start)
    for i in range(len(check)):
        if(check[i] == False and arr[start][i] == 1):
            DFS(i)
    
    for i in range(1, len(check)):
        if(check[i] == False):
            DFS(i)    
    
DFS(1)
print(check)
