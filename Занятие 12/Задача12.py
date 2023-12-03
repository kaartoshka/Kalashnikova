x = 99
y = 4
def recursive_mod(a, b):
    if a < b:
        return a
    else:
        return recursive_mod(a - b, b)
print(recursive_mod(x,y))

def max_value():
    maxx = 0
    a = int(input())
    while a != 0:
        if a > maxx:
            maxx = a
        a = int(input())
    return maxx

print(max_value())
