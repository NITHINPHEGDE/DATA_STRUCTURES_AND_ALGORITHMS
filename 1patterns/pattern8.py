def pattern(n):
    for i in range(1, n + 1):
        print(" ".join(str(1 if (i + j) % 2 == 0 else 0) for j in range(1, i + 1)))


if __name__ == "__main__":
    pattern(int(input()))
