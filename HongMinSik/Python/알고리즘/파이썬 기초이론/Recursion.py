def hello(count):
    if count == 0: return
    print('Hello, World!', count)
    hello(count - 1)

hello(5)