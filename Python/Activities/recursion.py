# Calculate the sum of numbers
# using recursion
def sum(n):
    if n <= 1:
        return n
    else:
        num=sum(n-1)
        print(num)
        print(n)
        return n + num

num = int(input("Enter a number: "))
print("The sum is: ", sum(num))