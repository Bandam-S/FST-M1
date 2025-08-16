import pandas
from pandas import ExcelWriter
data = {
	'FirstName':["Kevin", "Randy", "Lavanya"],
	'LastName':["Shashi", "Kati", "Rithu"],
	'Email':["shah@example.com", "inashK@example.com", "hri.rath@example.com"],
	'PhoneNumber':["4512829158", "8977415581", "9701808035"]
}
 
# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)
 
# Print the dataframe
print(dataframe)
 
# Write the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)
 
# Commit data to the Excel file
writer.close()