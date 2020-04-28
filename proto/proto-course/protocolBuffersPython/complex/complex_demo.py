from complex import complex_pb2 as complexpb2

complex_message = complexpb2.ComplexMessage()

# Creating Static Field
complex_message.one_dummy.id = 123
complex_message.one_dummy.name = "This is a dummy message"
# Adding to Repeated Field
complex_message.multiple_dummy.add(id=345, name="This is the first multiple dummy message")
complex_message.multiple_dummy.add(id=456, name="This is the second multiple dummy message")
complex_message.multiple_dummy.add(id=567, name="This is the third multiple dummy message")

print(complex_message)

