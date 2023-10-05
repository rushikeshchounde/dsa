#include <iostream>
#include <fstream>
#include <string>

int main() {
    std::ifstream inputFile("input.txt"); // Open a file for reading
    if (!inputFile) {
        std::cerr << "Error: Could not open the file." << std::endl;
        return 1; // Exit with an error code
    }

    std::string line;
    int totalLines = 0;
    while (std::getline(inputFile, line)) {
        totalLines++;
        // Process each line here
        std::cout << "Line " << totalLines << ": " << line << std::endl;
    }

    inputFile.close(); // Close the file

    std::cout << "Total lines read: " << totalLines << std::endl;
    return 0;
}
