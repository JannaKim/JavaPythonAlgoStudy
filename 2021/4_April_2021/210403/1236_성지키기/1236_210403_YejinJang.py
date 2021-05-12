import sys
input=sys.stdin.readline
n, m = map(int, input().split())
mn = [[] for i in range(n)]
x = []
cnt = 0
cnt2 = 0

for i in range(n):
    mn[i] = list(map(str, input()))

for i in range(n):
    if 'X' in mn[i]:
        for j in range(m):
            if mn[i][j] == 'X':
                x.append(j)
for i in range(n):
    if 'X' not in mn[i]:
        cnt += 1
        for j in range(m):
            if j not in x:
                x.append(j)
                break

for k in range(m):
    if k not in x:
        cnt += 1
print(cnt)
'''
for i in range(n):
    if 'X' not in mn[i]:
        cnt += 1
for j in range(m):
    if 'X' not in [mn[i][j] for i in range(n)]:
        cnt2+=1

print(max(cnt, cnt2))
'''

