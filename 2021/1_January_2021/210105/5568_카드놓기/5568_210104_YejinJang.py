def recursive(card, num):
    if card == 1 :
        return
    for i in range(num):
        if arr[i] in pick:
            pass
        else:
            pick[i] = arr[i]
        print(pick)
    '''
    a = str(arr[card-1])
    for i in reversed(range(card-1)):
        b = str(arr[i])
        if (a+b) not in list:
            list.append(a+b)
        if (b+a) not in list:
            list.append(b+a)
    recursive(card-1)
    '''

n = int(input())
k = int(input())
arr = [0 for i in range(n)]
list = []
pick = []
for i in range(n):
    arr[i] = int(input())

recursive(n, k)
print(len(list))
