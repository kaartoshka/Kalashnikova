def f():
    s = []
    n = int(input("Введите число: "))
    while n!=0:
        s.append(n)
        n = int(input("Введите число: "))
    max = 0
    n = 1
    for i in range(1, len(s)):
        if s[i] == s[i - 1]:
            n += 1
        else:
            if n > max:
                max = n
    if n > max:
        max = n
    print("Наибольшее число подряд идущих элементов, равных друг другу: ", max)
f()
