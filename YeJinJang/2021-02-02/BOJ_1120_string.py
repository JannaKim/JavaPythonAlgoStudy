import sys
input=sys.stdin.readline
A, B = map(str, input().split())
ans = 50
for i in range(len(B)-len(A)+1):
    cnt = 0
    for j in range(len(A)):
        if A[j] != B[i+j]:
            cnt += 1
    if cnt<ans:
        ans = cnt
print(ans)