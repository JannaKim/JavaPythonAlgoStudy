def getParent(list, x):
    if(list[x] == x): return x
    else:
        list[x] = getParent(list, list[x])
        return list[x]

def unionParent(list, a, b):
    a = getParent(list[x], a)
    b = getParent(list[x], b)
    if(a > b): list[a] = b
    else: list[b] = a 