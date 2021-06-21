def Combination(n, r):
    if n == r or r == 0: return
    return Combination(n - 1, r - 1) + Combination(n - 1, r)