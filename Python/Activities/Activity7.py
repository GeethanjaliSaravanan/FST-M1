import int as int




numbers=list(input("Enter the comma seperated values").split(", "))
sum=0;
for number in numbers:
    sum += int(number)

print(sum)