N, M, L, K = map(int, input().split())
arr = [[0] * M for i in range(N)]
for i in range(K):
    a, b = map(int, input().split())
    arr[a - 1][b - 1] = 1

answer = []
for i in range(len(arr) - L + 1):
    for j in range(len(arr[i]) - L + 1):
        cnt = 0
        for x in range(i, i + L):
            for y in range(j, j + L):
                if(arr[x][y] == 1) : cnt += 1
        answer.append(cnt)

print(max(answer))