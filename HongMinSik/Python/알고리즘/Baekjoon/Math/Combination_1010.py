def Combination(n, r):
    if n == r or r == 0: return 1
    return Combination(n - 1, r - 1) + Combination(n - 1, r)

print(Combination(29, 13))