#include <iostream>
#include <vector>
int fibonacci_sum_squares_naive(long long n)
{
    if (n <= 1)
        return n;

    long long previous = 0;
    long long current = 1;
    long long sum = 1;

    for (long long i = 0; i < n - 1; ++i)
    {
        long long tmp_previous = previous;
        previous = current;
        current = tmp_previous + current;
        sum += current * current;
    }

    return sum % 10;
}

long long get_fibonacci_huge_fast(long long n, long long m)
{
    long long prev = 0;
    long long current = 1;

    std::vector<int> periods;
    periods.push_back(0);
    periods.push_back(1);
    for (int i = 0; i < m * m; ++i)
    {

        long long temp = prev;
        prev = current;
        current = (temp + prev) % m;

        if (prev == 0 && current == 1)
        {
            periods.pop_back();
            break;
        }

        periods.push_back(current);
    }

    return periods[n % periods.size()];
}

long long fibonacci_sum_squares_fast(long long n)
{
    if (n <= 1)
        return n;

    return (get_fibonacci_huge_fast(n + 1, 10) * get_fibonacci_huge_fast(n, 10)) % 10;
}

int main()
{
    long long n = 0;
    std::cin >> n;
    std::cout << fibonacci_sum_squares_fast(n);
}
