import numpy as np 

# Create a NumPy array
data = ([1, 2, 3, 4, 5])

# Print the original array
print("Original array:")
print(data)

# Perform element-wise operations
squared = data* 2
print("\nSquared array:")
print(squared)

# Calculate the mean and standard deviation
mean = np.mean(data)
std_dev = np.std(data)

print("\nMean of the array:", mean)
print("Standard deviation of the array:", std_dev)