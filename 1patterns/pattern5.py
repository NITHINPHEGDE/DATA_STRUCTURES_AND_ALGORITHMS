def pattern(n):
    for i in range(1, n + 1):
        print("*" * (n - i + 1))


if __name__ == "__main__":
    pattern(int(input()))
