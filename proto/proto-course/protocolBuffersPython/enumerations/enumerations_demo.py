from enumerations import enumerations_pb2 as enumpb2

enum_message = enumpb2.EnumMessage()

enum_message.id = 1
enum_message.day_of_week = enumpb2.FRIDAY

print(enum_message)

print(f"Value of Day Of The Week is: {enum_message.day_of_week}")


with open("sample_enum.bin", "wb") as file:
    bytesAsString = enum_message.SerializeToString()
    file.write(bytesAsString)

with open("sample_enum.bin", "rb") as file:
    print("Read Values")
    enum_message_read = enumpb2.EnumMessage().FromString(file.read())

print(enum_message_read)