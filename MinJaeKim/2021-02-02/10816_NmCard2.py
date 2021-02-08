from typing import ByteString


n= int(input())
L= [*map(int ,input().split())]
L.sort()
m= int(input())
M= [*map(int ,input().split())]

def TP(k):
    lo, hi= 0, n-1
    left=0 
    while lo<hi:
        mid= (lo+hi)//2 
        if L[mid]>=k:
            hi=mid
        else:
            lo=mid+1
    if L[lo]>=k: 
        left=lo
    else:
        left=lo+1
        

    
    lo, hi= 0, n-1
    right=0 
    while lo<hi:
        mid= (lo+hi)//2 
        if L[mid]>k:
            hi=mid
        else:
            lo=mid+1
    if L[lo]>k:
        right=lo    
    else:
        right=lo+1

    return right-left
    


ans=[]

for el in M:
    ans.append(TP(el))
print(*ans)

