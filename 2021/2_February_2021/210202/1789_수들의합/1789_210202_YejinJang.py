import sys
from math import sqrt
input=sys.stdin.readline
s = int(input())
n = 1
while n*(n+1)/2<=s:
    n+=1
print(n-1) 