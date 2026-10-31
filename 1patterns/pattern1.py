def pattern(n):
    for _ in range(1, n + 1):
        print("*" * n)


if __name__ == "__main__":
    pattern(int(input()))
