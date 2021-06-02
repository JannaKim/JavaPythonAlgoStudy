def getParent(net, x):
    if(net[x] == x): return x
    else: 
        net[x] = getParent(net, net[x])
        return net[x]

def unionParent(net, a, b):
    a = getParent(net, a)
    b = getParent(net, b)
    if a < b: net[b] = a
    else: net[a] = b

nums = int(input())
connect = int(input())
net = [i for i in range(nums+1)]

for i in range(connect):
    a, b = map(int, input().split())
    unionParent(net, a, b)

cnt = 0
for i in range(len(net)):
    if(getParent(net, i) == 1): cnt += 1

print(cnt - 1)