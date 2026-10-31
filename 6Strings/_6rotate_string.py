def rotate_string(value, goal):
    return len(value) == len(goal) and goal in value + value


if __name__ == "__main__":
    print(rotate_string(input(), input()))
