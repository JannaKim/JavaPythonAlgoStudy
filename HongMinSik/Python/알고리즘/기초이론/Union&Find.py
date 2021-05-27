def getParent(parent, x):
    if(parent[x] == x): # union 된다면 list index와 원소값은 다를 것이다.
        return x
    parent[x] = getParent(parent, parent[x])
