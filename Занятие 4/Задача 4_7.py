n = int(input("Введите натуральное число n: "))
def f(n):
    if n >= 0:
        sum = 0
        fact = 1
        for i in range(1, n + 1):
            fact *= i
            sum += fact
        return sum
    else:
        return None
result = f(n)
if result != None:
    print("Сумма факториалов от 1 до", n, "равна:", result)
else:
    print("n должно быть неотрицательным числом.")
