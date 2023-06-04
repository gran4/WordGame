import json, random

# Open and read the JSON file
with open('Spainish.json', 'r') as file:
    data = json.load(file)


# Access the terms in the JSON data
terms = list(data.keys())

while terms:
    i = random.randrange(0, len(terms))
    print("Word:", terms[i])
    info = input("Answer: ")
    print(data[terms[i]], "\n")
    if info != "":
        terms.pop(i)
print("FINISHED, You Studied all the words!!!")

