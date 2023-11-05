n = int(input("Введите натуральное число n: "))
def f(n):
    if n >= 0:
        fact = 1
        for i in range(2, n + 1):
            fact *= i
        return fact
    else:
        return None
result = f(n)
if result != None:
    print("Факториал числа", n, "равен:", result)
else:
    print("n должно быть неотрицательным числом.")
