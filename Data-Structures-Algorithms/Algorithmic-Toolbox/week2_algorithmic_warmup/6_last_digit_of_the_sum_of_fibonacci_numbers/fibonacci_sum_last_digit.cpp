#include <iostream>
#include <vector>
int fibonacci_sum_naive(long long n)
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
        sum += current;
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

int fibonacci_sum_fast(long long n)
{
    int x = get_fibonacci_huge_fast(n + 2, 10) - 1;
    return (x < 0) ? 10 + x : x;
}

int main()
{
    long long n = 0;
    std::cin >> n;
    std::cout << fibonacci_sum_fast(n);
}
