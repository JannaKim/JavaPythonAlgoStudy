from typing import ByteString


n= int(input())
L= [*map(int ,input().split())]
L.sort()
m= int(input())
M= [*map(int ,input().split())]

def TP(k):
    lo, hi= 0, n-1
    left=0 
    while lo<hi: # 같은애들중에서 가장 작은애나, 없으면 큰애들 중 가장 작은애
        mid= (lo+hi)//2 # 같은애가 없고 큰애도 없을때가 걱정이다.
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
    while lo<hi: # 큰애들 중에 가장 작은애
        mid= (lo+hi)//2 
        if L[mid]>k: # 큰애가 없을까봐 걱정
            hi=mid
        else:
            lo=mid+1
    if L[lo]>k:
        right=lo    
    else:
        right=lo+1

    return right-left
    
# -10 -10 2 3 3 6 7 10 10 10 
#   0   1 2 3 4 5 6 7  8  9 
ans=[]

for el in M:
    ans.append(TP(el))
print(*ans)

