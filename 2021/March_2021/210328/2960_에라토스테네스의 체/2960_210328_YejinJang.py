import sys
input=sys.stdin.readline
n,k = map(int, input().split())
nums = [0 for _ in range(n-1)]
for i in range(n-1):
    nums[i] = i+2
cnt = 0

isPrime = [ bool for _ in range(n+1)]
for i in range(2, n+1):
    isPrime[i] = True

for i in range(2, n+1):
    for j in range(i, n+1, i):
        if(not isPrime[j]): continue
        # k 번째 수 찾을 때 까지 ㅅㅗㅅㅜ ㅍㅏㄴㅂㅕㄹ, 배열 False
        isPrime[j] = False
        cnt += 1
        if(cnt == k):
            print(j)
'''
def isPrime(d):
    for i in range(2, a):
        if(a%i==0):
            return False
    return True

for i in range(n-1):
    if(isPrime(nums[i]):

    fo
'''