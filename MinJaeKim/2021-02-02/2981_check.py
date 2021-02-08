from math import *
# 난이도 true story?

n= int(input())
L=[]
for _ in range(n):
    L.append(int(input()))

def gcd(a, b):
    if a*b==0:
        return a+b
    if a>b:
        return gcd(a%b, b)
    else:
        return gcd(a, b%a)
if n>=3: ###### prob 1
    x=gcd(abs(L[1]-L[0]), abs(L[2]-L[1]))
else:
    x=L[1]-L[0]
if n>=4: ###### prob 2
    for a, b in zip(L[3:], L[2:]):
        x= gcd(x, abs(a-b))

ans=[]
for i in range(2,int(sqrt(x))+1):
    if not x%i:
        ans.append(i)
        ans.append(x//i)
ans.append(x)
ans=list(set(ans))
ans.sort()
print(*ans)
