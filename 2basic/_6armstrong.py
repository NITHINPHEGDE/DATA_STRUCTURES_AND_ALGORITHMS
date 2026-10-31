def armstrong(n):
    digits = str(abs(n))
    return n >= 0 and n == sum(int(digit) ** len(digits) for digit in digits)


if __name__ == "__main__":
    print(armstrong(int(input())))
