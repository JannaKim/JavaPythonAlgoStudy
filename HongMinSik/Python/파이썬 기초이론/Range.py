# for i in range(100) : range(100)은 숫자 100개를 생성하는 객체이다
# range(5, 10) : 숫자를 5~9까지 생성한다

print(range(5, 10)) # range(5, 10) 객체를 생성함
a = list(range(5, 10)) # 5~9까지의 숫자를 리스트로 받는다
print(a)

a = list(range(0, 10, 2)) # 0~10까지의 숫자를 2 증가시키며 리스트로 받는다
print(a)

# range(10, 0) : 10~0으로 하는 것 처럼 보이나, 실제로 불가능
# range(10, 0, -1) : 음수로 감소시키면 가능, reversed함수를 이용하여 감소시키는 것도 가능하다

for i in "Python":
    print(i, end = " ")

