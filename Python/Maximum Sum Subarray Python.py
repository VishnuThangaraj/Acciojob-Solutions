# https://course.acciojob.com/idle?question=0a96117f-9eb4-40b4-8f19-a715a21069e0

if __name__ == "__main__":
	size = int(input())
	arr = list(map(int, input().split()))

	# find the maximum subarray
	sum, result = 0, 0

	for num in arr:
		sum += num
		if sum < 0:
			sum = 0
		# update the result
		result = max(result, sum)

	print(result)
