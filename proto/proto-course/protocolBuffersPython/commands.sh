protoc -I=simple/ --python_out=simple/ simple/simple.proto
protoc -I=enumerations/ --python_out=enumerations/ enumerations/enumerations.proto
protoc -I=complex/ --python_out=complex/ complex/complex.proto
protoc -I=assignment/ --python_out=assignment/ assignment/addressbook.proto