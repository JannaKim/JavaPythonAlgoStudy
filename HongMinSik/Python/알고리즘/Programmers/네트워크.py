N = int(input())
check = [False for i in range(N)]
net = [[1, 1, 0], [1, 1, 1], [0, 1, 1]]

def solution(N, net):
    answer = 0
    check = [False for i in range(N)]
    for i in range(N):
        if check[i] == False:
            DFS(N, net, i, check)
            answer += 1
    return answer

def DFS(N, net , start, check):
    if check[start] == True: return
    check[start] = True
    for i in range(N):
        if check[i] == False and net[i][start] == 1:
            DFS(N, net, i, check)

print(solution(N, net))