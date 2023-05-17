import pandas as pandas
dataframe=pandas.read_csv('C:\\Users\\0046EP744\\IdeaProjects\\FST_Python\\venv\\Scripts\\employee.csv')
print(dataframe)
print(dataframe["Name"][2])

data={
    "Vehicle Type": ["Car", "Car", "Bike"],
    "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
    "Model": ["Swift", "Corolla", "Thunderbird"]
}
dataframe=pandas.DataFrame(data)
dataframe.to_csv("vehicle.csv")