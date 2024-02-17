a = int(input('Введите первое число '))
b = int(input('Введите второе число '))
c = int(input('Введите третье число '))
def f(a,b,c):
    if a==b==c:
        return '3'
    elif a==b or a==c or b==c:
        return '2'
    else:
        return '0'
print (f(a,b,c))
