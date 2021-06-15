from collections import deque

queue = deque()

for i in range(10):
    queue.append(i)

for i in queue:
    print(i)