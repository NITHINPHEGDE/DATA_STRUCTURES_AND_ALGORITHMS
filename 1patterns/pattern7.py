def pattern(n):
    for i in range(1, n + 1):
        print(" " * i + "*" * (2 * (n - i) + 1))


if __name__ == "__main__":
    pattern(int(input()))
