from itertools import combinations as combi
n, s= map(int, input().split())
L=[*map(int, input().split())]
ans=0
for i in range(1,n+1):
    for ls in combi(L,i):
        if sum(ls)==s:
            ans+=1
print(ans)