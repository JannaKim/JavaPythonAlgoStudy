N, K = map(int, input().split())
check = [False for i in range(N + 1)]

cnt = 0

for i in range(2, N + 1):
    for j in range(i, N + 1, i):
        if(check[j] == False):
            check[j] = True
            cnt += 1
        if(cnt == K): 
            print(j)
            break
    if (cnt == K): break

# 반복문에서 j의 증가값을 주어서 i의 배수를 구할수도 있다.
# 굳이 i * j안해도 된다 이말이야~