import simple.simple_pb2 as simple_pb2

simple_message = simple_pb2.SimpleMessage()

simple_message.id = 123
simple_message.is_simple = True
simple_message.name = "This is a simple message"
sample_list = simple_message.sample_list
sample_list.append(3)
sample_list.append(4)
sample_list.append(5)

print(simple_message)


with open("sample.bin", "wb") as file:
    bytesAsString = simple_message.SerializeToString()
    file.write(bytesAsString)

with open("sample.bin", "rb") as file:
    print("Read Values")
    simple_message_read = simple_pb2.SimpleMessage().FromString(file.read())

print(simple_message_read)
print(f"Is Simple?: {simple_message_read.is_simple}")
