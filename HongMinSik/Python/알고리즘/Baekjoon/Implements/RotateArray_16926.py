N, M, R = map(int, input().split())

list = [i for i in range(N)]
for i in range(N):
    list[i] = map(int, input().split())

for i in list:
    for j in i:
        print(j, end = ' ')
    print()

