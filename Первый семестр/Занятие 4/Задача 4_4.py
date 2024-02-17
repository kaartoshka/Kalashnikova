N = int(input("Введите количество чисел: "))
def f():
    if N > 0:
        sum = 0
        for i in range(N):
            n = int(input("Введите число: "))
            sum += n
        return sum
    else:
        return 0
result = f()
print("Сумма чисел равна:", result)
