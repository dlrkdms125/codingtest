n = int(input())
numbers = []

for i in range(n):
    num = int(input())
    numbers.append(num)

numbers.sort()

for num in numbers:
    print(num)
	