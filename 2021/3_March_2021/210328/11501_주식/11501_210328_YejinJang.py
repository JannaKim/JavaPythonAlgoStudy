import sys
input=sys.stdin.readline
testCase = int(input())
for _ in range(testCase):
    days = int(input())
    mn = list(map(int, input().split()))
    result = 0
    temp = max(0, mn[-1])
    for i in range(days-1, 0, -1):
        #print("i: ",i, "temp: ", temp)
        if temp>mn[i-1]:
            result += temp-mn[i-1]
        temp = max(temp, mn[i-1])
        #print("new temp: ",temp, "result: ", result)
    print(result)
        