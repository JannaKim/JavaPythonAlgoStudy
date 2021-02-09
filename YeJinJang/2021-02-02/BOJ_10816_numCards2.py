import sys
input=sys.stdin.readline
N = int(input())
Narr = list(map(int, input().split()))
M = int(input())
Marr = list(map(int, input().split()))
dic = {}
for n in Narr:
    if n in dic:
        dic[n] += 1
    else:
        dic[n] = 1

print(' '.join(str(dic[m]) if m in dic else '0' for m in Marr))