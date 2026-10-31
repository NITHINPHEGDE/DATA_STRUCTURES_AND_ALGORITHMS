def odddigit(n):
    return sum(int(digit) % 2 for digit in str(abs(n)))


if __name__ == "__main__":
    print(odddigit(int(input())))
