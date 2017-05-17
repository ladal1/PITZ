import itertools

while True:
    try:
        N = int(input("Jak velké pole?\n"))
        if N < 1:
            raise ValueError
        else:
            break
    except ValueError:
        print("dej mi celé číslo")

sloup = range(N)
pocet = 0


def prettyprint(vektor):
    print("\n".join('.' * i + 'Q' + '.' * (N-i-1) for i in vektor) + "\n" + "".join("-" * N) + "\n")

for vec in itertools.permutations(sloup):
    if N == len(set(vec[i] + i for i in sloup)) == len(set(vec[i] - i for i in sloup)):
        pocet += 1
        prettyprint(vec)

print("Existuje " + str(pocet) + " řešení")
