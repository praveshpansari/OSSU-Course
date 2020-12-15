#include <iostream>
#include <vector>
#include <algorithm>
#include <time.h>

long long MaxPairwiseProduct(const std::vector<long long> &numbers)
{
    long long max_product = 0;
    int n = numbers.size();

    for (int first = 0; first < n; ++first)
    {
        for (int second = first + 1; second < n; ++second)
        {
            if (numbers[first] * numbers[second] > max_product)
                max_product = numbers[first] * numbers[second];
        }
    }

    return max_product;
}

long long MaxPairwiseProductFast(const std::vector<long long> &numbers)
{
    int first = 0, second = 0;
    int n = numbers.size();
    for (int i = first; i < n; ++i)
    {
        if (numbers[i] > numbers[first])
        {
            second = first;
            first = i;
        }
        else if (numbers[i] > numbers[second])
            second = i;
    }
    return (long long)(numbers[first] * numbers[second]);
}

int main()
{
    int n;
    std::cin >> n;
    std::vector<long long> numbers(n);
    for (int i = 0; i < n; ++i)
    {
        std::cin >> numbers[i];
    }
    // int max1, max2;
    // while (true)
    // {
    //     n = rand() % 100000000 + 2;

    //     std::vector<long long> numbers(n);

    //     for (int i = 0; i < n; ++i)
    //     {
    //         numbers[i] = rand() % 1000000000 * rand() % 1000000000;
    //     }

    //     clock_t start = clock();
    //     max1 = MaxPairwiseProduct(numbers);
    //     std::cout << "\nNative Execution Time: " << (double)(clock() - start) / CLOCKS_PER_SEC << "s";

    //     start = clock();
    //     max2 = MaxPairwiseProductFast(numbers);
    //     std::cout << "\nFast Execution Time: " << (double)(clock() - start) / CLOCKS_PER_SEC << "s\n";

    //     if (max1 != max2)
    //     {
    //         std::cout << "Error! Results: " << max1 << " " << max2 << "\n";
    //         break;
    //     }
    //     else
    //     {
    //         std::cout << "OK!\n";
    //     }
    // }

    long long result = MaxPairwiseProduct(numbers);
    std::cout << result << "\n";
    return 0;
}
