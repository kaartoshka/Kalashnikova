def f():
    count = -1
    num = 0
    while True:
        n = int(input("Введите число: "))
        if n == 0:
            break
        if n > num:
            count += 1
        n = num
    return count

count = f()
print('Количество элементов последовательности, больших предыдущего элемента:', count)
