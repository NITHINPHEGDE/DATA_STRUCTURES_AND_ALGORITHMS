from collections import Counter


def frequency_sort(value):
    counts = Counter(value)
    return "".join(character * count for character, count in
                   sorted(counts.items(), key=lambda item: (-item[1], item[0])))


if __name__ == "__main__":
    print(frequency_sort(input()))
