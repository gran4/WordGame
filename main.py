import json, random

# Open and read the JSON file
with open('Spainish.json', 'r') as file:
    data = json.load(file)


# Access the terms in the JSON data
terms = list(data.keys())

while True:
    i = random.randrange(0, len(terms))
    print("What does ", terms[i], " mean?")
    info = input("Answer: ")
    print(data[terms[i]])
    if info != "":
        terms.pop(i)



