# https://course.acciojob.com/idle?question=88c1dab7-4a29-4356-98cb-b7d27c391b28

if __name__ == '__main__':
	str = input()
	result = ""
	word = ""
	
	for i in str:
		if i == " ":
			result = word +" "+result
			word = ""
		else:
			word += i

	result = word + " " + result
	print(result)
