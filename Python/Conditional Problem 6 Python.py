# https://course.acciojob.com/idle?question=ddcbc33a-2487-4b26-9b0f-754e8c12d0d3

if __name__=='__main__':
    nums = list(map(int, input().split()))
    
    # check if odd
    if nums[0]%2 != 0 and nums[1]%2 != 0:
        print("we are odd")
    else:
        print("we are simple")
