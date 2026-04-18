fibonacci_start = 0
fibonacci_next = 1
fibonacci_sequence = []
for i in range(20):
    fibonacci_sequence.append(fibonacci_start)
    fibonacci_start, fibonacci_next = fibonacci_next, fibonacci_start + fibonacci_next

print(fibonacci_sequence)
