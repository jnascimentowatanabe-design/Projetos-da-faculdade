from openai import OpenAI

client = OpenAI()

response = client.responses.create(
    model="gpt-5",
    input="in one sentence, what is CS50?"
)

print(response.output[0].content[0].text)