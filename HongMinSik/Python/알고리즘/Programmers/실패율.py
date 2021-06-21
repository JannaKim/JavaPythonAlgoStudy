N = int(5)
stages = [2, 1, 2, 6, 2, 4, 3, 3]
members = len(stages)

result = []
cnt = 0
for i in range(1, N + 2):
    for j in range(len(stages)):
        if i == stages[j]:
            cnt = stages.count(stages[j])
            result.append(str(cnt) + '/' + str(members))
            members -= int(cnt)
            break

print(result)