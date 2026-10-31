def count_digit(n):
    return len(str(abs(n)))


if __name__ == "__main__":
    print(count_digit(int(input())))
