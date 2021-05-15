N, K = map(int, input().split())
arr = list(map(int, input().split()))
ans = 0

def recursive(num, ten):
    global arr
    global ans
    if(num>N): return
    ans = max(ans, num)
    for i in reversed(range(K-1)):
        recursive(num + ten * arr[i], ten*10)

recursive(0,1)
print(ans)