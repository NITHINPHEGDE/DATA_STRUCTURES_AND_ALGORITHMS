def pattern(n):
    for i in range(1, n + 1):
        left = "".join(str(j) for j in range(1, i + 1))
        right = "".join(str(j) for j in range(i, 0, -1))
        print(left + " " * (2 * (n - i)) + right)


if __name__ == "__main__":
    pattern(int(input()))
