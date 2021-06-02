num = []
for i in range(9):
    num.append(input())

large = max(num)
print(large)
print(num.index(large)+1)