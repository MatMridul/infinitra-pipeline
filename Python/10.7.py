salary_scale = [20000, 21500, 23000, 24500, 26000, 27500, 29000]
for i in range(len(salary_scale)):
    salary_scale[i] += salary_scale[i] * 0.03
print(salary_scale)