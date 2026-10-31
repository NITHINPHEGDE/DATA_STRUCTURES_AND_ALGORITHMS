def pattern(n):
    for i in range(1, n + 1):
        print("\t".join(str(j) for j in range(1, i + 1)))


if __name__ == "__main__":
    pattern(int(input()))
