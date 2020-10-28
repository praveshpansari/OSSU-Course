def is_even(p):
    sign = 0;
    index = 0;
    while(index < len(p)):
        count = index + 1;
        while(count < len(p)):
            if(p[count] < p[index]):
                temp = p[index];
                p[index] = p[count];
                p[count] = temp;
                sign+=1
            count+=1
        index+=1
    return sign % 2 == 0;