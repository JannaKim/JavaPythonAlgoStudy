import sys
import re
#input=sys.stdin.readline().rstrip("\n")
eq = sys.stdin.readline().rstrip("\n")
#nums = re.split("[+,-]", eq)
#list(map(str, input().re.split('-','+','\n')))
eq = eq.split("-")
result = 0
print(eq)
for i in eq[0].split('+'):
    result += int(i)
for i in eq[1:]:
    for j in i.split('+'):
        result -= int(j)
print(result)

'''
ex) 20+50-39-40+50
1st: ['20+50', '39', '40+50'] ('-' split)
2nd: list[0] 값을 result에 저장(첫 번째 for문)
3rd: list[1:] 돌아가며 더해서 빼기
-> list[1]은 부호 없으니 그냥 int형으로 바뀐 상태로 result -= 39
-> list[2]는 부호 있으니 40과 50으로 쪼개어짐. 각 값을 result에서 뺌. result -= 40, result -=50
'''