def pattern(n):
    for i in list(range(n, 0, -1)) + list(range(1, n + 1)):
        print("*" * i + " " * (2 * (n - i)) + "*" * i)


if __name__ == "__main__":
    pattern(int(input()))
