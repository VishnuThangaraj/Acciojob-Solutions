# https://course.acciojob.com/idle?question=07712837-1a30-4e31-a0b0-0c246d0d09dc

if __name__=='__main__':
    n=int(input())
    nums = list(map(int, input().split()))

    sum = 0

    # calculate the sum
    for num in nums:
        sum += num

    for num in nums:
        print(sum - num, end=" ")
