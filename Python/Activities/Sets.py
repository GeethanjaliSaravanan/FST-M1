example_set = {"apple", "banana", "cherry"}

example_set.remove("banana")

example_set.discard("cherry")
example_set.discard("banana")

example_set = set(("apple", "banana", "cherry")) # note the double round-brackets
print(example_set)