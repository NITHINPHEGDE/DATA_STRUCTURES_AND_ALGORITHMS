def longest_common_prefix(strings):
    if not strings:
        return ""
    prefix = strings[0]
    for value in strings[1:]:
        while not value.startswith(prefix):
            prefix = prefix[:-1]
            if not prefix:
                return ""
    return prefix


if __name__ == "__main__":
    count = int(input())
    print(longest_common_prefix([input() for _ in range(count)]))
