import sys
import math
input=sys.stdin.readline
t = int(input())
for i in range(t):
    dic = {}
    n = int(input())
    for _ in range(n):
        name, cate = map(str, input().split())
        if cate not in dic:
            dic[cate] = [name]
        else:
            dic[cate].append(name)
    ans = 1
    for k in dic:
        ans *= len(dic[k])+1
    ans -= 1
    print(ans)
