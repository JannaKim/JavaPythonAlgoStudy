import operator

N = int(5)
stages = [2, 1, 2, 6, 2, 4, 3, 3]
percentage = [i for i in range(N + 2)]
users = int(len(stages))

for i in range(1, N + 2):
    percentage[i] = stages.count(i)

a = {}
for i in range(1, N + 2):
    a[i] = int(percentage[i]) / int(users)
    users -= int(percentage[i])

a = dict(sorted(a.items(), key=operator.itemgetter(1), reverse=True))
answer = []


a.pop
print(a)