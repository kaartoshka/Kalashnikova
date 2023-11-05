import math
s1 = float(input("Введите длину первой стороны: "))
s2 = float(input("Введите длину второй стороны: "))
s3 = float(input("Введите длину третьей стороны: "))
s4 = float(input("Введите длину четвертой стороны: "))
diagonal = float(input("Введите длину диагонали: "))
def f(a, b, c, d, diagonal):
    s = (a + b + c + d) / 2
    otv = math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - 0.25 * (a * c + b * d - diagonal**2)**2)
    return otv
otv = f(s1, s2, s3, s4, diagonal)
print("Площадь четырехугольника:", otv)
