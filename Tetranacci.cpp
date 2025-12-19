/*
 *
 * @author  Giordan Zeina
 * @version 1.3
 * @since   2025-12-10
 */

#include <iostream>
#include <limits>
#include <exception>

/**
 * Recursive function to calculate the nth Tetranacci term.
 * @param n the index of the Tetranacci number
 * @return the nth Tetranacci number
 */
int tetranacci(int n) {
    if (n == 0 || n == 1 || n == 2) {
        return 0;
    } else if (n == 3) {
        return 1;
    } else {
        return tetranacci(n - 1) + tetranacci(n - 2) + tetranacci(n - 3) + tetranacci(n - 4);
    }
}

/**
 * Generates and prints the first 'count' Tetranacci numbers.
 * @param count number of Tetranacci numbers to generate
 */
void generateTetranacciSequence(int count) {
    std::cout << "Tetranacci sequence:\n";
    for (int i = 0; i < count; i++) {
        std::cout << tetranacci(i) << " ";
    }
    std::cout << std::endl;
}

/**
 * Gets the input from user
 */
int main() {
    int num;

    try {
        std::cout << "Enter how many Tetranacci numbers to generate: ";
        if (!(std::cin >> num)) {
            throw std::runtime_error("Invalid input! Please enter an integer.");
        }

        if (num <= 0) {
            std::cout << "Please enter a positive integer." << std::endl;
        } else {
            generateTetranacciSequence(num);
        }
    } catch (const std::exception& e) {
        std::cout << e.what() << std::endl;
    }

    return 0;
}
