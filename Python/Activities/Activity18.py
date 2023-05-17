
import pandas

# Read the CSV file and store it into a DataFrame
dataframe = pandas.read_csv("sample.csv")

# Print the full data
print("Full Data: ")
print(dataframe)

print("===============")
print("Usernames:")
print(dataframe["Usernames"])


print("===============")
print(dataframe["Usernames"][1],"|",dataframe["Passwords"][1])
print(dataframe.sort_values('Usernames'))
print(dataframe.sort_values('Passwords',ascending=False))