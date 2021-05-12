import sys
input=sys.stdin.readline
N, M = map(int, input().split())
noHeard = ['' for i in range(N)]
noSeen = ['' for i in range(M)]
nono = []

def binSearch(n, list, target):
    global nono
    end = n-1
    start = 0
    mid = (end + start)//2
    while(end-start>=0):
        if(list[mid] == target):
            nono.append(target)
            break
        elif(list[mid] > target):
            end = mid - 1
        elif(list[mid] < target):
            start = mid + 1
        mid = (end + start)//2

for i in range(N):
    s = input()
    if s[-1] == '\n':
        s = s[:-1]
    noHeard[i] = s
noHeard.sort()
for j in range(M):
    s = input()
    if s[-1] == '\n':
        s = s[:-1]
    noSeen[j] = s
noSeen.sort()
for i in noHeard:
    binSearch(M,noSeen,i)
print(len(nono))
for i in nono:
    print(i)