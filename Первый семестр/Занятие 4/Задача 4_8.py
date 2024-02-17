n = int(input("Введите натуральное число n: "))
def f(n):
    if n>0 and n<=9:
        for i in range(1, n + 1):
            s = ""
            for j in range(1, i + 1):
                s += str(j)
            print(s)
    else:
        print("n должно быть натуральным числом от 1 до 9.")
f(n)
