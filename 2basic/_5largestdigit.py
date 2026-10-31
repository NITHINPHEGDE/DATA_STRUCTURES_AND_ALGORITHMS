def largest(n):
    return max(int(digit) for digit in str(abs(n)))


if __name__ == "__main__":
    print(largest(int(input())))
