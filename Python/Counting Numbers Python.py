//https://course.acciojob.com/idle?question=113bf26a-f559-459e-a9d5-9dabdcc64184

if __name__ == '__main__':
    N = int(input())
    nums = list(map(int, input().split()))
	
positive=0
negative = 0

# iterate through the array
for i in nums:
	if i > 0:
		positive+=1 # positive number found increase count
	if i<0:
		negative+=1 # negative number found increase count

print(positive,negative)
