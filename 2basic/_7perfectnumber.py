def perfect(n):
    if n < 2:
        return False
    total = 1
    divisor = 2
    while divisor * divisor <= n:
        if n % divisor == 0:
            total += divisor
            if divisor * divisor != n:
                total += n // divisor
        divisor += 1
    return total == n


if __name__ == "__main__":
    print(perfect(int(input())))
