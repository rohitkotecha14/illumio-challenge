# Take-Home Coding Assessment for Illumio


## Prerequisites
- Java Development Kit (JDK) installed
- Terminal or command line access

## Steps to Download and Extract the Project

1. **Download the Zip File**
   - Download the project zip file.

2. **Extract the Zip File**
   ```sh
   unzip illumio-challenge-main.zip

1. **Navigate to the Project Directory**
   ```sh
   cd path/to/illumio-challenge-main
2. **Compile the Java Files**
   ```sh
   javac -d out src/*.java
3. **Run the Program**
   ```sh
   java -cp out Main resources/input.txt resources/words.txt resources/output.txt
4. **View the Output**
   ```sh
   cat resources/output.txt

## Input Files
- **input.txt**: Contains the text to be analyzed. (Crowdsourced dataset of the first sentences of novels)
- **words.txt**: Contains the predefined words to match against.

## Output File
- **output.txt**: Contains the match counts for each predefined word.

## Assumptions
- The input text file and predefined words file are properly formatted.
- Predefined words are unique and do not contain duplicates.


## Notes
- Ensure the paths to the input and output files are correct when running the program.
- The program handles case-insensitivity and punctuation removal (excluding apostrophes within words).
