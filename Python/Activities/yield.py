def square(n):
    for i in range(n):
        yield i**2
for num in square(10):
    print(num)