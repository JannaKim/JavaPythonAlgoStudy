import sys
from itertools import combinations
input=sys.stdin.readline
t = int(input())
for i in range(t):
    n, m = map(int, input().split())
    arr = [0 for _ in range(m)]
    mCn = list(combinations(arr,n))
    print(len(mCn))
