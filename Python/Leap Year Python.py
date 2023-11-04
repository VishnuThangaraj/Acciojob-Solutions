# https://course.acciojob.com/idle?question=00950c63-5678-41d2-a824-72c8d632c22b

if __name__=='__main__':
    year=int(input())
    # Write your code here and print the required output
    if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
        print(1)
    else:
        print(0)
