N = int(5)
stages = [2, 1, 2, 6, 2, 4, 3, 3]
users = len(stages)
result = {}
for i in range(1, N + 1):
    if users != 0:
        cnt = stages.count(i)
        result[i] = cnt / users
        users -= cnt
    else:
        result[i] = 0

# sorted 함수는 파이썬 내장 함수이다
# iterable 인자를 받아, 새로운 정렬된 리스트로 만들어준다.
# key 옵션을 사용하면 iterable의 어떤 데이터를 기준으로 정렬 할것인지를 결정한다.
# key 옵션에는 값이 들어가는 것이 아니고, 호출가능한 함수가 들어간다.
# - 값을 넘긴다고 정렬이 가능한 것이 아니다. 10을 넘기는 상황을 생각해 보자. 어떤 기준으로 정렬해야할지 사람도 모른다



print(result)

result = sorted(result, key = lambda x : result[x], reverse=True)

print(result)