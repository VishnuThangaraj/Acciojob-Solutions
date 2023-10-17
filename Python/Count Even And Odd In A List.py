# https://course.acciojob.com/idle?question=27574619-51b7-4938-b26e-9741e96845ef

if __name__ == "__main__":
	len = int(input())
	num_list = list(map(int, input().split()))
	odd, even = 0, 0

	for num in num_list:
		if num % 2 == 0:
			even += 1
		else:
			odd += 1

	print(even)
	print(odd)
	
