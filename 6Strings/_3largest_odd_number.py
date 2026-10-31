def largest_odd_number(num):
    for index in range(len(num) - 1, -1, -1):
        if int(num[index]) % 2:
            return num[:index + 1]
    return ""


if __name__ == "__main__":
    print(largest_odd_number(input()))
