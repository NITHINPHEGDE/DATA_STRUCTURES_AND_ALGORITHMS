def pattern(n):
    for i in range(1, n + 1):
        increasing = "".join(chr(ord("A") + j) for j in range(i))
        decreasing = "".join(chr(ord("A") + j) for j in range(i - 2, -1, -1))
        print(" " * (n - i) + increasing + decreasing)


if __name__ == "__main__":
    pattern(int(input()))
