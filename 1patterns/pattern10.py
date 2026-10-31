def pattern(n):
    for i in range(n, 0, -1):
        print("".join(chr(ord("A") + j) for j in range(i)))


if __name__ == "__main__":
    pattern(int(input()))
