# https://course.acciojob.com/idle?question=1cb6b803-6d15-4db2-a306-72fb97da1cf8

if __name__ == "__main__":
    start, end = map(int, input().split())
    #Your code here
for i in range(start, end+1):
	if i % 2 != 0:
		print(i, end=" ");
