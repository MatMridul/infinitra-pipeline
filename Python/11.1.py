import numpy as np

array = np.random.randint(1, 101, size=(4, 5))

print("Original array:")
print(array)

sorted_by_row = array[array[1].argsort()]

print("\nArray sorted by the second row:")
print(sorted_by_row)

sorted_by_column = sorted_by_row[:, sorted_by_row[1].argsort()]

print("\nArray sorted by the second column:")
print(sorted_by_column)