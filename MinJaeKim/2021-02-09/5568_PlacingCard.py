n= int(input())
k= int(input())
L=[int(input()) for _ in range(n)]

ans=set()
def backtrack(i, cnt, num):
    if cnt==k:
        ans.add(num)
        return
    if i==n:
        return
    backtrack(i+1, cnt+1, num*10+L[i])
    backtrack(i+1, cnt, num)


print(len(list(ans)))