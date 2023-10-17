# https://course.acciojob.com/idle?question=55836357-6422-430d-8ecd-aa58bb06fad7

if __name__ == '__main__':
	n,d = map(int,input().split())
	#your code here
	count = 0
	while n > 0:
		if n%10 == d:
			count += 1 # digit found
		n = int(n / 10)
	print(count)
