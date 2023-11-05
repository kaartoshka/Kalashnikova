def f():
    count = 0
    while True:
        n = int(input("Введите число: "))
        if n == 0:
            break
        count += 1
    return count
count = f()
print('Количество членов последовательности (не считая завершающего числа 0):',count)
