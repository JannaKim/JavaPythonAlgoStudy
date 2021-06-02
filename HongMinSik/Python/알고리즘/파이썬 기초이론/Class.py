class Calculator:
    def __init__(self, a, b): # 생성자
        self.a = a
        self.b = b
    '''
    def setData(self, a, b):
        self.a = a
        self.b = b
    생성자가 존재하면 setter는 불필요
    '''
    def add(self):
        result = self.a + self.b
        return result
    
    def sub(self):
        result = self.a - self.b
        return result
    
    def product(self):
        result = self.a * self.b
        return result
    
    def division(self):
        result = self.a / self.b
        return result

a = Calculator(4, 2)
print(a.a)
print(a.b)