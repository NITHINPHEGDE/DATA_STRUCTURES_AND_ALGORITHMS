def prime(n):
    if n <= 1:
        return False
    divisor = 2
    while divisor * divisor <= n:
        if n % divisor == 0:
            return False
        divisor += 1
    return True


if __name__ == "__main__":
    print(prime(int(input())))
