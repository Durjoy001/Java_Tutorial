 * A class should always start with an uppercase first letter. Java is case-sensitive: "MyClass" and "myclass" has different meaning.
The name of the java file must match the class name. When saving the file, save it using the class name and add ".java" to the end of the filename.

# Data types are divided into two groups:
    Primitive data types - includes byte(1 byte), short(2 bytes), int(4 bytes), long(8 bytes), float(4 bytes), double(8 bytes), boolean(1 bit) and char(2 bytes)
    Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

# Use float or double?
    The precision of a floating point value indicates how many digits the value can have after the decimal point. 
    The precision of float(4 bytes) is only six or seven decimal digits, while double(8 bytes) variables have a precision of about 15 digits. 
    Therefore it is safer to use double for most calculations. 
    
# Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.
In Java, there are two types of casting:

    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte 
