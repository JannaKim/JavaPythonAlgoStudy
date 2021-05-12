n= int(input())
L=[int(input()) for _ in range(n)]
def gcd(a,b):
    if not a*b:
        return a+b
    if a>b:
        return gcd(a%b, b)
    return gcd(a, b%a)

GCD=L[0]
L.sort()
if n>=2:
    GCD=L[1]-L[0]
else:
    GCD=L[0]
for i in range(2,n):
    GCD= gcd(GCD,L[i]-L[i-1])

ans=set()
ans.add(GCD)
for i in range(2,int(GCD**(0.5))+1):
    if not GCD%i:
        ans.add(i)
        ans.add(GCD//i)
ans=sorted(list(ans))
print(*ans)