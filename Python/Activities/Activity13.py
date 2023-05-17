def calculate_sum(numbers):
    sum = 0
    for num in numbers:
       sum+=num
       return sum


numlist=[10,20,30,40]
result = calculate_sum(numlist)
print(result)