a =int(input("Введите номер столбца первой клетки: "))
b =int(input("Введите номер строки первой клетки: "))
x =int(input("Введите номер столбца второй клетки: "))
y =int(input("Введите номер сстроки второй клетки: "))
def cvet(a,b,x,y):
    if (a+b)%2 ==0 and(x+y)%2==0:
        return 1
    else:
        return 0
if cvet(a,b,x,y) == 1:
    print ('Да')
else:
    print('Нет')
