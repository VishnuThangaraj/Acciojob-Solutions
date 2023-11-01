# https://course.acciojob.com/idle?question=18a4f51f-be92-4357-9691-6c99f122da2b

if __name__ == "__main__":
    start, end = map(int, input().split())
    #Your code here
    for i in range(int(start), int(end+1)):
        if i%2 == 0:
            print(i, end=" ")
    print()
