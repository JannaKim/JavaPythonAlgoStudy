N, M = map(int, input().split())
list = [i for i in range(N)]

for i in range(N):
    list[i] = map(int, input().split())

len = N - 1 if N <= M else M - 1
print(len)