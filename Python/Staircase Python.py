# https://course.acciojob.com/idle?question=75644f2d-7329-4a9d-91c6-37e0eb6abdbf

if __name__=='__main__':
    num_stairs = int(input(""))

    n = num_stairs -2
    for stairs in range(1,num_stairs):
        print (' ' * n, '#' * stairs)
        n -= 1
    print ('#' * num_stairs)
            
