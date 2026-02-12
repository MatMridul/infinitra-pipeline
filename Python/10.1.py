def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

smallest_multiple = 1
for i in range(1, 11):
    smallest_multiple = lcm(smallest_multiple, i)

print(smallest_multiple)