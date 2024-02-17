N = int(input("Введите количество чисел из ряда Фибоначчи: "))
K = int(input("Введите порядковый номер, с которого нужно начать: "))
def f(N, K):
    p = 0
    c = 1
    count = 0
    sum = 0
    while count < N:
        if count >= K:
            sum += c
        num = p + c
        p = c
        c = num
        count += 1
    return sum
result = f(N, K)
print("Сумма чисел:", result)
