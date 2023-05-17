# Define function to calculate sum
def calculateSum(num):
    if num:
        # Recursive function call
        calculate=calculateSum(num-1)
        print(calculate)
        print(num)

        return num + calculate
    else:
        return 0

# Call calculateSum() function
res = calculateSum(10)

# Print result
print(res)