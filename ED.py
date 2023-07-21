# Function to encrypt a message using the Caesar cipher
def encrypt(message, shift):
    encrypted = ""
    for char in message:
        if char.isalpha():
            char_code = ord(char) + shift
            if char.isupper():
                if char_code > ord('Z'):
                    char_code -= 26
                elif char_code < ord('A'):
                    char_code += 26
            elif char.islower():
                if char_code > ord('z'):
                    char_code -= 26
                elif char_code < ord('a'):
                    char_code += 26
            encrypted += chr(char_code)
        else:
            encrypted += char
    return encrypted

# Function to decrypt a message using the Caesar cipher
def decrypt(message, shift):
    decrypted = ""
    for char in message:
        if char.isalpha():
            char_code = ord(char) - shift
            if char.isupper():
                if char_code > ord('Z'):
                    char_code -= 26
                elif char_code < ord('A'):
                    char_code += 26
            elif char.islower():
                if char_code > ord('z'):
                    char_code -= 26
                elif char_code < ord('a'):
                    char_code += 26
            decrypted += chr(char_code)
        else:
            decrypted += char
    return decrypted

# Main program
message = input("Enter the message to be encrypted: ")
shift = int(input("Enter the shift value: "))

encrypted_message = encrypt(message, shift)
print("Encrypted message: " + encrypted_message)

decrypted_message = decrypt(encrypted_message, shift)
print("Decrypted message: " + decrypted_message)
