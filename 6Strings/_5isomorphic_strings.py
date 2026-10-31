def is_isomorphic(first, second):
    if len(first) != len(second):
        return False
    first_map = {}
    second_map = {}
    for left, right in zip(first, second):
        if first_map.get(left, right) != right or second_map.get(right, left) != left:
            return False
        first_map[left] = right
        second_map[right] = left
    return True


if __name__ == "__main__":
    print(is_isomorphic(input(), input()))
