from assignment import addressbook_pb2 as addresspb2


def generate_address_entry(person, id, name, email, phoneNumberDetails=None):
    if phoneNumberDetails is None:
        phoneNumberDetails = []

    if email is None:
        email = ""

    person.id, person.name, person.email = id, name, email

    for detail in phoneNumberDetails:
        phone_number = person.phones.add()
        phone_number.number = detail["number"]
        if detail["type"] == "Mobile":
            phone_number.type = addresspb2.Person.PhoneType.MOBILE
        elif detail["type"] == "Home":
            phone_number.type = addresspb2.Person.PhoneType.HOME
        elif detail["type"] == "Work":
            phone_number.type = addresspb2.Person.PhoneType.WORK
        else:
            print("Unknown Value, using defaults.")


def run():
    address_book = addresspb2.AddressBook()

    generate_address_entry(
        address_book.people.add(),
        1,
        "John",
        "john.example@example.com",
        [
            {"number": "332141412", "type": "Home"},
            {"number": "566755674", "type": "Mobile"},
            {"number": "783465579", "type": "Work"},
        ],
    )

    print("Address Book: ")
    print(address_book)


if __name__ == "__main__":
    run()
