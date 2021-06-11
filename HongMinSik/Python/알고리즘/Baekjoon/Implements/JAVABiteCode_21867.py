java = ['J', 'A', 'V']
result = ''

N = int(input())
S = input()

for i in range(N):
    if S[i] in java:
        continue
    result += S[i]

if result != '':
    print(result)
else:
    print('nojava')
